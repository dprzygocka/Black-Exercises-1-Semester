import java.util.*;
import java.io.*;
public class Ex13Ch6{
   public static void main(String[] args) throws FileNotFoundException {
   Scanner input = new Scanner (new File("data13.txt"));
   countAndStripComments(input);
   }
   public static void countAndStripComments (Scanner input){
      int count = 0;
      while(input.hasNextLine()){
         String line = input.nextLine();
         if (line.contains("/*")){
            count++;
         }else if (line.contains("//")){
            count++;
         }
      }
      System.out.print("Number of Comments removed = "+ count);
   }
}