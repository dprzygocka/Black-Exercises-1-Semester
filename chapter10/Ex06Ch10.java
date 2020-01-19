import java.util.*;
public class Ex06Ch10{
   public static void main(String[] args){
      ArrayList<Integer> array = new ArrayList<Integer>();
      array.add(25);
      array.add(39);
      array.add(50);
      array.add(3);
      array.add(8);
      array.add(24);
      array.add(4);
      System.out.print(maxToFront (array)); 
   }
   public static ArrayList<Integer> maxToFront (ArrayList<Integer> array){
      int max = 0;
      for(int i = 0; i<array.size(); i++){   
         if (array.get(i)> max){
            max = array.get(i);
         }
      }
      array.remove(array.indexOf(max));
      array.add(0,max);
      return array;
   }
}