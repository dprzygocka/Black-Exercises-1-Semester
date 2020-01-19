import java.util.*;

public class Bmi
{
   public static void main(String[] args){
   
      Scanner scaner = new Scanner(System.in);
   
      System.out.print("height?: ");
      double height = scaner.nextDouble();
      System.out.print("weight?: ");
      double weight = scaner.nextDouble();
   
      BmiKl person1 = new BmiKl();
      person1.setHeight(height);
      person1.setWeight(weight);
      person1.getHeight();
      person1.getWeight();
      
      System.out.println("person1 BMI = "+ person1.BodyMasIndex());
      System.out.println(person1.h());
      
      System.out.print("height?: ");
      double height2 = scaner.nextDouble();
      System.out.print("weight?: ");
      double weight2 = scaner.nextDouble();
      
      BmiKl person2 = new BmiKl();
      person2.setHeight(height2);
      person2.setWeight(weight2);
      person2.getHeight();
      person2.getWeight();
   
      System.out.println("person2 BMI = "+ person2.BodyMasIndex());
      System.out.println(person2.h());
   }
}