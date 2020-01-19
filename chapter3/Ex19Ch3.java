public class Ex19Ch3 
{
   public static void main(String[] args)
   {
   printLowercase("");
   }
   public static void printLowercase(String a)
   {
      if (0 == a.length())
      {
         System.out.print("");
      }else {
         System.out.print(a.toLowerCase());
      }
   }
}