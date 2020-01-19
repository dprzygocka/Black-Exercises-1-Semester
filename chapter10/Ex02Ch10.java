import java.util.*;
public class Ex02Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("to");
      array.add("be");
      array.add("or");
      array.add("not");
      array.add("to");
      array.add("be");
      array.add("hamlet");
      System.out.print(swapPairs(array)); 
   }
   public static ArrayList<String> swapPairs (ArrayList<String> array){
      String a = "";
      for(int i = 0; i<array.size(); i++){
         if (i != array.size()-1){
            if (i%2 ==0){
               a = array.get(i);
               array.set(i, array.get(i+1));
            }else {
               array.set(i, a);
            }
         }     
      }
      return array;
   }
}