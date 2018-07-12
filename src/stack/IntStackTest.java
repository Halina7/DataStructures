package stack;

public class IntStackTest {

    public static void main(String[] args){
        IntStack stack = new IntStack(30);

        try{
            stack.push(23);
            stack.push(45);
            stack.push(18);
            stack.push(78);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            //   stack.pop();
        }catch (StackException e){
            e.printStackTrace();
        }
    }
}
