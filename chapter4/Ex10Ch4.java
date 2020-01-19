import java.util.*;
public class Ex10Ch4{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      printPay(scanner);
   }
   public static void printPay(Scanner input){
      System.out.print("Enter an employee record: ");
      String name = input.next();
      int numbers = input.nextInt();
      int sum = 0;
      for (int i = 1; i<= numbers; i++){
         int n = input.nextInt();
         sum+=n;     
      }
      System.out.print(name+"'s average pay is "+sum/numbers);
   }
}