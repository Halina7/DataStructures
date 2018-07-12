package queue.intQueue;

public class IntQueueTest {
    public static void main(String[] args){
        IntQueue queue = new IntQueue(10);
        try {
            queue.enqueue(3);
            queue.enqueue(16);
            queue.enqueue(12);
            System.out.println("Wychodzący element kolejki: " + queue.peek());
            queue.dequeue();
            queue.dequeue();
            System.out.println("Czy kolejka jest pusta? " + queue.isEmpty());
            System.out.println("Wychodzący element kolejki: " + queue.peek());
            queue.enqueue(56);
            queue.enqueue(23);
            System.out.println("Wychodzący element kolejki: " + queue.dequeue());
            System.out.println("Wychodzący element kolejki: " + queue.dequeue());
        }catch (QueueException e){
            e.printStackTrace();
        }
    }
}
