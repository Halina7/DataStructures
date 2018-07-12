package queue.priorityIntQueue;
import queue.intQueue.QueueException;

// Kolejka priotytetowa:
// Priorytet elementu określany jest na podstawie wartości elementu - im większa wartość, tym większy priorytet.
// Nowe elementy dodawane są na koniec kolejki, zwracane są elementy największe

public class PriorityIntQueue {
    int[] queue;
    int maxSize;
    int currentSize = 0;

    public PriorityIntQueue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
    }

    public boolean isEmpty(){
        return (currentSize == 0);
    }

    public boolean isFull(){
        return (currentSize == maxSize);
    }

    public void enqueue(int elem) throws QueueException {
        if(isFull()){
            throw new QueueException("Queue is full!");
        }
        queue[currentSize++] = elem;
    }

    public int dequeue() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Queue is empty!");
        }
        int maxElemIndex = 0;
        for (int i = 1; i < currentSize; i++) {
            if(queue[i] > queue[maxElemIndex]){
                maxElemIndex = i;
            }
        }
        int result = queue[maxElemIndex];
        queue[maxElemIndex] = queue[--currentSize];

        return result;
    }

    public int peek() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Queue is empty!");
        }
        int maxElemIndex = 0;
        for (int i = 1; i < currentSize; i++) {
            if(queue[i] > queue[maxElemIndex]){
                maxElemIndex = i;
            }
        }
        return queue[maxElemIndex];
    }
}
