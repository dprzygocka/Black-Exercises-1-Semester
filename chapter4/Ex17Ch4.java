import java.util.*;
public class Ex17Ch4{
   public static void main(String[] args){
      Scanner scanner = new Scanner (System.in);
      System.out.print(swapPairs(scanner)); 
   }
   public static String swapPairs(Scanner input){
      System.out.print("Enter a string: ");
      String word = input.nextLine();
      String change = "";
      if (word.length() % 2 == 0){
         for (int i = 0; i <= word.length()-1; i+=2){
            change += word.charAt(i+1);
            change += word.charAt(i);
         }
      }else {
         for (int i = 0; i <= word.length()-2; i+=2){
            change += word.charAt(i+1);
            change += word.charAt(i);
         }
         change+=word.charAt(word.length()-1);
      }
      return change;
   }
}