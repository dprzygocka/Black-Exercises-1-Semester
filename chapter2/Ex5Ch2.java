public class Ex5Ch2   
{  
   public static final int LINES = 5;
   
   public static void main(String[] args)
   {
      for(int i = 1; i <= LINES; i++)
      {
         for(int j = 1; j <= (LINES-i); j++)
         {
            System.out.print(" ");
         }
         for(int k = 1; k <=i; k++)
         {
            System.out.print("+");
         }
         System.out.println("");
      }
   }
}
         