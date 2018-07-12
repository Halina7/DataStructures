package queue.genericQueue;

import list.oneDirectionList.Node;
import queue.intQueue.QueueException;

public class GenericListQueue<T> {
    Node<T> front = null;
    Node<T> rear = null;

    public GenericListQueue(Node<T> front, Node<T> rear) {
        this.front = front;
        this.rear = rear;
    }

    public boolean isEmpty(){
        return (front == null);
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.setNext(newNode);
        rear = newNode;
    }

    public T dequeue() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Queue is empty!");
        }
        Node<T> nodeToDelete = front;
        front = front.getNext();
        nodeToDelete.setNext(null);
        if(isEmpty()){
            rear = null;
        }
        return nodeToDelete.getValue();
    }

    public T peek() throws QueueException {
        if(isEmpty()){
            throw new QueueException("Queue is empty!");
        }
        return (front.getValue());
    }
}
