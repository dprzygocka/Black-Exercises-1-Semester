import java.util.*;
import java.io.*;
public class Ex15Ch6{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("data15.txt"));
      coinFlip (input);
   }
   public static void coinFlip (Scanner input){
      while(input.hasNextLine()){
         int countheads = 0;
         int counttails = 0;
         String line = input.nextLine().toLowerCase();
         Scanner side = new Scanner (line);
         while(side.hasNext()){
            String s = side.next();
            if (s.equals("h")){
               countheads++;
            }else{
               counttails++;
            }
         }
         double procent = (double)(100*countheads)/(countheads+counttails);
         System.out.printf("%d%s%.1f%s\n",countheads," heads (",procent,"%)");
         if (procent > 50){
            System.out.println("You win!\n");
         }
         
      }
   }
}