import java.io.*;
import java.util.*;
public class Ex8Ch6{
   public static void main(String[] args)throws FileNotFoundException {
      Scanner input = new Scanner(new File("data7.txt"));
      PrintStream output = new PrintStream(new File ("data78.txt"));
      doubleSpace(input, output);
   }
   public static void doubleSpace (Scanner input, PrintStream output){
      while (input.hasNextLine()){
         output.println(input.nextLine());
         output.println();
      }
      output.flush();
      output.close();
   }
}
