import java.util.*;
public class ArraysList6{
   public static void main(String[] args){
      System.out.println("Number of fives in an newArray is: "+ countNumberOfFives(populateNewArray()));
      
   }
   public static ArrayList<Integer> populateNewArray(){
      ArrayList<Integer> newArray = new ArrayList<Integer>();
      for (int i = 1; i<10; i++){
         newArray.add(i);
      }
      for (int i = 9; i>0; i--){
         newArray.add(i);
      }
      return newArray;
   }
   public static int countNumberOfFives (ArrayList <Integer> newArray){
      int count = 0;
      for (int i = 0; i< newArray.size(); i++){
         if (newArray.get(i)== 5){
            count++;
         }
      }
      return count;
   }
}