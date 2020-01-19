import java.util.*;
public class Ex08Ch07{
   public static void main(String[] args){
      int [] array = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
      Arrays.sort(array);
      System.out.print(median(array));
   }
   public static int median (int[] array){
      if (array.length%2==0){
         return (array[(array.length/2)-1]+ array[array.length/2])/2;
      }else {
         return array[(array.length/2)];
      }
   }
}