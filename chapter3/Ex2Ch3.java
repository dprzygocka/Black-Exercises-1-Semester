public class Ex2Ch3
{
   public static void main(String[] args)
   {
      printPowersOf10(0);
   }
   public static void printPowersOf10(int number)
   {
      for( int i = (int)Math.pow(10,5); i>= Math.pow(10, number); i = i/10)
      {
         System.out.print(i+" ");
      }
   }
}