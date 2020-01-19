import java.io.*;
import java.util.*;
public class Ex12Ch6{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner (new File("htmlex.txt"));
      stripHtmlTags(input);
   }
   public static void stripHtmlTags (Scanner input){
      while (input.hasNext()){
         String a = input.nextLine();
         while (a.contains("<") && a.contains(">")){
            a = a.substring(0, a.indexOf("<"))+ a.substring(a.indexOf(">")+1);
         }
         
         System.out.println(a);
      }
   }
}