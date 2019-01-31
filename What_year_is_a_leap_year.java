/*
 * create scanner 
 * prompt user to enter month and year
 * assign month to number
 * find the number of days of the month 
 * create a calculation for the years of leap years 
 * determine if its not a leap year.
 * make sure that every 100th year is not a leap year
 * make an exception on the 400th year for the leap year
 * find the correct leap year month.
 * display the days of the month to user.
 */

package cit260;
import java.util.Scanner;
public class A3dot11 {
	public static void main(String[] args) {
//Using the scanner to bring values in from the user.
		Scanner input = new Scanner(System.in);
//User will enter the month.
		System.out.print("Please enter month number: ");
		int month = input.nextInt();
//User will enter the year.
		System.out.print("Please enter year number: ");
		int year = input.nextInt();
//Will assign the number to the corresponding month.
		switch (month){
        case 1: System.out.print("January, " + year); 	break;
        case 2: System.out.print("Febuary, " + year); 	break;
        case 3: System.out.print("March, " + year); 	break;
        case 4: System.out.print("April, " + year);     break;
        case 5: System.out.print("May, " + year);	 	break;
        case 6: System.out.print("June, " + year); 		break;
        case 7: System.out.print("July, " + year); 		break;  
        case 8: System.out.print("August, " + year); 	break;
        case 9: System.out.print("September, " + year); break;
        case 10: System.out.print("October, " + year); 	break;
        case 11: System.out.print("Novemeber, " + year);break;
        case 12: System.out.print("December, " + year); 
    }
//This it the calculation of what month has how many days.
		if (month == 1 ^ month == 3 ^ month == 5 ^ month == 7 ^ month == 8 ^ month == 10 ^ month == 12) 
			{System.out.print(" has 31 days."); }
//This calculates what year is a leap year.
			else if (year % 4 == 0  && month == 2 && ( year % 100 != 0) || (year % 400 == 0)) {System.out.print(" has 29 days.");}
//This calculates what years are excluded from a leap year.	
			else if ((year % 4 != 0 && year % 100 == 0) || (year % 400 != 0) && month == 2) {System.out.print(" has 28 days.");}
//The remaining months just end up having 30 days.
				else {System.out.print(" has 30 days.");}
		
	}
}
