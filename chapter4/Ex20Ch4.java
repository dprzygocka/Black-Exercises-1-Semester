import java.util.*;
public class Ex20Ch4{
   public static void main(String[] args){
   Scanner scanner = new Scanner (System.in);
   System.out.print(numRepeat(scanner, 4));
   }
   public static int numRepeat(Scanner input, int n){
      int [] row = new int[n];
      for (int i = 0; i <= n-1; i++){
         System.out.print("Enter a number: ");
         int number = input.nextInt();
         row[i] = number;    
         }
      int count = 0;
      for (int j = 0; j< row.length; j++){
         int dcount=0;
         for (int k = 0; k< row.length; k++){
            if (row[j] == row[k] && j!=k){
                  dcount ++;
            }
         if (dcount>1){
            count++;
         }
         }
      }
      return count;
   }
}