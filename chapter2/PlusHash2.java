public class PlusHash2
{
public static final int ROWS = 8;
   public static void main(String[] args)
   {
      for(int i = 1; i<= ROWS; i++)
      {
         for(int j = 1; j<=(ROWS-i)*2; j++)
         {
            System.out.print("<");
         }
         for(int k = 1; k <= 4*i-2; k++)
         { 
            System.out.print("+");
         }
         for(int m = 1; m<=(ROWS-i)*2; m++)
            {
               System.out.print(">");
            }
         
         System.out.println();
      }
   }
}
