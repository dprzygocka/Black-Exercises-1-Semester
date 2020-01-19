public class EqualFigure 
{  
   public static final int ROWS = 3;
   public static void main(String[] args)
   {
      int howMany = 0;
      for(int i = 1; i<= ROWS; i++)
      {
         for(int j = 1; j<= howMany; j++)
         {
            System.out.print("<");
         }
         for(int k = 1; k<= (-8*i)+40; k++)
         {  
            System.out.print("=");
         }
         for(int l = 1; l<= howMany; l++)
         {
            System.out.print(">");
         }
         howMany += 4;
      System.out.println();
      }
   }
   \\uzale¿nic zmienna od hwmany i od szerokosci 
}