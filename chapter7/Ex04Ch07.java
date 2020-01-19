public class Ex04Ch07{
   public static void main(String[] args){
      double [] array1 = {85.9, 76.8, 65.3, 2.8};
      double [] array2 = {6.7, 12.5, 89.7, 75.7, 34.7, 93.6};
      System.out.println(reverseSorted(array1));
      System.out.println(reverseSorted(array2));
   }
   public static boolean reverseSorted (double [] array){
      for (int i = 0; i<array.length-1; i++){
         if (array[i] < array[i+1]){
            return false;
         }
      }
      return true;
   }
}