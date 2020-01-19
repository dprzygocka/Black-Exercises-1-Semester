public class Ex13Ch3
{
   public static void main(String[] args)
   {
      System.out.print(salary(1000, 5000));
   }
   public static int salary(int fixsalary, int grossale)
   {
      return fixsalary + (int)(0.05*grossale);
   }
}
