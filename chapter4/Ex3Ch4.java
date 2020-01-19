public class Ex3Ch4
{
   public static void main(String[] args)
   {
      System.out.print(season (31 , 2));
   }
   public static String season (int day, int month)
   {
      if (month >= 3 &&  day >=16){
         return "spring";
      }else if (month >=6 && day >= 16){
         return "summer";
      }else if (month >= 9 && day >= 16){
         return "fall";
      }else {
         return "winter";
      }
   }
}