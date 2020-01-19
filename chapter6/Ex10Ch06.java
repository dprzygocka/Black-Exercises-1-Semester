import java.util.*;
import java.io.*;
public class Ex10Ch06{
   public static final int maximumlinelength = 60;
   public static void main(String[] args) throws FileNotFoundException {
      File smth = new File ("data10.txt");
      Scanner input = new Scanner(smth);
      PrintStream overwrite = new PrintStream (smth);
      wordWrap(input, overwrite);
   }
   public static void wordWrap (Scanner input, PrintStream overwrite){
      String b = "";
      String c = "";
      while (input.hasNextLine()){
         String a = input.nextLine();
         int hlong = a.length()/maximumlinelength;
         int rest = a.length() - maximumlinelength*hlong;
         for (int i = 0; i< hlong; i++){
            b = a.substring(i*maximumlinelength, maximumlinelength+ i*maximumlinelength);
         }
         c = a.substring(hlong*60, hlong*60+rest);
            
         }
         overwrite.println(b);
         overwrite.println(c);
      }
}
