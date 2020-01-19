import java.io.*;
import java.util.*;
public class Ex4Ch6{
   public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner (new File ("data4.txt"));
   cointCoins(input);
   }
   public static void cointCoins(Scanner input){
      int sum = 0;
      while (input.hasNext()){
         int number = input.nextInt();
         String money = input.next().toLowerCase();
         if (money.equals("pennies")){
            sum+= (1* number); 
         }else if (money.equals("nickels")){
            sum+=(5 * number);
         }else if (money.equals("dimes")){
            sum+=(10 * number);
         }else if (money.equals("quarters")){
            sum+=(25 * number);
         }
      }
      System.out.print("Total money: $"+(double)sum/100);
   }
}