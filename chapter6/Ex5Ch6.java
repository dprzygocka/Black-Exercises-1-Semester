import java.io.*;
import java.util.*;

public class Ex5Ch6{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("data5.txt"));
      quadSpaces(input);
   }
   public static void quadSpaces (Scanner input){
      while (input.hasNext()){
         System.out.print(input.next()+"    ");
      }
   }
}
