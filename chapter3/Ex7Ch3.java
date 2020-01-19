public class Ex7Ch3
{
   public static void main(String[] args)
   {
      System.out.print(smallerAbsVal(2, -7, 1));
   }
   public static int smallerAbsVal(int a, int b, int c)
   {
      if (Math.abs(a) < Math.abs(b) && Math.abs(a) < Math.abs(c) ){
         return Math.abs(a);
      }else if (Math.abs(b) <Math.abs(a) && Math.abs(b) < Math.abs(c)) {
         return Math.abs(b);
      }else {
         return Math.abs(c);
         }
   }
      
}