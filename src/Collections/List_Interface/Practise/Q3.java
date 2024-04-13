package Collections.List_Interface.Practise;

import java.util.List;

public class Q3 {
   /*
    * Write a program that takes a list of integers as input and
    * returns the maximum difference between two elements in the list,
    * where the larger element comes after the smaller one.
    */

   public static int display(List<Integer> numbers) {
      if (numbers == null || numbers.size() < 2) {
         return 0;
      }

      int maxDifference = 0;
      int minValue = numbers.get(0);

      for (int i = 1; i < numbers.size(); i++) {
         int currentNumber = numbers.get(i);

         if (currentNumber < minValue) {
            minValue = currentNumber;
         }

         int diference = currentNumber - minValue;

         if (diference > maxDifference) {
            maxDifference = diference;
         }
      }

      return maxDifference;
   }

   public static void main(String[] args) {
      List<Integer> li1 = List.of(7, 1, 5, 3, 6, 4);

      int diference = display(li1);
      System.out.println(diference);
   }
}
