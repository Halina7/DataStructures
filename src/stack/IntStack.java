package stack;

public class IntStack {
    int[] stack;
    int maxSize;
    int top = -1;

    public IntStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void push(int element) throws StackException {
        if(isFull()){
            throw new StackException("Stack is full!!!");
        }
        stack[++top] = element;
    }

    //zdjęcie elementu ze stosu
    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return (stack[top--]);
    }

    //sprawdzenie ostatniego elementu na stosie
    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Stack is empty");
        }
        return (stack[top]);
    }
}
