import java.util.*;
public class Ex07Ch07{
   public static void main(String[] args){
      Scanner console = new Scanner(System.in);
      int [] array = {47, 58, 201, 96, 167, 545, 43};
      Arrays.sort(array);
      System.out.print("Enter numer in range 0<k<array.length): ");
      int k = console.nextInt();
      System.out.print(kthSmallest(k, array));
   }
   public static int kthSmallest (int k, int [] array){
         return array[k];
   }
}