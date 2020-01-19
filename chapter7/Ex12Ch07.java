public class Ex12Ch07{
   public static void main(String[] args){
      int [] bids = {200, 300, 250, 1, 950, 40};
      int price = 0;
      System.out.print(priceIsRight(bids, price));
   }
   public static int priceIsRight (int[] bids, int price){
      int closest = 0;
      for (int i = 0; i< bids.length; i++){
         if (bids[i] >= closest && bids[i] <= price){
            closest = bids[i];
         }
      }
      if (closest == 0){
         return -1;
      }
      return closest;
   }
}