public class Ex8Ch3
{  
  
   public static void main(String[] args)
   {  
      quadratic(2,4,6);
   }
   public static void quadratic (double a, double b, double c)
   {
      double x1 = (((-b)+ Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a));
      double x2 = (((-b)- Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a));
      System.out.print("x1 = "+x1+" "+"x2 = "+x2);
   }

}