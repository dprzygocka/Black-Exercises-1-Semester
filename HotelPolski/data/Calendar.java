import java.util.*;
import java.io.*;

//pg 700/703¬
/* use x.compareTo(y) method to compare two OBJECTS, eg calendar dates.
*/

public class Calendar implements Comparable<Calendar> {

   private int day;
   private int month;
   private int year;
   
   public Calendar() {
   }
   
   public Calendar(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   public int compareTo(Calendar other) {
   
      if(year!=other.year) {
         return year - other.year;
      }
      else if(month!=other.month) {
         return month - other.month;
      }
      else {
         return day - other.day;
      }
   
   }
   
   public int getYear() {
      return year;
   }

   public int getMonth() {
      return month;
   }

   public int getDay() {
      return day;
   }
   
   public String toString() {
      return year + "/" + month + "/" + day;
   }
   
}
