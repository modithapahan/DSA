package Collections.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class LI {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(0, 1);
        l1.add(1, 2);

        System.out.println(l1); // [1, 2]

        List<Integer> l2 = new ArrayList<Integer>();

        l2.add(1);
        l2.add(2);

        l1.addAll(1, l2);

        System.out.println(l1); // [1, 1, 2, 2]

        System.out.println(l1.get(3)); // 2

        l1.set(0, 5);
        System.out.println(l1); // [5, 1, 2, 2]
    }
}