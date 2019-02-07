/*
 * create a loop that will count, and go through every 2 
 * skip even numbers because they're all divisible by 2.
 * create a static boolean for prime and palindromic.
 * create the criteria to make sure no number has a square root.
 * test the boolean that checks the first number to the last number.
 * display the numbers in a 10 rows and up to 100.
 */

package cit260;

public class A6ot26 {

	public static void main(String[] args) {
		//find 100 palindromic primes
		System.out.printf("%7d", 2);
		for(int x = 3, count = 1; count < 100; x += 2) {
			
			if (isPal(x) && isPrime(x)) {
				
				System.out.printf("%7d", x);
				
				if (++count % 10 == 0) {
					
					System.out.println();
			}
		}
				
	}

}
	//This checks to see if the number is prime or not
	private static boolean isPrime(int x) {
		
		for (int i = 2; i < Math.sqrt(x); i++) {
			
			if (x % i == 0)
				//Will return false if if the number is not prime
					return false;
		}
		return true;
	}
//this checks to see if the number is a palindrome
	private static boolean isPal(int x) {
		String s = x + "";
		for (int left = 0, right = s.length() - 1; left <right ; left ++, right--) {
		if(s.charAt(left) != s.charAt(right) ) {
			return false;
		}
		}
		return true;
	}}
