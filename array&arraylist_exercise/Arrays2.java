import java.util.*;
public class Arrays2{
   public static void main(String[] args){
      int [] numbers = {33,44,55,66,77,88,99,1,2};
      System.out.print("You are looking for number on "+searchNumber(numbers)+" place in an array.");
   }
   public static int searchNumber(int [] numbers){
      Scanner console = new Scanner(System.in);
      System.out.print("What number are you looking for?: ");
      int num = console.nextInt();

      for (int i = 0; i< numbers.length; i++){
         if (numbers[i] == num){
            return i;
         }
      }
      return -1;
      
   }
   
}