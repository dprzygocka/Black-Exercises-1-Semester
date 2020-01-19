public class TwoShips 
{  
   public static final int SHIPS= 3;
   public static void main(String[] args)
   { 
      for(int i = 1; i<= SHIPS; i++)
      {   
         System.out.print("  | Sea |      ");
      }
      System.out.println();
      for(int j = 1; j<= SHIPS; j++)
      {
         System.out.print("  |Horse|      ");
      }
      System.out.println();
      for(int a = 1; a<= 3; a++)
      {
         for(int k = 1; k<= SHIPS; k++)
         {
         System.out.print("   |  |        ");
         }
         System.out.println();
      }
      for(int l = 1; l<= SHIPS; l++)
      {
         System.out.print(" ---------    ");
      }
      System.out.println();
      for(int m = 1; m<= SHIPS; m++)
      {
         System.out.print(" @       @    ");
      }
       System.out.println();
       for(int n = 1; n<= SHIPS; n++)
      {
         System.out.print("  @     @     ");
      }
         System.out.println("");
      for(int o = 1; o<= SHIPS; o++)
      {
         System.out.print("  ------       ");
      }    
   }
}
         