public class Ex6Ch3
{
   public static void main(String[] args)
   {
      System.out.print(smallerAbsVal(2, -7));
   }
   public static int smallerAbsVal(int a, int b)
   {
      if (Math.abs(a) > Math.abs(b)){
         return Math.abs(b);
      }else {
         return Math.abs(a);
         }
   }
      
}