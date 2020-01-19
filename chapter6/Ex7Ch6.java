import java.io.*;
import java.util.*;
public class Ex7Ch6{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("data7.txt"));
      flipLines(input);
   }
   public static void flipLines(Scanner input){
      int i = 0;
      String b = "";
      while (input.hasNextLine()){
         String a = input.nextLine();
         while (input.hasNextLine()){
            if (i % 2 == 0){
               b = a;
               break;
            }else {
               System.out.println(a);
               System.out.println(b);
               break;
           }  
         }
         if (!input.hasNextLine()){
          System.out.println(a);
          if(i%2 != 0){
            System.out.println(b);
          }
         }
         i++;
      }

   }
}
