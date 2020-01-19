public class Ex15Ch2
{
   public static final int ROWS = 5;
   public static void main(String[] args)
   {
      for(int i = 1; i<= ROWS; i++)
      {
         for(int j = 0; j<=ROWS-i; j++)
         {
            System.out.print("-");
         }
         for(int k = 1; k <= ((i*2)-1); k++)
         { 
            System.out.print(k);
         }
         for(int m = 0; m<=ROWS-i; m++)
            {
               System.out.print("-");
            }
         
         System.out.println();
      }
   }
}
