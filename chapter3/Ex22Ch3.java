import java.util.*;
public class Ex22Ch3
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      ExamResult(scanner); 
   }
   public static void ExamResult(Scanner input)
   {
      System.out.print("What is your internal test score?: ");
      int internal = input.nextInt();
      System.out.print("What is your final exam score?: ");
      int finalscore = input.nextInt();
      if (internal < 20 || finalscore < 40)
      {
         System.out.print("You have failed :(");
      }else {
         System.out.print("You have passed!");
      }
   } 
}  


