package Collections.List_Interface.Practise;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
    /*
     * Write a program that takes two lists of integers as input and
     * returns a new list containing the intersection of the two input lists.
     * The intersection of two lists is the set of elements that are common to both
     * lists.
     */

    public static List<Integer> selectSameValues(List<Integer> li1, List<Integer> li2) {
        List<Integer> store = new ArrayList<>();

        for (int num : li1) {
            if (li2.contains(num)) {
                store.add(num);
            }
        }

        return store;
    }

    public static void main(String[] args) {
        List<Integer> li1 = List.of(1, 2, 3, 4, 5);
        List<Integer> li2 = List.of(4, 5, 6, 7, 8);

        System.out.println(selectSameValues(li1, li2));

    }
}
