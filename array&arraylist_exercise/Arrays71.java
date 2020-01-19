import java.util.*;
public class Arrays71{
   public static void main(String[] args){
      int [] numbers = {33,44,55,66,77,88,99,1,2};
      int[] newnumbers = new int [7];
      int [] digits2 = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};

      System.out.println("The sum is: "+sum(numbers));
      System.out.println("You are looking for number on "+searchNumber(numbers)+" place in an array.");
      System.out.println("New array newnumbers: "+Arrays.toString(populateArray(newnumbers)));
      System.out.println("New array digits: "+ Arrays.toString(array(numbers)));
      System.out.println("Reversed array of digits: "+Arrays.toString(arrayReversed(numbers)));
      System.out.println("Number of 5's is: "+countFives(digits2));
   }
   public static int sum (int [] numbers){
      int sum = 0;
      for (int i = 0; i< numbers.length; i++){
         sum+= numbers[i];
      }
      return sum;
   }
   public static int searchNumber(int [] numbers){
      Scanner console = new Scanner(System.in);
      System.out.print("What number are you looking for?: ");
      int num = console.nextInt();

      for (int i = 0; i< numbers.length; i++){
         if (numbers[i] == num){
            return i;
         }
      }
      return -1;
      
   }

   public static int [] populateArray (int [] newnumbers){
      for (int i = 0; i < newnumbers.length; i++){
         if (i == 0){
            newnumbers[i] = 1;
         }else {
            newnumbers[i] = newnumbers[i-1]*2;
         }
      }
      return newnumbers;
   }
   public static int [] array(int[] numbers){
      int [] digits = new int [numbers.length];
      for (int i = 0; i< numbers.length; i++){
            digits[i] = numbers[i];
      }
      return digits;
   }
   public static int [] arrayReversed(int[] numbers){
   
      int [] digits = new int [numbers.length];
      int [] ndigits = new int [digits.length];
      for (int i = 0; i< numbers.length; i++){
              digits[i] = numbers[i];       
      }
      for (int i = 0; i < digits.length; i++){
          ndigits[i] = digits[digits.length-1-i];
      }
      return ndigits;
   }
   public static int countFives (int [] digits2){
      int count = 0;
      for (int i = 0; i< digits2.length; i++){
         if (digits2[i] == 5){
            count+=1;
         }
      }
      return count;
   }



   
}