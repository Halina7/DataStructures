package list.twoDirectionsList;

public class TwoDirectionsList<T> {
    NodeTwo<T> head = null;
    NodeTwo<T> tail = null;

    public boolean isEmpty(){
        return (head == null);
    }

    public void append(T value){
        NodeTwo <T> node = new NodeTwo<>(value);
        if(isEmpty()){
            head = node;
            tail = node;
            return;
        }
        tail.setNext(node);
        node.setPrev(tail);
        tail = node;
    }

    public NodeTwo<T> search(T value) {
        if(isEmpty()){
            return null;
        }
        NodeTwo<T> current = head;
        while (current != null){
            if(current.getValue().equals(value)){
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public NodeTwo<T> reverseSearch(T value) {
        if(isEmpty()){
            return null;
        }
        NodeTwo<T> current = tail;
        while (current != null){
            if(current.getValue().equals(value)){
                return current;
            }
            current = current.getPrev();
        }
        return null;
    }

    public void insert(T value, int index){
        NodeTwo<T> node = new NodeTwo<>(value);

        if(index == 0){
            node.setNext(head);
            head.setPrev(node);
            head = node;
            return;
        }
        NodeTwo<T> current = head;
        int i = 0;
        while (((i + 1) != index) && (current.getNext() != null)) {
            current = current.getNext();
            i++;
        }
        if(current.getNext() != null){
            current.getNext().setPrev(node);
        }
        node.setNext(current.getNext());
        node.setPrev(current);
        current.setNext(node);
    }

    public void delete(T value) {
        NodeTwo<T> nodeToDelete;

        if(isEmpty()){
            return;
        }
        if (head.getValue().equals(value)) {
            nodeToDelete = head;
            if(head.getNext() != null){
                head.getNext().setPrev(null);
            }
            head = head.getNext();
            nodeToDelete.setNext(null);
            return;
        }
        if (tail.getValue().equals(value)) {
            nodeToDelete = tail;
            tail.getPrev().setNext(null);
            tail = tail.getPrev();

            nodeToDelete.setPrev(null);
            return;
        }
        NodeTwo<T> current = head;
        while (current.getNext() != null) {
            if (current.getNext().getValue().equals(value)) {
                nodeToDelete = current.getNext();
                current.setNext(nodeToDelete.getNext());
                current.getNext().setPrev(current);

                nodeToDelete.setNext(null);
                nodeToDelete.setPrev(null);
                return;
            }
            current = current.getNext();
        }
        System.out.println("There wasn't element " + value + " on list");
    }
}
