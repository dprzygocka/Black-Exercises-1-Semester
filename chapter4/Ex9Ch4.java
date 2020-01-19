import java.util.*;
public class Ex9Ch4{
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   oddSumMax (scanner);
   }
   public static void oddSumMax(Scanner input){
      System.out.print("How many integers?: ");
      int numbers = input.nextInt();
      int oddsum = 0;
      int oddmax = 0;
      for (int i = 1; i<=numbers; i++){
         System.out.print("Integer"+i+": ");
         int n = input.nextInt();
         if (n %2 != 0){
            oddsum += n;
         }
         if (n > oddmax && n%2 !=0){
            oddmax = n;
         }
     }
     System.out.println("Sum of odd numbers: "+oddsum);
     System.out.println("Odd max: "+oddmax);
   }
}