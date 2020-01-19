public class Ex13Ch07{
   public static void main(String[] args){
      int [] array = {6, 84, 15, 9, 0, -2, 8, 14, 7, 108, 67, 87, 33};
      System.out.print(longestReverseSortedSequence (array));
   }
   public static int longestReverseSortedSequence  (int[] array){
      if (array.length != 0){
         int count = 1;
         int maxcount = 0;
         for(int i=0; i<array.length-1; i++){
            if (array[i] >= array[i+1]){
               count++;
            }else if (count > maxcount){
               maxcount = count;
               count =1;
            }else{
               count = 1;
            }
         }
         return maxcount;
      }
      return 0;
   }
}// it doesn't count -2 so I always start count from 1
//better way?