import java.util.*;
public class Ex15Ch10{
   public static void main(String[] args){
      ArrayList<Integer> array = new ArrayList<Integer>();
      array.add(4);
      array.add(7);
      array.add(9);
      array.add(2);
      array.add(7);
      array.add(7);
      array.add(5);
      array.add(3);
      array.add(5);
      array.add(1);
      array.add(7);
      array.add(8);
      array.add(6);
      array.add(7);

      int max = 7;
      int min = 5;
      System.out.print(filterRange(array, min, max));
   }
   public static ArrayList<Integer> filterRange (ArrayList<Integer> array, int min, int max){
      for (int i = array.size()-1; i>=0; i--){
         if (array.get(i)>=5 && array.get(i)<=7){
            array.remove(array.get(i));
         }
      }
      return array;
   }
}