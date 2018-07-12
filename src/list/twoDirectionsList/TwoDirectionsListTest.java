package list.twoDirectionsList;

public class TwoDirectionsListTest {

    public  static void printList(TwoDirectionsList<Integer> list ){
        StringBuilder sb = new StringBuilder();
        NodeTwo<Integer> current = list.head;
        while (current != null){
            sb.append(current.getValue()).append(" ");
            current = current.getNext();
        }
            sb.toString();
            System.out.println(sb);
            System.out.println("---------------");
    }

    public static void main(String[] args) {
        TwoDirectionsList<Integer> list = new TwoDirectionsList<>();
        list.append(90);
        list.append(80);
        list.append(20);
        printList(list);

        list.insert(111, 0);
        list.insert(222,2);
        list.insert(33,6);
        printList(list);

        list.delete(20);
        printList(list);

        System.out.println(list.head.getValue() + "  " + list.search(80).getValue()
                + " " + list.reverseSearch(90).getValue());

    }
}
