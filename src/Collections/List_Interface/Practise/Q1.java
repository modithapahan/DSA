package Collections.List_Interface.Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    /*
     * Write a Java program that takes an integer input n from the user and
     * then prompts the user to enter n numbers.
     * The program should then store these numbers in a list and
     * print out the sum of all the numbers entered by the user.
     */

    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int numberOfValues = input.nextInt();

        List<Integer> li = new ArrayList<Integer>();

        for (int i = 0; i < numberOfValues; i++) {

            System.out.println("Enter value " + (i + 1) + ": ");
            int n = input.nextInt();

            li.add(n);
            sum = sum + n;
        }
        System.out.println(li);
        System.out.println(sum);

        input.close();
    }
}
