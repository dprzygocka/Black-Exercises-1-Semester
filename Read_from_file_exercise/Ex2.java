import java.io.*;
import java.util.*;

public class Ex2{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a name of the file with extension .txt: ");
      String filename = console.nextLine();
      Scanner input = new Scanner(new File(filename));
      int count = 0;
      while (input.hasNext()){
         String a = input.next();
         System.out.println(a);
         if (a.equals("the")){
            count+=1;
         }
      }
      System.out.print("Number of \"the\" in a file is: "+count);
   }
}