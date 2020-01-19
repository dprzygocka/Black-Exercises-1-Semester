import java.util.*;
public class Ex09Ch10{
   public static void main(String[] args){
      ArrayList<Integer> array = new ArrayList<Integer>();
      array.add(3);
      array.add(4);
      array.add(2);
      array.add(2);
      array.add(8);
      array.add(2);
      array.add(3);
      array.add(2);
      array.add(4);
      array.add(8);
      array.add(2);
      System.out.print(rangeBetweenEvens(array)); 
   }
   public static int rangeBetweenEvens(ArrayList<Integer> array){
      System.out.println(array);
      int min =array.size();
      int max = 0;
      int count = 0;
      for (int i = 0; i<array.size(); i++){
         if (array.get(i)%2 == 0){
            if (i>max){
               max = i;
            }
            if(i<min){
               min = i;
            }
            count++;
         }     
      }
      if (count == 0 ){
         return 0;
      }else if (count == 1){
         return 1;
      }
      return max-min+1;
   }
}