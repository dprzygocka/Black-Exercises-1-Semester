public class Ex03Ch07{
   public static void main(String[] args){
      int [] numbers = {90, 85, 4, 35, -76, 9, 23, 3};
      int max = maxnumber(numbers);
      int min = minnumber(numbers);
      System.out.println("Number of even numbers from an array in range between: "+ min + " and "+max+" is: "+evensInRange (numbers, max, min));
   }
   public static int maxnumber (int [] numbers){
      int max = numbers[0];
      for (int i = 0; i<numbers.length; i++){
         if (numbers[i] > max){
            max = numbers[i];
         }
      }
      return max;
   }
   public static int minnumber (int [] numbers){
      int min = numbers[0];
      for (int i = 0; i<numbers.length; i++){
         if (numbers[i] < min){
            min = numbers[i];
         }
      }
      return min;
   }
   public static int evensInRange (int [] numbers, int max, int min){
      int count = 0;
      for (int i =0; i<numbers.length; i++){
         if (numbers[i] >= min && numbers[i] <= max && numbers[i]%2 == 0){
            count++;  
         }
      }
      return count;
   }
}