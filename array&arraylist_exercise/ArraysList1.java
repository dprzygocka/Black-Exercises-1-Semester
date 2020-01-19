import java.util.*;
public class ArraysList1{
   public static void main(String[] args){
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(33);
      numbers.add(44);
      numbers.add(55);
      numbers.add(66);
      numbers.add(77);
      numbers.add(88);
      numbers.add(99);
      numbers.add(1);
      numbers.add(2);
      System.out.print("The sum is: "+sum(numbers));
   }
   public static int sum (ArrayList<Integer> numbers){
      int sum = 0;
      for (int i = 0; i< numbers.size(); i++){
         sum+= numbers.get(i);
      }
      return sum;
   }

}