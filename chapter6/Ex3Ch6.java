import java.io.*;
import java.util.*;
public class Ex3Ch6{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File ("data3.txt"));
      System.out.print("Sum of the numbers is positive: "+positiveSum(input));
   }
   public static boolean positiveSum (Scanner input){
      int sum = 0;
      int steps = 0;
      while (input.hasNextInt()){
         sum += input.nextInt();
         steps += 1;
         if (sum > 0 ){
            System.out.println("sum of "+sum+" after "+steps+" steps");
            return true;      
         }    
      }
      System.out.println("no positive sum ");
      return false;   
   }
   
}
