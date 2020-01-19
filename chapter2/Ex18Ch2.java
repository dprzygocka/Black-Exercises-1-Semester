public class Ex18Ch2
{  public static final int REPETITION = 6;
   public static final int ROWS = 4;
   public static int i = 1;
   public static int j = 1;
   public static int k = 1;
   public static void main(String[] args)
   {
      One();
      Two();
      One();
      Two();
      One();
   } 
      
   public static void One()
   {
      for(i = 1; i<= REPETITION; i++)
      {
         System.out.print("#------");
      }
      System.out.println("#");
   }
   public static void Two()
   {
      for (k = 1; k<= ROWS; k++)
      {
         for(j = 1; j<= REPETITION; j++)
         {
            System.out.print("!      ");
         }
      System.out.println("!");
      }
   }
}
   
         