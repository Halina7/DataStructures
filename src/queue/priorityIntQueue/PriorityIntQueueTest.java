package queue.priorityIntQueue;

import queue.intQueue.QueueException;

public class PriorityIntQueueTest {
    public static void main(String[] args){
        PriorityIntQueue priorityQueue = new PriorityIntQueue(10);
        try {
            priorityQueue.enqueue(12);
            priorityQueue.enqueue(67);
            priorityQueue.enqueue(56);
            System.out.println("Dequeued: " + priorityQueue.dequeue());
            System.out.println("Dequeued: " + priorityQueue.dequeue());
            System.out.println("Peeked: " + priorityQueue.peek());
            priorityQueue.enqueue(23);
            priorityQueue.enqueue(7);
            System.out.println("Dequeued: " + priorityQueue.dequeue());
        } catch (QueueException e) {
            e.printStackTrace();
        }
    }
}
