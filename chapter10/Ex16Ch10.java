import java.util.*;
public class Ex16Ch10{
   public static void main(String[] args){
      ArrayList<String> array = new ArrayList<String>();
      array.add("four");
      array.add("score");
      array.add("and");
      array.add("seven");
      array.add("years");
      array.add("ago");
      array.add("our");
      System.out.print(clump(array));
   }
   public static ArrayList<String> clump (ArrayList<String> array){
      for(int i =0; i< (array.size()/2)*2-1; i++){
         array.set(i,"("+array.get(i)+" "+array.get(i+1)+")");
         array.remove(i+1);
      }
      return array;
   }
}