public class Ex13Ch2
{
   public static final int TIMES = 5;
   public static final int SECTION = 5;
   public static final int NUMBER = 10; 
   public static final int DIGIT = 8; 
   
   public static void main(String[] args)
   {
      for(int i =1; i<= TIMES; i++)
      {
         for(int l= 0; l<=DIGIT; l+=2)
         {
            for(int k = 1; k<=NUMBER; k++)
            {
               System.out.print(l);
            }
         }
      System.out.println();
      }
   }
}