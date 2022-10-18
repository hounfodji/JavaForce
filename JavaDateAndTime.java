/*You are given a date. You just need to write the method, , which returns the day on that date. */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class JavaDateAndTime {
   
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();
        String[] dayTable = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        if(year>2000 && year<3000) {
            Calendar calendar = new GregorianCalendar(/*year,month-1,day*/); //month - 1 because Month value is 0-based. e.g., 0 for January.
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month-1);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            int dayOfWeek  = calendar.get(Calendar.DAY_OF_WEEK);
            System.out.println("dayOfWeek \t: " + dayTable[dayOfWeek-1]); // because table's index start at 0

           
        } 
       
   
        
        scan.close();
    }
}