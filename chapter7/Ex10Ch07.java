public class Ex10Ch07{
   public static void main(String[] args){
      int [] array = {};
      System.out.print(percentOdd (array));
   }
   public static double percentOdd (int[] array){
      if (array.length!=0){
         double odd = 0;
         for (int i = 0; i< array.length; i++){
            if (array[i]%2 !=0){
               odd++;
            }
         }
         return (odd/array.length)*100;
      }
      return 0.0;
   }
}