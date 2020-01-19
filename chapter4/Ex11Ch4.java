import java.util.*;
public class Ex11Ch4{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      shortestName(scanner, 4);
   }
   public static void shortestName(Scanner input, int n){
      String shortest = "";
      for (int i = 1; i<= n; i++){
         System.out.print("Name#"+ i+": ");
         String name = input.next();
         if (shortest.length() == 0){
            shortest = name;
         }else if (name.length() < shortest.length()){
            shortest = name;
            System.out.print(shortest);
         }
      }
      System.out.print(shortest +"'s name is shortest");
   }
}