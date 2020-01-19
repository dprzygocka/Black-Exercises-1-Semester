import java.util.Arrays; 
public class Arrays5{
   public static void main(String[] args){

   int [] numbers = {33,44,55,66,77,88,99,1,2};
   System.out.print("New array: "+Arrays.toString(array(numbers)));
   }
   public static int [] array(int[] numbers){
   
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
   
}