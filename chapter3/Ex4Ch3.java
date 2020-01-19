public class Ex4Ch3
{
 public static void main(String[] args)
 {
   printDecrSquare(4,8);
 }
 public static void printDecrSquare (int min, int max)
 { 
   int z = max;
   int numberofloops = max - min;
   for (int i = 0; i<=numberofloops; i++)
   {  
      for (int j = z; j>= min; j--)
      {
         System.out.print(j); 
      }
      int n = max;
      for(int j =numberofloops-i; j<numberofloops; j++)
      {  
         System.out.print(n);
         n--;
      }
      z--;
      System.out.println();  
   }
   
 }
}