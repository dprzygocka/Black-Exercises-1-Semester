public class Ex02Ch07{
   public static void main(String[] args){
      int [] numbers = {25, 85, 22, 15, 78, 27, 48};
      System.out.print(product (numbers));
   }
   public static int product(int [] numbers){
      int max =numbers[0];
      int min = numbers[0];
      for (int i =0; i<numbers.length; i++){
         if (numbers[i] > max){
            max = numbers[i];
         }else if (numbers[i] < min){
            min = numbers[i];
         }
      }
      return max * max;
      
   }
   
}