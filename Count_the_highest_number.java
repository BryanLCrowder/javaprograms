/*
 *import scanner
 * prompt use to enter in the numbers to be counted and its occurrences of the largest
 * read the first number and store it in max and set count to one
 * create loop
 * while not 0 read the next number
 * if > max, max gets number and count gets 1
 * else if = to max increment count
 * end loop
 * display max and count
 */


package cit260;
import java.util.Scanner;
public class A5dot41 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter numbers followed by 0: ");
		
		int x = input.nextInt();
		int max = x;
		int count = 1;
		while (x != 0) {
			x = input.nextInt();
			if (x > max ) {
				max = x;
				count = 1;
			}
			else if (x == max) {
				count++;
			}
			
		}
		
		System.out.print("The largest number is " + max + " and hit occurs " + count + " times.");
		
		
		
		

	}

}
