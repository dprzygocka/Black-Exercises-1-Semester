public class Ex9Ch3
{
   public static void main(String[] args)
   {
      System.out.print(sumOfDigits(123));
   }
   public static int sumOfDigits(int x)
   {
      int sum = 0;
      while(x != 0)
      {
         sum += x % 10; 
         x = x / 10; 
      }
      return sum;
   }
}
