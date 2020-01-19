import java.util.*;
public class Ex21Ch3
{
   public static void main(String[] args)
   {
      Scanner scanner = new Scanner(System.in);
      processName(scanner);
   }
   public static void processName( Scanner input)
   {
      System.out.print("Please enter your full name: ");
      String n = input.nextLine();
      System.out.print("The name in uppercase characters is: " + n.toUpperCase());
   }
   
}