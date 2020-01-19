//is there method to conacatinate two arrays into one?
import java.util.*;
public class Ex16Ch07{
   public static void main(String[] args){
      int[] a1 = {3, 5, 7};
      int[] a2 = {1, 2, 3, 4, 5};
      System.out.print(Arrays.toString(sortAndAppend(a2, a1)));
   }
   public static int[] sortAndAppend (int[] a2, int[] a1){
      int [] a3 =new int [a1.length+a2.length];
      int j=0;
      for (int i: a1){
         a3[j]= i;
         j++;
      }
      for (int i: a2){
         a3[j] = i;
         j++;
      }
      Arrays.sort(a3);
      return a3;
   }
}