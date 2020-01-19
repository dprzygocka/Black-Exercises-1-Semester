public class Ex4Ch4{
   public static void main(String[] args){
      System.out.print(colorsInRainbow(7)); 
   }
   public static String colorsInRainbow (int color){
      if (color == 1){
         return "Violet";
      }else if (color == 2){
         return "Indigo";
      }else if (color  == 3){
         return "Blue";
      }else if (color == 4){
         return "Green";
      }else if (color == 5){
         return "Yellow";
      }else if (color == 6){
         return "Orange";
      }else {
         return "Red";
      }
   }
}