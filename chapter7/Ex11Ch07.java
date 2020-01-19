public class Ex11Ch07{
   public static void main(String[] args){
      int [] array = {6, 9, 18, 5, 7, 23, 51, -3, 61};
      System.out.print(isEven(array));
   }
   public static boolean isEven (int[] array){
      for (int i : array){
         if (i%2 !=0){
            return false;
         }
      }
      return true;
   }
}