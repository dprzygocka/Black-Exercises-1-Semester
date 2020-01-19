public class Ex6Ch2
{  
   public static final int LINES = 7;
   
   public static void main(String[] args)
   {
      for(int i = LINES; i > 0 ; i--)
      {
         for(int k = 1; k <= i; k++)
         {
            System.out.print(i);
         }
         System.out.println("");
      }
   }
}
         