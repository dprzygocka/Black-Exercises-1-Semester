import java.util.*;
public class Ex15Ch4{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Grade: %.1f",getGrade(scanner));
   }
   public static double getGrade (Scanner input){
      System.out.print("Enter a score: ");
      int score = input.nextInt();
      if (score <0 || score > 100){
         throw new IllegalArgumentException ("Enter score between 0-100");
      }else if (score < 60) {
         return 0.0;
      }else if (score >=60 && score <= 62){
         return 0.7;
      }else if ( score >= 95){
         return 4.0;
      }
      double sc = 0.8;
      for(int i = 63; i<= 94; i++){
         sc += 0.1;
         if (i == score){
            return sc;
         }
      }
      return -1;
      
   }
           
}