import java.util.*;
public class Carkl
{
   public static void main(String[] args){
      
      Car car1 = new Car();
      car1.setName("Audi");
      car1.setYear(2009);
      car1.setModel("A5");
      car1.setEngine(1.8 );
      car1.setDoors(3);
      car1.setColor("blue");
      car1.setTransmission("manual");
      car1.setHorse(230); 
      car1.setPrice(99000);
      System.out.println(car1);
   
      Car car2 = new Car("Mercedes", 2019, "GML", 4.9, 5, "metalic", "automatic", 300, 900000);
      System.out.println(car2);
  
      Scanner console = new Scanner(System.in);  
      Car car3 = new Car();
      car3.skaner(console);

   
      System.out.println(car3);
     
      Car arr[] = new Car[3];
      arr[0] = car1;
      arr[1] = car2;
      arr[2] = car3;
      int counter = 0;
      for (int i = 0; i < 3; i++) {
         if(arr[i].isNewAndHp()) {
            counter++; 
         }
      }
   
      System.out.println("How many cars is newer than 2016 and has more than 200 HP: " +counter);
      int c = 0;
      for (int i = 0; i < 3; i++) {
         if(arr[i].AudiOrMercedes()) {
            c++;
         } 
      }
   
      System.out.println("How many cars are Audi or Mercedes?: "+c);

      for (int i = 0; i<3; i++){
         System.out.print("Car is: "+arr[i].priceCar());   
      }

   }
          
}