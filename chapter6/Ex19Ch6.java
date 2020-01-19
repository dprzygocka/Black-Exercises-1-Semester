import java.util.*;
import java.io.*;
public class Ex19Ch6{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner input = new Scanner(new File("data19.txt"));
      PrintStream output = new PrintStream(new File("data19output.txt"));
      leetSpeak (input, output);
   }
   public static void leetSpeak (Scanner input, PrintStream output){
      while (input.hasNextLine()){
         String a = input.nextLine();
         Scanner word = new Scanner (a);
         while(word.hasNext()){
            String w = word.next();
            while (w.contains("o")){
               w = w.substring(0,w.indexOf("o"))+"0"+w.substring(w.indexOf("o")+1);
            }
            while (w.contains("l")){
               w = w.substring(0,w.indexOf("l"))+"1"+w.substring(w.indexOf("l")+1);
            }
            while (w.contains("e")){
               w = w.substring(0,w.indexOf("e"))+"3"+w.substring(w.indexOf("e")+1);
            }
            while (w.contains("a")){
               w = w.substring(0,w.indexOf("a"))+"4"+w.substring(w.indexOf("a")+1);
            }
            while (w.contains("t")){
               w = w.substring(0,w.indexOf("t"))+"7"+w.substring(w.indexOf("t")+1);
            }
            while (w.contains("s") && w.indexOf("s")==w.length()-1){
               w = w.substring(0,w.indexOf("s"))+"Z";
            }
            output.print("("+w+") ");
         }
         output.println();
      }
   }
   
}