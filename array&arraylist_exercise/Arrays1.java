public class ArraysList1{
   public static void main(String[] args){
      ArrayList[int] numbers = {33,44,55,66,77,88,99,1,2};
      System.out.print("The sum is: "+sum(numbers));
   }
   public static int sum (ArrayList[int] numbers){
      int sum = 0;
      for (int i = 0; i< numbers.size(); i++){
         sum+= numbers.get(i);
      }
      return sum;
   }

}