public class Ex9Ch2
{  public static final int znaki = 48;
   public static void main(String[] args)
   {  
      A();
      System.out.println();
      for(int i = 1; i<= (znaki/3) ; i++)
      {
         System.out.print("~+~");
      }
      System.out.println();
      for(int i = 1; i<= (znaki/3) ; i++)
      {
         System.out.print("+~+");
      }
      System.out.println();
      A();
   }
   public static void A()
   {
      for(int i = 1; i<= znaki; i++)
      {
         System.out.print("~");
      }
   }
   
 }

     
      
      