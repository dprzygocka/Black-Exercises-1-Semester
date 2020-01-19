public class Ex17Ch3
{
   public static void main(String[] args)
   {
      System.out.print(padHeader("123", 4));
   }
   public static String padHeader(String a, int b)
   {  
      String c = a;
      if (a.length() != b)
      {
         for (int i = 0; i< (b - a.length()); i++)
         {
             c += "0";
         
         }
         return c;
      }
      return a;
         
   }
}