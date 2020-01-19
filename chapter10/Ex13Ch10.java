import java.util.*;
public class Ex13Ch10{
   public static void main(String[] args){
      ArrayList<Integer> array = new ArrayList<Integer>();
      array.add(3);
      array.add(8);
      array.add(19);
      array.add(42);
      array.add(7);
      array.add(26);
      array.add(19);
      array.add(-8);
      System.out.print(reverse3(array));
   }
   public static ArrayList<Integer> reverse3(ArrayList<Integer> array){
      for(int i = 0; i< (array.size()/3)*3; i+= 3){
         int first = array.get(i);
         array.set(i, array.get(i+2));
         array.set(i+2, first);
      }
      return array;
   }
}