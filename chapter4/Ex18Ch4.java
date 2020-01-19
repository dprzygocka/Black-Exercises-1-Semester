import java.util.*;
public class Ex18Ch4{
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   spaceCount(scanner);
   }
   public static void spaceCount (Scanner input){
    System.out.print("Enter a string: ");
    String word = input.nextLine();
    int count = 0;
    for(int i = 0; i<= word.length()-1; i++){
      if ((int)word.charAt(i) == 32){
         count += 1;
      }
    }
    System.out.print("Number of spaces: "+ count);
   }
}