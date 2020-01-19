import java.util.*;
public class ArraysList3{
   public static void main(String[] args){
      ArrayList<Integer> numbers = new ArrayList<Integer>();

      System.out.println(arrayPopulate(numbers));
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