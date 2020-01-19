import java.util.*;
public class Ex20Ch3
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      applicationDate(scanner);
   }
   public static void applicationDate(Scanner scanner)
   {
      System.out.print("On what day of the month you applied?: ");
      int month = scanner.nextInt();
      System.out.print("What is the name of the month in which you applied?: ");
      String nmonth = scanner.next();
      System.out.print("During which year you applied?: ");
      int year = scanner.nextInt();
      System.out.print("Your application date is "+ nmonth +" "+ month + ", "+ year +"!");

   }
}
