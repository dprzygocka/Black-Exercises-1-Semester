import java.util.*;

public class StudentTest2
{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Student 1:");
      System.out.print("What is your age?: ");
      int age = scanner.nextInt();
      System.out.print("What is your course?: ");
      String course = scanner.next();
      System.out.print("What is your name?: ");
      String name = scanner.next();
      System.out.print("What is your gender?: ");
      String gender = scanner.next();
      System.out.print("What is your gpa?: ");
      Double gpa = scanner.nextDouble();
      
      Student student = new Student();
      student.setAge(age);
      student.setCourse(course);
      student.setName(name);
      student.setGender(gender);
      student.setGpa(gpa);
    
      System.out.println("Student 2:");
      System.out.print("What is your age?: ");
      int age2 = scanner.nextInt();
      System.out.print("What is your course?: ");
      String course2 = scanner.next();
      System.out.print("What is your name?: ");
      String name2 = scanner.next();
      System.out.print("What is your gender?: ");
      String gender2 = scanner.next();
      System.out.print("What is your gpa?: ");
      Double gpa2 = scanner.nextDouble();
      
      Student st2 = new Student();
      st2.setAge(age2);
      st2.setCourse(course2);
      st2.setName(name2);
      st2.setGender(gender2);
      st2.setGpa(gpa2);
      
      System.out.println("Student 3:");
      System.out.print("What is your age?: ");
      int age3 = scanner.nextInt();
      System.out.print("What is your course?: ");
      String course3 = scanner.next();
      System.out.print("What is your name?: ");
      String name3 = scanner.next();
      System.out.print("What is your gender?: ");
      String gender3 = scanner.next();
      System.out.println("What is your gpa?: ");
      Double gpa3 = scanner.nextDouble();
      
      Student st3 = new Student();
      st3.setAge(age3);
      st3.setCourse(course3);
      st3.setName(name3);
      st3.setGender(gender3);
      st3.setGpa(gpa3);
      
      
      System.out.println("Number of students with GPA above 3.0 is: "+ (int)(student.Count() + st2.Count() + st3.Count()));
      System.out.println(student);
      System.out.println(st2);
      System.out.println(st3);
  }

}