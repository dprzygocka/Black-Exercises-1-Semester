public class Ex1Ch4
{
   public static void main(String[] args)
   {
      System.out.print(SumSequence(5));
   }
   public static double SumSequence(int a)
   {  double sum = 0;
      for(int i = 1; i<=a; i++)
      {
          sum += (double)1/((i+2)*i);
      
      }
      return sum;
}   
}