package queue.intQueue;

public class IntQueue {

    int[] queue;
    int front = -1;
    int rear = -1;
    int maxSize;
    int currentSize = 0;

    public IntQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
    }

    public boolean isEmpty(){
        return (currentSize == 0);
    }

    public boolean isFull(){
        return (currentSize == maxSize);
    }

    // dodanie elementu do kolejki
    public void enqueue(int elem) throws QueueException {
        if(isFull()){
            throw new QueueException("Queue is full!");
        }
        if(isEmpty()){
            front = increment(front);
        }
        rear = increment(rear);
        queue[rear] = elem;
        currentSize++;
    }

    //usunięcie elementu z kolejki
    public int dequeue() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Queue is empty!");
        }
        currentSize--;
        int elem = queue[front];
        front = increment(front);

        if(isEmpty()){
            rear = increment(rear);     // po usunięciu ostatniego elementu przesuwamy wskaźnik z końca
        }
        return elem;
    }


    public int peek() throws QueueException {
        if (isEmpty()){
            throw new QueueException("Queue is empty!");
        }
        return queue[front];
    }

    public int increment(int i){
        if(i == queue.length-1){
            i = 0;
        }else {
            i++;
        }
        return i;
    }
}
