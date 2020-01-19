public class StudentTest
{
   public static void main(String[] args)
   {
   Student student = new Student(23, "CS", "Dagmara", "Female");
   
   System.out.println(student.getAge());
   System.out.println(student.getCourse());
   System.out.println(student.getName());
   System.out.println(student.getGender());
   
   System.out.println(student);
      }

}