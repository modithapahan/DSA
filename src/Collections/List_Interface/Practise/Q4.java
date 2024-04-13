package Collections.List_Interface.Practise;

import java.util.List;

public class Q4 {
    /*
     * Write a program that takes a list of integers as input and
     * returns the second smallest element in the list.
     * If there are multiple occurrences of the second smallest element, return any
     * one of them.
     */
    public static int findSmallest(List<Integer> numbers) {
        int small = numbers.get(0);
        int secondSmlVal = 0;

        for (int i = 1; i < numbers.size(); i++) {
            int currentNo = numbers.get(i);

            if (currentNo < small) {
                secondSmlVal = small;
                small = currentNo;
            } else if (currentNo < secondSmlVal && currentNo != small) {
                secondSmlVal = currentNo;
            }
        }
        return secondSmlVal;
    }

    public static void main(String[] args) {
        List<Integer> li = List.of(7, 1, 5, 2, 6, 4);
        int secondSmallest = findSmallest(li);
        System.out.println(secondSmallest);
    }
}
