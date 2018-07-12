package queue.genericQueue;

import queue.intQueue.QueueException;

public class GenericListQueueTest {
    public static void main(String[] args) {
        GenericListQueue<Integer> listQueue = new GenericListQueue<>(null,null);
        try{
            listQueue.enqueue(45);
            listQueue.enqueue(23);
            listQueue.enqueue(10);
            System.out.println("Dequed: " + listQueue.dequeue());
            listQueue.enqueue(8);
            listQueue.enqueue(2);
            System.out.println("Peeked: " + listQueue.peek());
            System.out.println("Dequed: " + listQueue.dequeue() + " Last element in list: " + listQueue.rear.getValue());
        }catch (QueueException e){
            e.printStackTrace();
        }
    }
}
