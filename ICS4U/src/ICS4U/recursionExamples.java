/**
 * 
 */
package ICS4U;

import java.util.Scanner;

/**
 * @author Simon Cadieux
 * February 28, 12,018 
 * A bunch of different ways of using recursion
 */

public class recursionExamples {
	
	/**
	 * @param n
	 * 			Input Number For Factorial
	 * @return
	 * 			The End Result Of The Factorial
	 */
	public static long Factorial(long n) {
		
		if(n <=1) {
		return 1;
		}
		else {
			return n*Factorial(n-1);
		}
	}
	
	/**
	 * @param n
	 * 			The Input Number To Be Added
	 * @return
	 * 			The End Result Of The Sum
	 */
	public static long sum(long n) {
		
		if(n <= 1) {
			return 1;
		}
		else {
			n = n + sum(n-1);
			return n;
		}
	}
	
	/**
	 * @param n
	 * 			The Base
	 * @param b
	 * 			The Exponent
	 * @return
	 * 			The End Result
	 */
	public static long Exponent(long n, int b) {
		
		if(b <= 1) {
			System.out.println(n);
			return n;
		}
		else {
			System.out.println(n*Exponent(n,b-1));
			return n*Exponent(n,b-1);
		}
	}
	
	/**
	 * @param n
	 * 			The Decimal Number To Be Converted
	 * @return
	 * 			The Converted Binary Number
	 */
	public static String dectobin(long n) {
		
		String out = "";
		if(n <= 1) {
			return "1";
		}
		else if(n%2 == 1) {
			out = dectobin(n/2) + 1;
			return out;
		}
		else if(n%2 == 0){
			out = dectobin(n/2) + 0;
			return out;
		}
		return out;
		
	}
	
	/**
	 * 
	 * @param x
	 * 			The Binary Number To Be Converted
	 * @param n
	 * 			The Place Of What Number It Checks Next
	 * @return
	 * 			The Converted Decimal Number
	 */
	public static long bintodec(String x, int n) {
		
		if(n <= 1) {
			return (Integer.parseInt((((Character)x.charAt(n-1)).toString()))* (long)Math.pow( 2,(x.length()-(n+2))));
		}
		else {
			return (((Integer.parseInt((((Character)x.charAt(n-1)).toString()))* (long)Math.pow( 2,(x.length()-(n+2))))) + bintodec(x,n-1));
		}
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String out2 = "";
		int b;
		String c = "";
		//System.out.println("Factorial: please enter a number");
		//long n = scan.nextLong();
		//long out = Factorial(n);
		//System.out.println("Factorial " + n + " = " + out);
		
		//System.out.println("sum: please enter a number");
		//n = scan.nextLong();
		//out = sum(n);
		//System.out.println("sum " + n + " = " + out);
		
		//System.out.println("Exponent: please enter two numbers");
		//n = scan.nextLong();
		//b = scan.nextInt();
		//out = Exponent(n, b);
		//System.out.println("Exponent " + n + "^" + b + " = " + out);
		
		//System.out.println("Decimal To Binary: please enter a number");
		//n = scan.nextLong();
		//out2 = dectobin(n);
		//System.out.println("Decimal to Binary " + n + " = " + out2);
		
		//scan.nextLine();
		out2 = "";
		System.out.println("Binary To Decimal: please enter a number");
		c = scan.nextLine();
		long out = bintodec(c,c.length());
		System.out.println("Binary To Decimal " + c + " = " + out);
		
	}

}
