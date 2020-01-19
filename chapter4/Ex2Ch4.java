public class Ex2Ch4 
{
   public static void main(String[] args)
   {
      System.out.print(repeat("abc"));
   }
   public static String repeat (String a)
   {
      String sum = "";
      for (int i = 1; i<= a.length(); i++)
      {
         sum += a;
      }
      return sum;
   }
}
