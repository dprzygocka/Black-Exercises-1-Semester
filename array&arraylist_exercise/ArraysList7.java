import java.util.*;
public class ArraysList7{
   public static void main(String[] args){
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(33);
      numbers.add(44);
      numbers.add(55);
      numbers.add(66);
      numbers.add(77);
      numbers.add(88);
      numbers.add(99);
      numbers.add(1);
      numbers.add(2);

      System.out.println("The sum is: "+sum(numbers));
      System.out.println("You are looking for number on "+searchNumber(numbers)+" place in an array.");
      System.out.println("New array numbers2: "+arrayPopulate());
      System.out.println("New array called digits: "+ arrayDigits(arrayPopulate()));
      System.out.println("New array reversedDigits: "+ arrayReversed(arrayDigits(arrayPopulate())));
      System.out.println("Number of fives in an newArray is: "+ countNumberOfFives(populateNewArray()));
   }
   public static int sum (ArrayList<Integer> numbers){
      int sum = 0;
      for (int i = 0; i< numbers.size(); i++){
         sum+= numbers.get(i);
      }
      return sum;
   }
   public static int searchNumber(ArrayList<Integer> numbers){
      Scanner console = new Scanner(System.in);
      System.out.print("What number are you looking for?: ");
      int num = console.nextInt();

      for (int i = 0; i< numbers.size(); i++){
         if (numbers.get(i) == num){
            return i;
         }
      }
      return -1;
      
   }
   public static ArrayList<Integer> arrayPopulate (){
      ArrayList<Integer> numbers2 = new ArrayList<Integer>();
      for (int i =0; i< 7; i++){
         if (i==0){
            numbers2.add(1);
         }else {
            numbers2.add(numbers2.get(i-1)*2);
         }
      }
      return numbers2;
   
   }
   public static ArrayList<Integer> arrayDigits(ArrayList<Integer> numbers){   
      ArrayList<Integer> digits = numbers;
      return digits;
   }
   public static ArrayList<Integer> arrayReversed(ArrayList<Integer> digits){
      ArrayList<Integer> reversedDigits = new ArrayList<Integer>();
      for (int i = 0; i < digits.size(); i++){
       reversedDigits.add(digits.get(digits.size()-1-i));
      }
      return reversedDigits;

   }
   public static ArrayList<Integer> populateNewArray(){
      ArrayList<Integer> newArray = new ArrayList<Integer>();
      for (int i = 1; i<10; i++){
         newArray.add(i);
      }
      for (int i = 9; i>0; i--){
         newArray.add(i);
      }
      return newArray;
   }
   public static int countNumberOfFives (ArrayList <Integer> newArray){
      int count = 0;
      for (int i = 0; i< newArray.size(); i++){
         if (newArray.get(i)== 5){
            count++;
         }
      }
      return count;
   }




}