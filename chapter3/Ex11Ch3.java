public class Ex11Ch3
{
   public static void main(String[] args)
   {
      System.out.print(distance(3, 5, 7, 2, 4, 6)); 
   }
   public static double distance( int x1, int y1, int z1, int x2, int y2, int z2)
   {
      return (Math.sqrt(Math.pow((x1-x2),2)+ Math.pow((y1-y2),2)+ Math.pow((z1-z2),2)));
   }
   
}