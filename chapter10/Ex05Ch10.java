import java.util.*;
public class Ex05Ch10{
   public static void main(String[] args){
      ArrayList<Integer> array = new ArrayList<Integer>();
      array.add(2);
      array.add(5);
      array.add(-4);
      array.add(1);
      array.add(-2);
      System.out.print(scaleByK(array)); 
   }
   public static ArrayList<Integer> scaleByK(ArrayList<Integer> array){
      int increase = 0;
      for(int i = 0; i<array.size(); i+= increase){
         if (array.get(i)>0){
            increase = array.get(i);
            for (int j = 0; j<array.get(i)-1; j++){
               array.add(i,array.get(i));
            }
         }else {
            array.remove(array.get(i));
            increase = 0;
         }
      }
      return array;
   }
}