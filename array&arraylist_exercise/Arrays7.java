import java.util.*;
public class Arrays7{
   public static void main(String[] args){
   sumex();
   search();
   populate();
   copyDigits();
   reverse(); 
   count();
   }
   public static void sumex (){
  int [] numbers = new int [9];
   
   numbers [0] = 33;
   numbers [1] = 44;
   numbers [2] = 55;
   numbers [3] = 66;
   numbers [4] = 77;
   numbers [5] = 88;
   numbers [6] = 99;
   numbers [7] = 1;
   numbers [8] = 2;
   
   int sum = 0;
   for (int i = 0; i< numbers.length; i++){
      sum+= numbers[i];
   }
   
   System.out.println("The sum is: "+sum);
   }
   public static void search(){
   int [] numbers = new int [9];
   
   numbers [0] = 33;
   numbers [1] = 44;
   numbers [2] = 55;
   numbers [3] = 66;
   numbers [4] = 77;
   numbers [5] = 88;
   numbers [6] = 99;
   numbers [7] = 1;
   numbers [8] = 2;
   
   Scanner console = new Scanner(System.in);
   System.out.print("What number are you looking for?: ");
   int num = console.nextInt();

   for (int i = 0; i< numbers.length; i++){
      if (numbers[i] == num){
         System.out.println("The number is on the "+i+" index in an array.");
      }
   }
   }
   public static void populate(){
   int [] numbers = new int [7];

   for (int i = 0; i < numbers.length; i++){
      if (i == 0){
         numbers[i] = 1;
      }else {
      numbers[i] = numbers[i-1]*2;
      }
   }
   System.out.println("Array number is populated: "+Arrays.toString(numbers));
   }
   public static void copyDigits(){
   int [] numbers = new int [9];
   
   numbers [0] = 33;
   numbers [1] = 44;
   numbers [2] = 55;
   numbers [3] = 66;
   numbers [4] = 77;
   numbers [5] = 88;
   numbers [6] = 99;
   numbers [7] = 1;
   numbers [8] = 2;
   
   int [] digits = new int [numbers.length];
   for (int i = 0; i< numbers.length; i++){
         digits[i] = numbers[i];
   }
   System.out.println("Array digits: "+Arrays.toString(digits));
   //int [] digits = Arrays.copyOf(numbers, numbers.length);
   //System.out.print(Arrays.toString(digits));
   }
   
   public static void reverse(){
   int [] numbers = new int [9];
   
   numbers [0] = 33;
   numbers [1] = 44;
   numbers [2] = 55;
   numbers [3] = 66;
   numbers [4] = 77;
   numbers [5] = 88;
   numbers [6] = 99;
   numbers [7] = 1;
   numbers [8] = 2;
   
   
   int [] digits = new int [numbers.length];
   int [] ndigits = new int [digits.length];
   for (int i = 0; i< numbers.length; i++){
           digits[i] = numbers[i];
           
   }
   
   for (int i = 0; i < digits.length; i++){
       ndigits[i] = digits[digits.length-1-i];
   }
   System.out.println("Array ndigits: "+Arrays.toString(ndigits));
   }
   public static void count(){
   int [] digits = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};
      int count = 0;
      for (int i = 0; i< digits.length; i++){
         if (digits[i] == 5){
            count+=1;
         }
      }
      System.out.print("Number of 5's is: "+count);
   }
}