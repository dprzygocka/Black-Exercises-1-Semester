import java.util.*;
public class Ex17Ch10{
   public static void main(String[] args){
      ArrayList<Integer> array1 = new ArrayList<Integer>();
      ArrayList<Integer> array2 = new ArrayList<Integer>();
      array1.add(10);
      array1.add(20);
      array1.add(30);
      array2.add(4);
      array2.add(5);
      array2.add(6);
      array2.add(7);
      array2.add(8);
      System.out.print(interleave(array1, array2));
   }
   public static ArrayList<Integer> interleave(ArrayList<Integer> array1, ArrayList<Integer> array2){
      int j =0;
      if (array1.size()>array2.size()){
         for(int i =1; i<array2.size(); i+=2){
            array1.add(i, array2.get(j));
            j++;
         }
      }else {
         for(int i =1; i<array1.size(); i+=2){
            array1.add(i, array2.get(j));
            j++;
         }
         for (int i =j; i<array2.size(); i++){
            array1.add(array1.size(), array2.get(i));
         }
       }
      return array1;
   } 
}