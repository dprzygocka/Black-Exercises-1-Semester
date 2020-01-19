import java.util.*;
public class Car
{
   private String name;
   private int year;
   private String model;
   private double engine;
   private int doors; //(3 or 5)
   private String color;
   private String transmission; //automatic or manual
   private int horse;
   private int price;
   
   public Car() {}
   
   public Car( String name, int year, String model, double engine, int doors, String color, String transmission, int horse, int price)
   {
      this.name = name;
      this.year = year;
      this.model = model;
      this.engine = engine;
      this.doors = doors;
      this.color = color;
      this.transmission = transmission;
      this.horse = horse;
      this.price = price;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setYear(int year)
   {
      this.year = year;
   }
   public void setModel(String model)
   {
      this.model = model;
   }
   public void setEngine(double engine)
   {
      this.engine = engine;
   }
   public void setDoors(int doors)
   {
      this.doors = doors;
   }
   public void setColor(String color)
   {
      this.color = color;
   }
   public void setTransmission(String transmission)
   {
      this.transmission = transmission;
   }
   public void setHorse(int horse)
   {
      this.horse  = horse;
   }
   public void setPrice(int price){
      this.price = price;
   }
   public String getName()
   {
      return name;
   }
   public int getYear()
   {
      return year;
   }
   public String getModel()
   {
      return model;
   }
   public double getEngine()
   {
      return engine;
   }
   public int getDoors()
   {
      return doors;
   }
   public String getColor()
   {
      return color;
   }
   public String getTransmission()
   {
      return transmission;
   }
   public int getHorse()
   {
      return horse;
   }
   public int getPrice(){
      return price;
   }   
   public String toString()
   {
      return "Car: "+ " Name: "+ this.name + ", Year: "+ this.year + ", Model: "+ this.model + ", Engine: "+ this.engine + ", Doors: " + this.doors 
      + ", Color: " + this.color +
       ", Transmission: " + this.transmission + ", Horse: " + this.horse +", Price: "+ this.price;
   }
   
   public void skaner (Scanner input)
   {
   System.out.print("What is the name of the car?: ");
   this.name = input.next();
   System.out.print("What is the year of the car?: ");
   this.year = input.nextInt();
   System.out.print("What is the model of the car?: ");
   this.model = input.next();
   System.out.print("What is the engine of the car?: ");
   this.engine = input.nextDouble();
   System.out.print("the car has 3 or 5 doors?: ");
   this.doors = input.nextInt();
     while (this.doors != 3 && this.doors != 5)
      {
         System.out.print("Please enter 3 or 5 doors.");
         this.doors = input.nextInt();
      }
   System.out.print("What is the color of the car?: ");
   this.color = input.next();
   System.out.print("the car is manual or automatic? : ");
   this.transmission = input.next();
   System.out.print("How many horse power does the car has? : ");
   this.horse = input.nextInt();
   System.out.print("What is price of the car?: ");
   this.price = input.nextInt();
   }
   
   public  boolean isNewAndHp() 
   {
   if (this.year > 2016 && this.horse > 200 )
      {
         return true;
      }
   return false;
      
   }
   public boolean AudiOrMercedes() 
   {
   if (this.name.equals("Audi") || this.name.equals("Mercedes")) 
   {
      return true;
   }
   return false;
   }
   public String priceCar(){
      if (this.price < 100000){
         return("Cheap");
      }else if (this.price <= 500000 && this.price>=100000) {
         return("Medium");
      }else {
         return("Expensive");
      }
   }
   
}