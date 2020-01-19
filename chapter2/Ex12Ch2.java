public class Ex12Ch2
{
   public static final int TIMES = 3;
   public static final int SECTION = 5;
   public static final int NUMBER = 6; 
   public static final int DIGIT = 9; 
   
   public static void main(String[] args)
   {
      for(int i =1; i<= TIMES; i++)
      {
         for(int l= DIGIT; l>=0; l-=2)
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