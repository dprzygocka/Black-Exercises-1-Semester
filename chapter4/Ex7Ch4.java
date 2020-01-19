public class Ex7Ch4{
   public static void main(String[] args){
      xo(5);
   }
   public static void xo(int size){
      for (int i = 0; i<= size-1; i++){
         for (int j = 0; j<=size-1; j++){
            if ( j == i || j == size-i-1){
               System.out.print("x");
            }else {
               System.out.print("o");
         }
         }
         System.out.println();
      }
   }
}