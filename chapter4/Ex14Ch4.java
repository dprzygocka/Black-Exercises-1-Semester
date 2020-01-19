public class Ex14Ch4{
   public static void main(String[] args){
      System.out.print(pow2 (5.0, -2));
   }
   public static double pow2 (double base, int exponent){
      double sum = Math.pow(base, exponent);
      return sum;
   }
}