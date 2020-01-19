import java.util.*;
import java.io.*;
public class Ex18Ch06{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner (new File("data18.txt"));
      plusScores (input);
   }
   public static void plusScores (Scanner input){
      while(input.hasNextLine()){
         String nameline = input.nextLine();
         int numberofplus = 0;
         int num = 0;
         if(input.hasNextLine()){
            String scoreline = input.nextLine();
            Scanner ithem = new Scanner(scoreline);
            while(ithem.hasNext()){
               String i = ithem.next();
               num = i.length();
               while (i.contains("+")){
                  numberofplus++;
                  i = i.substring(i.indexOf("+")+1);
               }
            }
         }
         double sum = (double)((numberofplus*100)/num);
         System.out.printf("%s%s%.1f%s\n",nameline,": ",sum,"% plus");
      }
   }
}