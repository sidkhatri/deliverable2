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
		 LocalDate D1 = LocalDate.of(y1, m1, d1);
		 LocalDate D2 = LocalDate.of(y2, m2, d2);
		 
		 //Using the Period class to find the difference between the dates 
		 Period d = Period.between(D2, D1);
		 
		 //Placing differences between months/days/years into int variables
		 int months = d.getMonths(); 
		 int days = d.getDays();  
		 int years = d.getYears(); 
		 
		 //The following prevents negative numbers in case the first date is smaller than the second.  
		 if(months < 0) {
	            months = d.getMonths() * -1;
	        }
	        else if (days < 0) {
	            days = d.getDays() * -1;
	        }
	        else if (years < 0) {
	            years = d.getYears() * -1;
	        }

		 //Printing the difference between dates to the console
		 System.out.println("The difference between the two dates is " + years + " years, " +
	                months + " months, and " + days + " days.");
	 }
}
