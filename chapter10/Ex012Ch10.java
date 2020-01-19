import java.util.*;
public class Ex012Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("this");
      array.add("is");
      array.add("lots");
      array.add("of");
      array.add("fun");
      array.add("for");
      array.add("Java");
      array.add("coders");
      System.out.print(markLength4(array)); 
   }
   public static ArrayList<String> markLength4(ArrayList<String> array){
      for (int i = 0; i<array.size(); i++){
         if (array.get(i).length()== 4){
            array.add(i, "****");
            i++;
         }
      }
      return array;
   }
}