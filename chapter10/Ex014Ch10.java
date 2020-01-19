import java.util.*;
public class Ex014Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("four");
      array.add("score");
      array.add("and");
      array.add("seven");
      array.add("years");
      array.add("ago");
      array.add("our");

      System.out.print(ArrayList(array)); 
   }
   public static ArrayList<String> ArrayList(ArrayList<String> array){
      for (int i = 0; i<(array.size()/2)*2-1; i++){
         if (array.get(i).length()>array.get(i+1).length()){
            array.remove(array.get(i+1));
         }else {
            array.remove(array.get(i));
         }
      }
      return array;
   }
}