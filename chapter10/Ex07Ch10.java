import java.util.*;
public class Ex07Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("be");
      array.add("be");
      array.add("is");
      array.add("not");
      array.add("or");
      array.add("question");
      array.add("that");
      array.add("the");
      array.add("to");
      array.add("to");
      Collections.sort(array);
      System.out.print(removeDuplicates(array)); 
   }
   public static ArrayList<String> removeDuplicates(ArrayList<String> array){
      for (int i = 0; i<array.size(); i++){
         if(array.get(i).equals(array.get(i+1))){
            array.remove(i);
         }
      }
      return array;
   }
}