import java.util.*;
public class Ex08Ch10{
   public static void main(String[] args){
      ArrayList<Integer> array = new ArrayList<Integer>();
      array.add(9);
      array.add(6);
      array.add(2);
      array.add(4);
      array.add(8);
      array.add(3);
      array.add(1);
      System.out.print(removeOdd  (array)); 
   }
   public static ArrayList<Integer> removeOdd  (ArrayList<Integer> array){
      for (int i =array.size()-1; i>=0; i--){
         if (array.get(i)%2 != 0){
            array.remove(i);
         }
      }
      return array;
   }
}