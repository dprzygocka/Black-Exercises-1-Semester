public class Ex3Ch3
{
   public static void main(String[] args)
   {
      printPowersOfN(-2,8); 
   }
   public static void printPowersOfN(int a, int b)
   {
      for(int i = 0; i<= b; i++)
      {
         System.out.print((int)Math.pow(a, i)+" ");
      }
   }
   
}