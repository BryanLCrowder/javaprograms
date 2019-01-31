/*
 * create a scanner
 * Ask the user to enter in 3 different city's
 * apply those city to variables(strings)
 * sort through the city's by comparing the first two city's if our of order swap
 * then compare the next two city's, if our of order swap, 
 * compare the first two again.
 * display the results.
 */



package cit260;

import java.util.Scanner;




public class A4dot24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the first city: ");
		String c1 = input.nextLine();

		System.out.print("Please enter the second city: ");
		String c2 = input.nextLine();

		System.out.print("Please enter the third city: ");
		String c3 = input.nextLine();

		if (c1.compareToIgnoreCase(c2) > 0);{
			String t = c2;
			c2 = c1;
			c1 = t;
		}
		if (c2.compareToIgnoreCase(c3) > 0);{
			String t = c3;
			c3 = c2;
			c2 = t;
		}
		if (c1.compareToIgnoreCase(c2) > 0);{
			String t = c2;
			c2 = c1;
			c1 = t;
		}
		System.out.println("The three city's are " + c1 + ", " + c2 + ", and " + c3 + ".");
	}

}
