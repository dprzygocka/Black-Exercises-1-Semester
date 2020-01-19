public class Ex5Ch3
{
   public static void main(String[] args)
   {
      printReverseGrid(5,3);
   }
   public static void printReverseGrid (int a, int b)
   {
      for(int i =a*b; i >= a-1; i-=b)
      {
         for(int j = i; j>=i-2; j--)
         {
           System.out.print(" "+j+" ");
         }
         System.out.println();
      }
   }
}