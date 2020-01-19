public class Arrays3{
   public static void main(String[] args){
      int [] numbers = new int [7];
      array(numbers);

      }
   
   public static int [] array (int [] numbers){
      for (int i = 0; i < numbers.length; i++){
         if (i == 0){
            numbers[i] = 1;
         }else {
            numbers[i] = numbers[i-1]*2;
         }
      

         System.out.print(numbers[i] +", ");
      }
      return numbers;
   }
}
