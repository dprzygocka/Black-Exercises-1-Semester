import java.util.*;
public class CalendarDateTest {
   public static void main(String[] args) {
      ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
      dates.add(new CalendarDate(1990, 2, 22));
      dates.add(new CalendarDate(2000, 10, 30));
      dates.add(new CalendarDate(2001, 4, 13));
      dates.add(new CalendarDate(2000, 3, 16));
      dates.add(new CalendarDate(2000, 4, 28));
      
      System.out.println("birthdays = " + dates);
      Collections.sort(dates);
      System.out.println("birthdays = " + dates);
   }
}

