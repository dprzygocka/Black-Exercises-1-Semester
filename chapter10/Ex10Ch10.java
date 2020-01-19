import java.util.*;
public class Ex10Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("to");
      array.add("be");
      array.add("or");
      array.add("not");
      array.add("to");
      array.add("be");
      array.add("that");
      array.add("is");
      array.add("the");
      array.add("question");
      String begining = "free";
      String ending = "rich";
      System.out.print(removeInRange(array, begining, ending)); 
   }
   public static ArrayList<String> removeInRange(ArrayList<String> array, String begining, String ending){
      for (int i = 0; i<array.size(); i++){
         if(array.get(i).compareTo(begining) >0 && array.get(i).compareTo(ending) <0 ){
            array.remove(i);
            i--;
         }
      }
      return array;
   }
}