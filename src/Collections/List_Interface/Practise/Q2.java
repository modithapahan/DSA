package Collections.List_Interface.Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    /*
     * Write a Java program that takes an integer input n from the user and
     * then prompts the user to enter n strings.
     * The program should then store these strings in a list and
     * print out the strings in reverse order.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> strg = new ArrayList<>();

        System.out.println("Enter the input: ");
        int inputSize = input.nextInt();

        for (int i = 0; i < inputSize; i++) {
            System.out.println("Enter the " + (i + 1) + " String : ");
            String str = input.next();

            strg.add(str);
        }

        System.out.println(strg);

        Collections.reverse(strg);
        System.out.println(strg);

        input.close();
    }
}
