import java.util.Scanner;  //importing Scanner package to enable user input
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class DateDiff {
	 public static void main(String[] args) {
		 
		 Scanner scnr = new Scanner(System.in);  //Creating Scanner
		 
		 System.out.println("You will input 2 dates (mm/dd/yy).");
		 System.out.println("Enter month (number)");
		 int m1 = scnr.nextInt();
		 System.out.println("Enter day");
		 int d1 = scnr.nextInt();
		 System.out.println("Enter year");
		 int y1 = scnr.nextInt();
		 System.out.println("Enter month");
		 int m2 = scnr.nextInt();
		 System.out.println("Enter day");
		 int d2 = scnr.nextInt();
		 System.out.println("Enter year");
		 int y2 = scnr.nextInt();
		 
		 //Setting the dates
		 LocalDate Date1 = LocalDate.of(y1, m1, d1);
		 LocalDate Date2 = LocalDate.of(y2, m2, d2);
		 
		 //Period class used to find difference between the dates 
		 Period d = Period.between(Date1, Date2);
		 
		 //Placing differences between years/month/day into int variables
		 int days = d.getDays();
		 int months = d.getMonths();
		 int years = d.getYears();
		 
		 //The following prevents negative numbers in case the first date is smaller than the second.  
		 if(d.getDays() < 0) {
	            days = d.getDays() * -1;
	        }
	        else if (d.getMonths() < 0) {
	            months = d.getMonths() * -1;
	        }
	        else if (d.getYears() < 0) {
	            years = d.getYears() * -1;
	        }

		 //Printing the difference to the console
		 System.out.println("The difference between the two dates is " + months + " months, " +
	                days + " days, and " + years + " years.");
	 }
}
