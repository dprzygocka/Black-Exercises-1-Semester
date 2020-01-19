import java.io.*;
import java.util.*;
public class Ex9Ch6{
   public static final int maximumlinelength = 60;
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("data9.txt"));
      wordWrap(input);
   }
   public static void wordWrap (Scanner input){
      while (input.hasNextLine()){
         String a = input.nextLine();
         int hlong = a.length()/maximumlinelength;
         int rest = a.length() - maximumlinelength*hlong;
         for (int i = 0; i< hlong; i++){
            System.out.println(a.substring(i*maximumlinelength, maximumlinelength+ i*maximumlinelength));
         }
         System.out.println(a.substring(hlong*60, hlong*60+rest));
            
         }
      }
   
}
