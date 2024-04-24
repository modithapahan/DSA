package Collections.List_Interface.Practise;

import java.util.ArrayList;
import java.util.List;

public class Q8 {
    /*
     * Write a program that takes two lists of strings as input and
     * returns a new list containing the union of the two input lists.
     * The union of two lists is the set of all unique elements from both lists.
     */

    public static List<String> findUniqueElements(List<String> list1, List<String> list2) {
        List<String> list3 = new ArrayList<>();
        if (list1.size() == 0 && list2.size() == 0) {
            System.out.println("Null");
        } else {
            for (String value : list1) {
                if (list2.contains(value)) {
                    list3.add(value);
                }
            }
        }
        return list3;
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("Moditha", "Pahan", "Modi", "uduchu");
        List<String> list2 = List.of("Moditha", "Pahan", "Modi567", "sjdbcb");

        System.out.println(findUniqueElements(list1, list2));
    }
}
