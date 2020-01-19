public class Ex10Ch2
{  public static final int N= 4;
   public static final int NO= 9;
   public static void main(String[] args)
   {
      for(int h = 1; h<= N; h++)
      {
         System.out.print("|");
         for(int i = 1; i<=NO; i++)
         {
            System.out.print(i);
         }
      }
      System.out.println("|");
      System.out.print(" ");
      for(int l= 1; l<=N; l++)
      {
         for(int k= 1; k<= NO; k++)
         {
            System.out.print("~");
         }
         System.out.print(" ");
      }
      System.out.println();
      for(int j = 1; j<= N; j++)
      {
         System.out.print("|");
         for(int m = 1; m<=NO; m++)
         {
            System.out.print(" ");
         }
      }
      System.out.print("|");
      
   }
}