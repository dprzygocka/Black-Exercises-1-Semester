import java.util.*;
public class Ex04Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("tomb");
      array.add("bed");
      array.add("oriental");
      System.out.print(quadList (array)); 
   }
   public static ArrayList<String> quadList (ArrayList<String> array){
      for(int i = 0; i<array.size(); i+=4){
         for (int j = 0; j<3; j++){
            array.add(i,array.get(i));
         }
      }
      return array;
   }
}