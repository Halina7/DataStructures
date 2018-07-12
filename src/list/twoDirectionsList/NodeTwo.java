package list.twoDirectionsList;

public class NodeTwo <T>{

    private T value;
    private NodeTwo<T> prev = null;
    private NodeTwo<T> next = null;

    public NodeTwo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeTwo<T> getPrev() {
        return prev;
    }

    public void setPrev(NodeTwo<T> prev) {
        this.prev = prev;
    }

    public NodeTwo<T> getNext() {
        return next;
    }

    public void setNext(NodeTwo<T> next) {
        this.next = next;
    }
}
