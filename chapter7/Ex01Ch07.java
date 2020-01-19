public class Ex01Ch07{
   public static void main(String[] args){
      int [] numbers =  {47, 58, 201, 98, 106, 58, 65};
      int value = 58;
      System.out.println("number: "+value+" is on index: "+ firstIndexOf(numbers, value));
   }
   public static int firstIndexOf (int [] numbers, int value){
      for (int i = 0 ; i< numbers.length; i++){
         if (numbers[i] == value){
            return i;
         }
      }
      return -1;
   }
}