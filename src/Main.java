import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();


        long arrayListStartTime = System.currentTimeMillis();
        addElements(arrayList);
        long arrayListEndTime = System.currentTimeMillis();

        long arrayListExecutionTime = arrayListEndTime - arrayListStartTime;

        long linkedListStartTime = System.currentTimeMillis();
        addElements(linkedList);
        long linkedListEndTime = System.currentTimeMillis();

        long linkedListExecutionTime = linkedListEndTime - linkedListStartTime;

        System.out.println("Время выполнения ArrayList : " + arrayListExecutionTime + " ms");
        System.out.println("Время выполнения LinkedList : " + linkedListExecutionTime + " ms");
        System.out.println("Разница выполнения ArrayList и LinkedList : " + (linkedListExecutionTime - arrayListExecutionTime) + " ms");
        if (arrayListExecutionTime < linkedListExecutionTime) {
            System.out.println("ArrayList работает быстрее.");
        } else if (arrayListExecutionTime > linkedListExecutionTime) {
            System.out.println("LinkedList работает быстрее.");
        } else {
            System.out.println("Как ArrayList, так и LinkedList имеют одинаковое время выполнения.");
        }
    }

    private static void addElements(List<Integer> list) {
        for (int i = 0; i < 500000; i++) {
            list.add(i);
        }
    }
}



