import java.io.*;

public class Ex1addition{
   public static void main(String[] args) throws FileNotFoundException{
   PrintStream output = new PrintStream(new File("data10.txt"));
   output.println("Twas brillig and the slithy toves");
   output.println("did gyre and gimble in the wabe.");
   output.println("All mimsey were the borogroves,");
   output.println("and the mome raths outgrabe.");
   output.flush();
   output.close();
   }
}