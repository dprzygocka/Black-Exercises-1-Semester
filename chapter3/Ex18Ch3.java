public class Ex18Ch3
{
   public static void main(String[] args)
   {
      reverseVertical("samolot");
   }
   public static void reverseVertical(String a)
   {  
      for (int i = a.length()-1; i>=0; i--)
      {  
         System.out.println(a.charAt(i)); 
      }
   }
   
}