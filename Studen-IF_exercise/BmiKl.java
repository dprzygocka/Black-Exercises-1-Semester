public class BmiKl
{
   private double height;
   private double weight;
   
   public BmiKl() {}
   
   public BmiKl(double heihght, double weight)
   {
      this.height = height;
      this.weight = weight;
   }
   public void setHeight(double height)
   {
      this.height = height;
   }
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   public double getHeight()
   {
      return height;
   }
   public double getWeight()
   {
      return weight; 
   }
   public double BodyMasIndex()
   {  
      double weight = getWeight();
      double height = getHeight();
      double outcome = (weight/Math.pow(height,2))*703;
      return outcome;
   }
   
   public String h()
   {
      double outcome = BodyMasIndex();
      if (outcome< 18.5){
         return "underweight";
      }else if (outcome <= 24.9){
         return "normal";
      }else if (outcome <= 29.9){
         return "overweight";
      }else {
         return "obese";
         }
    }
      
}
