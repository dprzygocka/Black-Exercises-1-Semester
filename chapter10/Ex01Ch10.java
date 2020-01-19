import java.util.*;
public class Ex01Ch10{
   public static void main(String[] args){
      ArrayList <String> array = new ArrayList<String>();
      array.add("costiume");
      array.add("red");
      array.add("consequences");
      System.out.print(totalVowels (array));
   }
   public static int totalVowels (ArrayList<String> array){
      int count = 0;
      ArrayList<String> letters = new ArrayList<String>();
      for (String i : array){
         for (int j = 0; j<i.length(); j++){
            letters.add(i.substring(j, j+1));
         }
      }
      for (String a : letters){
         if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")){
            count++;
         }
      }
      return count;
   }
} //easier way?