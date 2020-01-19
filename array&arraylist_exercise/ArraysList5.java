import java.util.*;
public class ArraysList5{
   public static void main(String[] args){
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      System.out.println("New array reversedDigits: "+ arrayReversed(arrayDigits(arrayPopulate(numbers))));
      
      
   }
   public static ArrayList<Integer> arrayDigits(ArrayList<Integer> numbers){   
      ArrayList<Integer> digits = numbers;
      return digits;
   }
   public static ArrayList<Integer> arrayPopulate (ArrayList<Integer> numbers){
      for (int i =0; i< 7; i++){
         if (i==0){
            numbers.add(1);
         }else {
            numbers.add(numbers.get(i-1)*2);
         }
      }
      return numbers;
   }
   public static ArrayList<Integer> arrayReversed(ArrayList<Integer> digits){
      ArrayList<Integer> reversedDigits = new ArrayList<Integer>();
      for (int i = 0; i < digits.size(); i++){
       reversedDigits.add(digits.get(digits.size()-1-i));
      }
      return reversedDigits;

   }
   
}