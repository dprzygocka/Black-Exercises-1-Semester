public class Ex8Ch2
{
   public static void main(String[] args)
   {
      int LINES = 5;  
      for(int i = 5; i >= 0; i--)  
      {
         for(int j = 1; j <= (LINES - i); j++)
         {
            System.out.print(" ");
         } 
         for(int k = 1; k <= i ; k++)
         {
            System.out.print(i);
         }
       System.out.println();
      }
   }
}
            
            