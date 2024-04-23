package Collections.List_Interface.Practise;

import java.util.List;

public class Q6 {
    /*
     * Write a program that takes a list of integers as input and
     * prints only the even numbers in the list.
     */

    public static void printEvenNum(List<Integer> li) {

        // check the list empty or not
        if (li.size() == 0) {
            System.out.println("Empty List");
        }
        // check about even numbers
        else {
            for (int num : li) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> li = List.of(1, 2, 3, 4, 5, 6);

        printEvenNum(li);
    }
}
