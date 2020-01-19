import java.util.*;
public class ArraysList4{
   public static void main(String[] args){
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers = arrayPopulate(numbers);
      System.out.println("New array called digits: "+ arrayDigits(numbers));
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
   
}