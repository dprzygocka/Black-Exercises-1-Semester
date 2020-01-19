import java.util.*;
public class Ex09Ch07{
   public static void main(String[] args){
      int [] array = {7, 4};
      Arrays.sort(array);
      System.out.print(maxGap (array));
   }
   public static int maxGap (int[] array){
      if (array.length >1){
         int maxgap = 0;
         for (int i = 0; i< array.length-1; i++){
            if (array[i+1]- array[i]>maxgap){
               maxgap=array[i+1]- array[i];
            }
         }
         return maxgap;
      }
      return 0;
   }
}