public class Ex06Ch07{
   public static void main(String[] args){
      int [] numbers = {2,5,1,3};
      System.out.println(stdev (numbers));
   }
   public static double stdev (int [] numbers){
      double numerator =0;
      double sum =0;
      for(int i = 0; i< numbers.length; i++){
          sum += numbers[i];
      }
      double average = (sum/numbers.length);   
      for (int i =0; i < numbers.length; i++){   
          numerator += Math.pow((numbers[i]-average),2);
      }
      System.out.println(average);
      return Math.sqrt(numerator/(numbers.length));
   }
}