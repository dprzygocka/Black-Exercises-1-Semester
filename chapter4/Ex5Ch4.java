public class Ex5Ch4{
   public static void main(String[] args){
      System.out.print(pow (5, 2));
   }
   public static int pow (int base, int exponent){
      int sum = base;
      for (int i = 1; i< exponent ; i++){
         sum *= base;
      }
      return sum;
   }
}