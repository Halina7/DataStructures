package list.oneDirectionList;

public class SingleLinkedListTest {

    public  static void printList(SingleLinkedList<Integer> list ){
        StringBuilder sb = new StringBuilder();
        Node<Integer> current = list.head;
        while (current != null){
            sb.append(current.getValue()).append(" ");
            current = current.getNext();
        }
        sb.toString();
        System.out.println(sb);
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        list.append(23);
        list.append(17);
        list.append(28);
        printList(list);

        list.insert(123, 2);
        printList(list);

        list.delete(2);
        printList(list);

        System.out.println(list.head.getValue() + "  " + list.search(123).getValue());

    }
}
