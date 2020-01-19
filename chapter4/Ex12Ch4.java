public class Ex12Ch4{
   public static void main(String[] args){
   printTriangleType(15, 7, 7);
   }
   public static void printTriangleType(int a, int b, int c){
      if (a+b < c || b+c < a || c+a < b){
         throw new IllegalArgumentException("One side’s length is longer than the sum of the other two.");
      }else if (a == b || a == c || b == c ){
         System.out.print("isosceles");
      }else if (a == b && b == c){
         System.out.print("equilateral");
      }else {
         System.out.print("scalene ");
      }
   }
}