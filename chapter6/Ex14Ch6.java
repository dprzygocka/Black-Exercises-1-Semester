import java.util.*;
import java.io.*;
public class Ex14Ch6{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner (new File("data14.txt"));
      printDuplicates (input);
   }
   public static void printDuplicates (Scanner input){
      while (input.hasNextLine()){
         String line = input.nextLine();
         Scanner ithem = new Scanner (line);
         while (ithem.hasNext()){
            String a = ithem.next();
         }
         //nie wiem jak zrobic!!!!
      }
   }
}