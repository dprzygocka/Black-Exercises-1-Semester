import java.util.*;
public class Ex8Ch4{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      evenOdd(scanner);
   }
   public static void evenOdd(Scanner input){
   System.out.print("How many numbers do you want to enter?: ");
   int numbers = input.nextInt();
   int even = 0;
   int odd = 0;
   for (int i = 1; i<=numbers; i++){
      System.out.print("Number"+i+": ");
      int n = input.nextInt();
      if (n%2 == 0){
         even+=1;
      }else {
         odd+=1;
      }
   }
   System.out.println("Count of Even numbers: "+ even);
   System.out.println("Count of Odd numbers: "+ odd);    
   }
}