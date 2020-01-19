import java.util.*;
public class Ex16Ch4{
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   printPalindrome (scanner);
   }
   public static void printPalindrome (Scanner input){
      System.out.print("Enter one or more strings: ");
      String words = input.nextLine();
      String ne = "";
      for (int i = words.length()-1 ; i >= 0; i--){
         ne += words.charAt(i);
         
      }   
      if (words.toLowerCase().equals(ne.toLowerCase())){
         System.out.print(ne);
      }else {
         System.out.print("Not a palindrome");
      }
   }
}