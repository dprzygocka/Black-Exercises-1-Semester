import java.io.*;
import java.util.*;

public class Ex1read{
   public static void main(String[] args)
      throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a name of the file with extension .txt: ");
      String filename = console.nextLine();
      Scanner input = new Scanner(new File(filename));
      while (input.hasNext()){
         System.out.println(input.nextLine().toUpperCase());
      }
   }
}