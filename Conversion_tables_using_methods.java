/*
 * create a public static method for celsius to fahrenheit
 * create a public static method for fahrenheit to celsius
 * create the main return for these
 * create a display package in a loop for these problems.
 */

package cit260;

public class A6dot8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Celsius\t Fahrenheight\t |\tFahrenheight \t Celsius%n");
		System.out.println("_________________________________________________________");
		double fahrenheight = 120;
		for (int celsius = 40; celsius > 30; celsius--, fahrenheight -=10) {
			System.out.printf(celsius + "\t" + " %.2f\t\t | \t",celsiusToFahrenheit(celsius));
			System.out.printf(fahrenheight + "\t\t %.2f%n", fahrenheitToCelsius(fahrenheight));
			
		}
		}
		public static double celsiusToFahrenheit (double celsius) {
		double fahrenheit = (9.0 /5 ) * celsius + 32;
		
		return fahrenheit;}
	
		public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (5.0 / 9) * (fahrenheit - 32);
			
		return celsius;}
	
	
	
	}

