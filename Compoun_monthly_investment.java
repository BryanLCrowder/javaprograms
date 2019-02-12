/*
 * import scanner
 * prompt user to enter the amount invested
 * prompt user to enter the annual interest rate
 * create 2 columns to out put the years and value
 * columns should go for 30 years.
 */


package cit260;
import java.util.Scanner;
public class A6dot7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter investment value: ");
		
		double investmentAmount = input.nextDouble();
		
		System.out.println("Enter Interest Rate ");
		
		double monthlyInterestRate = input.nextDouble();
		
		System.out.println("Years" + "\t Future Value" );
		
		for (int count = 1; count < 31; count++) {
			
			System.out.print(count);
			
			System.out.printf("\t %.2f%n",  futureInvestmentValue(
					
						investmentAmount, 
						
						monthlyInterestRate / 12, 
						
						count));}
		
		
	}
	
	
	public static double futureInvestmentValue (
			double investmentAmount,
			double monthlyInterestRate, 
			int years) {
			double answer =	investmentAmount * Math.pow(1 + monthlyInterestRate/100, years * 12);
			return answer;
			
		
	}}


