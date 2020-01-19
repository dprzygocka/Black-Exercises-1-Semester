
public class Ex1Ch3
{
   public static void main(String[] args)
   {
      printEvenNumbers(12);
   }
   public static void printEvenNumbers(int number)
   {
      for(int i = 2; i<=number; i+=2)
      {
         System.out.print("{"+i+"} ");
      }
   }
}