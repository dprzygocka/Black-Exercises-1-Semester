import java.util.*;
public class Ex03Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("tomb");
      array.add("bed");
      array.add("oriental");
      array.add("not");
      array.add("tomorrow");
      array.add("bear");
      array.add("hamlet");
      System.out.print(removeOddLength(array)); 
   }
   public static ArrayList<String> removeOddLength(ArrayList<String> array){
      for(int i = array.size()-1 ; i>=0; i--){
         if(array.get(i).length()%2 != 0){
            array.remove(i);
         }     
      }
      return array;
   }
}