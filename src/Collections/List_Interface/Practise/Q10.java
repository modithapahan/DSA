package Collections.List_Interface.Practise;

import java.util.List;

public class Q10 {
    /*
     * Write a program that takes a list of strings as input and
     * returns the shortest string in the list.
     * If there are multiple shortest strings, return the first one encountered.
     */

    public static String findShortStr(List<String> list) {

        if (list.isEmpty()) {
            System.out.println("Empty list");
            return null;
        }

        String shortestStr = list.get(0);
        int length = shortestStr.length();

        for (String str : list) {

            if (str.length() < length) {
                length = str.length();
                shortestStr = str;
            }
        }
        return shortestStr;

    }

    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "kiwi", "orange", "grape");
        System.out.println(findShortStr(list));
    }
}
