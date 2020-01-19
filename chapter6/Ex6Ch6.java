import java.io.*;
import java.util.*;
public class Ex6Ch6{
   public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner(new File("data6.txt"));
   PrintStream output = new PrintStream(new File("data62.txt"));
   readWriteFile(input, output);
   }
   public static void readWriteFile(Scanner input, PrintStream output){
      while (input.hasNextLine()){
         output.println(input.nextLine());
      }
      output.flush();
      output.close();
   }
}
