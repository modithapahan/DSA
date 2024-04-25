package Collections.List_Interface.Practise;

import java.util.List;

public class Q11 {
    /*
     * Write a program that takes a list of integers as input and
     * returns the average of all the numbers in the list.
     * The average is calculated by summing up all the numbers in the list and
     * dividing the sum by the total number of elements.
     */

    public static double findAverage(List<Integer> list) {

        if (list.isEmpty()) {
            System.out.println("Empty list");
            return 0;
        } else {
            int sum = 0;

            for (int no : list) {
                sum = sum + no;
            }

            double average = (double) sum / list.size();

            return average;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(5, 2, 9, 10, 13);
        System.out.println(findAverage(list));
    }
}
