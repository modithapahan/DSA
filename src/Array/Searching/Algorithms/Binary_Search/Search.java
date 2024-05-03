package Array.Searching.Algorithms.Binary_Search;

public class Search {
   public static int binarySearch(int[] arr, int no) {
      int low = 0;
      int high = arr.length - 1;

      while (low <= high) {
         int middle = (low + high) / 2;

         /* Check middle number equals to no */
         if (arr[middle] == no) {
            return middle;
         }

         /* if no is grater, ignore the left side of the array */
         if (arr[middle] < no) {
            low = middle + 1;
         }

         else {
            high = middle - 1;
         }
      }

      return -1;
   }

   public static void main(String[] args) {

      int[] arr = { 2, 3, 4, 10, 40 };
      int no = 40;

      int result = binarySearch(arr, no);

      if (result == -1) {
         System.out.println("Element is not present in array");
      } else {
         System.out.println(result);
      }
   }
}
