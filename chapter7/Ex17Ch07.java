import java.util.*;
public class Ex17Ch07{
   public static void main(String[] args){
      String a = "i think, therefore i am";
      System.out.print(Arrays.toString(vowelCount(a)));
   }
   public static int[] vowelCount(String a){
      int [] vowels = new int [5];
      a = a.toLowerCase();
      for (int i=0; i<a.length(); i++){
         if (a.indexOf("a", i)==i){ 
            vowels[0]++;
         }else if (a.indexOf("e", i)==i){
            vowels[1]++;
         }else if (a.indexOf("i", i)==i){
            vowels[2]++;
         }else if (a.indexOf("o", i)==i){
            vowels[3]++;
         }else if (a.indexOf("u", i)==i){
            vowels[4]++;
         }  
      }
      return vowels;
   }
}