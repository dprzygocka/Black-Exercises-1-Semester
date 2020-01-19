import java.io.*;
import java.util.*;
public class Ex01Ch06{
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner (new File("data.txt"));
      boysGirls(input);
   }
   public static void boysGirls(Scanner input ){
      int countboys = 0;
      int boysinteger = 0;
      int countgirls = 0;
      int girlsinteger = 0;
      int countintegers = 1;
      while (input.hasNext()){
         String name = input.next();
         while (input.hasNextInt()){
            if (countintegers % 2 == 0){
               countboys++;
               boysinteger += input.nextInt();    
            }else {
               countgirls++;
               girlsinteger += input.nextInt();
            }
            countintegers++;
         }
      }
      System.out.println(countboys +" boys, "+countgirls+" girls");
      System.out.print("Difference between boys' and girls' sums: "+ Math.abs(boysinteger-girlsinteger));
   }
}