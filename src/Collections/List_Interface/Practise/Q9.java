package Collections.List_Interface.Practise;

import java.util.List;

public class Q9 {
    /*
     * Write a program that takes a list of integers as input and
     * returns the maximum element in the list.
     */

    public static int maximumElement(List<Integer> list) {
        int bigNo = list.get(0);

        for (int no : list) {
            if (no > bigNo) {
                bigNo = no;
            }
        }
        return bigNo;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(51, 2, 9, 14, 13);

        System.out.println(maximumElement(list));
    }
}
