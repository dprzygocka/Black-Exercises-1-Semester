import java.io.*;
import java.util.*;
public class FileExercise{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.print("Please enter a filename with extension with .txt: ");
      String filename = console.nextLine();
      String text = "";
      while (!text.equals("quit")){
         PrintStream output = new PrintStream (new File (filename));
         System.out.print("Enter text for the file: ");
         text = console.nextLine();
         output.println(text);
         output.flush();
         output.close();
      }
   }
}
//next czy nextLine()