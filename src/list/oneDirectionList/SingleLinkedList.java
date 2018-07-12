package list.oneDirectionList;

public class SingleLinkedList <T> {
    Node<T> head = null;

    public boolean isEmpty(){
        return (head == null);
    }

    public void append(T value){
        Node<T> node = new Node<T>(value);
        if(isEmpty()){
            head = node;
            return;
        }
        Node<T> current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(node);
    }

    public Node<T> search(T value){
        if(isEmpty()){
            return null;
        }
        Node<T> current = head;
        while (current != null){
            if(current.getValue().equals(value)){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void insert(T value, int index){
        Node<T> node = new Node<>(value);
        if(index == 0){
            node.setNext(head);
            head = node;
            return;
        }
        Node<T> current = head;
        int i = 0;
        while (((i + 1) != index) && (current.getNext() != null)) {
            current = current.getNext();
            i++;
        }
        node.setNext(current.getNext());
        current.setNext(node);
    }

    public void delete(T value){
        Node<T> nodeToDelete;
        if(isEmpty()){
            return;
        }
        if(head.getValue().equals(value)){
            nodeToDelete = head;
            head = head.getNext();
            nodeToDelete.setNext(null);
            return;
        }
        Node<T> current = head;
        while ((current.getNext() != null)) {
            if(current.getNext().getValue().equals(value)){
                nodeToDelete = current.getNext();
                current.setNext(nodeToDelete.getNext());
                nodeToDelete.setNext(null);
                return;
            }
            current = current.getNext();
        }
        System.out.println("There wasn't element " + value + " on list");
    }
}
