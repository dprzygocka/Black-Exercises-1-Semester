public class Student
{
   private int age;
   private String course;
   private String name;
   private String gender;
   private Double gpa;

   public Student() {}

   public Student(int age, String course,String name, String gender, Double gpa )
   {
      this.age = age;
      this.course = course;
      this.name = name;
      this.gender = gender;
      this.gpa = gpa;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   public void setCourse( String course)
   {
      this.course = course;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public void setGender( String gender)
   {
      this.gender = gender;
   }
   public void setGpa( Double gpa)
   {
      this.gpa = gpa;
   }
   public int getAge()
   {
      return age;
   }
   public String getCourse()
   {  
      return course;
   }
   public String getName()
   {
      return name;
   }
   public String getGender()
   {
      return gender;
   }
   public Double getGpa()
   {
      return gpa;
   }
   
   public String toString(){
      return "Student: " + "age: " + this.age + " " + "course: " + this.course + " " + "name: " + this.name + " " + "gender: " + this.gender + " " + "gpa: " + this.gpa;
   }
   public double Count() 
   {  int num = 0;
      double gpa = getGpa();
      if (gpa > 3.0){
         num +=1;
         }
      return num;
   }
}


