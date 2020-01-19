import java.util.*;
import java.io.*;
public class Ex17Ch6{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner (new File("data17.txt"));
      inputStats (input);
   }
   public static void inputStats (Scanner input){
      int linecount = 0;
      int maxtokens = 0;
      String thelongestline = "";
      while(input.hasNextLine()){
         String line = input.nextLine();
         Scanner word = new Scanner(line);
         linecount++;
         int numberoftokens = 0;
         int longest = 0;
         while(word.hasNext()){
            String w = word.next();
            numberoftokens++;
            if (w.length()>longest){
               longest = w.length();
            }  
         }
         if (numberoftokens>maxtokens){
            maxtokens = numberoftokens;
            thelongestline = line;
         }
         System.out.printf("%s%d%s%d%s%d%s\n","Line ",linecount," has ",numberoftokens," tokens (longest = ",longest,")");       
      }
      System.out.print("Longest line: "+ thelongestline);
   }
}