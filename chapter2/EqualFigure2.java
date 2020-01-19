public class EqualFigure2
{  
   public static final int ROWS = 3;
   public static void main(String[] args)
   {
      for(int i = 1; i<= ROWS; i++)
      {
         for(int j = 1; j<= 4*i-4; j++)
         {
            System.out.print("<");
         }
         for(int k = 1; k<= (-8*i)+40; k++)
         {  
            System.out.print("=");
         }
         for(int l = 1; l<= 4*i-4; l++)
         {
            System.out.print(">");
         }
      System.out.println();
      }
   }
}