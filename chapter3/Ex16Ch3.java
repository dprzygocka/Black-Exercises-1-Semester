public class Ex16Ch3
{
   public static void main(String[] args)
   {
   int a,b,c;
   a=b=c=8;
   System.out.print(triangleArea(a,b,c));
   System.out.print(trianglePerimeter(a,b,c));
   }
   public static double triangleArea(int a, int b, int c)
   {
      return Math.sqrt(((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))/16);
   }
   public static int trianglePerimeter(int a, int b, int c)
   {
      return a+b+c;
   }
}
