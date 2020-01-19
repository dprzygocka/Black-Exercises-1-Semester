import java.util.*;
import java.io.*;
public class FileExercise2{
   public static void main(String[] args) throws FileNotFoundException{
      Scanner console = new Scanner(System.in);
      File file = new File("students.txt");
      PrintStream overwrite = new PrintStream(file);
      for (int i = 0; i<3; i++){
         inputToTheFile(console, overwrite);
         System.out.println();
      }
      System.out.println("Students who have avergae above 7:");
      whoHasAverageAbove7(file);
   }
   public static void inputToTheFile(Scanner console, PrintStream overwrite){
      System.out.print("What is your name: ");
      String name = console.next();
      overwrite.print("Name: "+name);
      System.out.print("What do you study: ");
      String course = console.next();
      overwrite.print(" Course: "+course);
      System.out.print("What is your average: ");
      double average = console.nextDouble();
      overwrite.print(" Average: "+average);
      overwrite.println();
   }
   public static void whoHasAverageAbove7(File file) throws FileNotFoundException{
      Scanner input = new Scanner (file); 
      while(input.hasNextLine()){
         String line = input.nextLine();
         Scanner atribute = new Scanner (line);
         while (atribute.hasNext()){
            String smth = atribute.next();
            while (atribute.hasNextDouble()){
               double av = atribute.nextDouble();
               if (av > 7){
                  System.out.println(line);
               }
            }
         }
      }
   }
}