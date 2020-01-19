import java.util.*;
public class Ex19Ch4{
   public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   System.out.print(quadrant(scanner));
   }
   public static int quadrant(Scanner input){
      System.out.print("Enter x point: ");
      double x = input.nextDouble();
      System.out.print("Enter y point: ");
      double y = input.nextDouble();
      if (x==0 || y== 0){
         return 0;
      }else if (x >0 && y > 0){
         return 1;
      }else if (x<0 && y>0){
         return 2;
      }else if (x<0 && y<0){
         return 3;
      }else {
         return 4;
      }
   }
}