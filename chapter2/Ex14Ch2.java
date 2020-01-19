public class Ex14Ch2
{
   public static final int TIMES = 4;
   public static final int NUMBER = 1; 
   public static final int DIGIT = 9; 
   
   public static void main(String[] args)
   {
      for(int i =1; i<= TIMES; i++)
      {
         for(int l= NUMBER; l<=DIGIT; l+=2)
         {
            for(int k = 1; k<=l; k++)
            {
               System.out.print(l);
            }
         }
      System.out.println();
      }
   }
}