import java.util.*;
public class Ex011Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("how");
      array.add("are");
      array.add("you?");

      int k =2;
      System.out.print(stutter(array, k)); 
   }
   public static ArrayList<String> stutter(ArrayList<String> array, int k){
      if (k<= 0){
         array.clear();
         return array;
      }else{
         for (int i = 0; i<array.size(); i+=k){
             for(int j =0; j < k-1; j++){
               array.add(i, array.get(i));
             }
         }
      }
      return array;
   }
}