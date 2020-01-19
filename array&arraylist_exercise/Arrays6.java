public class Arrays6{
   public static void main(String[] args){
      int [] digits2 = {1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};
      System.out.print("Number of 5's is: "+countFives(digits2));
   }
   public static int countFives (int [] digits2){
      int count = 0;
      for (int i = 0; i< digits.length; i++){
         if (digits2[i] == 5){
            count+=1;
         }
      }
      return count;
   }
}