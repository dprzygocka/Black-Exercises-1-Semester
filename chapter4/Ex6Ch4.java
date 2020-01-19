public class Ex6Ch4{
   public static void main(String[] args){
      printEven (3, 3);
   }
   public static void printEven(int firstnumber, int secoundnumber){
      if (firstnumber < secoundnumber){
         String num = "";
         for (int i = firstnumber; i<= secoundnumber; i++){
            num+=i;
            num+= " ";
         }
         System.out.print("["+num+"]");
     }else if (firstnumber > secoundnumber){
         String num = "";
         for (int i = firstnumber; i>= secoundnumber; i--){
               num+=i;
               num+= " ";
         }
         System.out.print("["+num+"]");
     }else if ( firstnumber == secoundnumber && firstnumber % 2 == 0){
         System.out.print("["+firstnumber+"]");
         }
   }
            
}