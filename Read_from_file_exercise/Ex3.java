import java.io.*;
import java.util.*;

public class Ex3{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      System.out.print("Enter a name of the file with extension .txt: ");
      File f = new File(console.nextLine());
      while (!f.exists()){
         System.out.print("File doesn't exist.\nPlease enter name of existing file: ");
         f = new File (console.nextLine());
      }
      Scanner input = new Scanner(f);
      while (input.hasNext()){
         if (input.next().equals("faisal.txt")){
            System.out.print("File contains its name.");
         }
         
      }
   }
}