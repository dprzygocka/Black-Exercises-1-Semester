import java.util.*;
public class ArraysList2{
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
      System.out.print("You are looking for number on "+searchNumber(numbers)+" place in an array.");
   }
   public static int searchNumber(ArrayList<Integer> numbers){
      Scanner console = new Scanner(System.in);
      System.out.print("What number are you looking for?: ");
      int num = console.nextInt();

      for (int i = 0; i< numbers.size(); i++){
         if (numbers.get(i) == num){
            return i;
         }
      }
      return -1;
      
   }
   


}