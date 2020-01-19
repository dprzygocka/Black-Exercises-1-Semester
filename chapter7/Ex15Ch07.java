//easier way???
import java.util.*;
public class Ex15Ch07{
   public static void main(String[] args){
      int [] ar1 = {2, 5, 4, 3, 67, 89, 43, 35, 11, 9};
      System.out.print(Arrays.toString(shrink(ar1, array2(ar1))));
   }
   public static int [] shrink (int [] ar1, int [] ar2){
      for(int i = 0; i<ar2.length; i++){
       ar2[i] = ar1[2*i] - ar1[2*i+1];
      }
      if (ar1.length%2 !=0){
         ar2[ar2.length-1] = ar1[ar1.length-1];
      }
      return ar2;
   }
   public static int [] array2(int[] ar1){
      if (ar1.length%2 == 0){
         int [] ar2 = new int [ar1.length/2];
         return ar2;
      }else {
         int [] ar2 = new int [ar1.length/2+1];
         return ar2;
      }
   }
}