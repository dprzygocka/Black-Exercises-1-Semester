public class Ex7Ch2
{  
   
   
   public static void main(String[] args)
   {  
      int LINES = 2;
      for(int i = 1; i <= LINES; i++)
      {  
         for(int j = LINES ; j >= i; j--)
         {
            System.out.print(" ");
         }
         for(int k= 1 ; k <= i ; k++)
         {
            System.out.print("5");
         }
         System.out.println("");
       }
      int LINE = 3;
      for(int i = 1; i <= LINE; i++)
      {  
         for(int j = 1 ; j <= (i-1); j++)
         {
            System.out.print(" ");
         }
         for(int k=LINE  ; k >= i ; k--)
         {
            System.out.print("5");
         }
         System.out.println("");
       }

      
   }
}