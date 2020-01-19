import java.io.*;
import java.util.*;

public class Ex2Ch6{
   public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner (new File ("data2.txt"));
   oddNumbers(input);
   }
   public static void oddNumbers(Scanner input){
   int count = 0;
   int sum = 0;
   int oddnumbers = 0;
   while (input.hasNextInt()){
      int a = input.nextInt();
      count += 1;
      sum += a;
      if (a % 2 != 0){
         oddnumbers += 1;
      }  
   }
   double procent = ((double)oddnumbers/count)*100;
   System.out.print(count+ " numbers, sum = "+sum+"\n"+ oddnumbers + " odds " );
   System.out.printf("(%.2f)%s", procent, "%");
   }
}