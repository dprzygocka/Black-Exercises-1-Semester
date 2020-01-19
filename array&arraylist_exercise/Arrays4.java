public class Arrays4{
   public static void main(String[] args){
   int [] numbers = {33,44,55,66,77,88,99,1,2};
   array(numbers);
   }
   public static int [] array(int[] numbers){
      int [] digits = new int [numbers.length];
      for (int i = 0; i< numbers.length; i++){
            digits[i] = numbers[i];
            System.out.print(digits[i]+" ");
      }
      return digits;
   }
}


   //int [] digits = Arrays.copyOf(numbers, numbers.length);
   //System.out.print(Arrays.toString(digits));
   