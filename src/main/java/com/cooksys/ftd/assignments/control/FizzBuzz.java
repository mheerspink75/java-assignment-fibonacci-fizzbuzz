package com.cooksys.ftd.assignments.control;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * FizzBuzz is an old programming exercise. The goal is to iterate over a range
 * of numbers and print a message about each number's divisibility.
 * <p>
 * The message is generated the following way: *) if the number is divisible by
 * three, the message is `Fizz` *) if the number is divisible by five, the
 * message is `Buzz` *) if the number is divisible by both three and five, the
 * message is `FizzBuzz` *) otherwise, no message is produced
 * <p>
 * The exact message format for this assignment is specified in the `message(n)`
 * method.
 */
public class FizzBuzz {

	/**
	 * Checks whether a given int `a` is evenly divisible by a given int `b` or not.
	 * For example, `divides(4, 2)` returns `true` and `divides(4, 3)` returns
	 * `false`.
	 *
	 * @param a the number to be divided
	 * @param b the number to divide by
	 * @return `true` if a is evenly divisible by b, `false` otherwise
	 * @throws IllegalArgumentException if b is zero
	 */
	public static boolean divides(int a, int b) throws IllegalArgumentException {

		// Throw Exception if b = 0
		if (b == 0) {
			throw new IllegalArgumentException();
		}

		return a % b == 0;

		/*
		 * // Check for whole number and remainder if (a >= 1 && a > b && b >= 1) {
		 * 
		 * boolean isEvenlyDivisible = (a / b) % 2 == 0; return isEvenlyDivisible;
		 * 
		 * } else { return false; }
		 */
	}

	/**
	 * Generates a divisibility message for a given number. Returns null if the
	 * given number is not divisible by 3 or 5. Message formatting examples: 1 ->
	 * null // not divisible by 3 or 5 3 -> "3: Fizz" // divisible by only 3 5 ->
	 * "5: Buzz" // divisible by only 5 15 -> "15: FizzBuzz" // divisible by both
	 * three and five
	 *
	 * @param n the number to generate a message for
	 * @return a message according to the format above, or null if n is not
	 *         divisible by either 3 or 5
	 */
	public static String message(int n) {

		String result = n + ": ";
		if (divides(n, 3)) {
			result += "Fizz";
		}
		if (divides(n, 5)) {
			result += "Buzz";
		}
		return result.equals(n + ": ") ? null : result;

		/*
		 * // Need to determine if the junit assertTrue() tests are correct??? String
		 * message = "";
		 * 
		 * if (n % 3 != 0 && n % 5 != 0) { return null; } if (n % 3 == 0) { message = n
		 * + ": Fizz"; } if (n % 5 == 0) { message = n + ": Buzz"; } if (n % 3 == 0 && n
		 * % 5 == 0) { message = n + ": FizzBuzz"; }
		 * 
		 * return message;
		 */
	}

	/**
	 * Generates an array of messages to print for a given range of numbers. If
	 * there is no message for an individual number (i.e., `message(n)` returns
	 * null), it should be excluded from the resulting array.
	 *
	 * @param start the number to start with (inclusive)
	 * @param end   the number to end with (exclusive)
	 * @return an array of divisibility messages
	 * @throws IllegalArgumentException if the given end is less than the given
	 *                                  start
	 */
	public static String[] messages(int start, int end) throws IllegalArgumentException {
		
    	if (end < start) {
    		throw new IllegalArgumentException();
    	}

		List<String> result = new ArrayList<>();
		for (int i = start; i < end; i++) {
			String msg = message(i);
			if (msg != null) {
				result.add(msg);
			}
		}
		
		return result.toArray(new String[result.size()]);

		/*
		 * // Need to determine the correct equation to pass the tests // Also, need to
		 * return the message array with correct messages and no null // values if
		 * (start > end) { throw new IllegalArgumentException(); }
		 * 
		 * // determine array length and create int array int length = (end - start) +
		 * 1; int[] intArray = new int[length];
		 * 
		 * // start the count and fill the int array int count1 = start; for (int i = 0;
		 * i < length; i++) { intArray[i] = count1; count1++; }
		 * 
		 * // Create a string array for the messages String[] strArray = new
		 * String[intArray.length]; for (int i = 0; i < intArray.length; i++) {
		 * 
		 * // Need to determine the division equation here... // And, need to handle
		 * null values if (intArray[i] % 2 == 1) { strArray[i] =
		 * String.valueOf(intArray[i] + ": FizzIsOdd"); } }
		 * 
		 * return strArray;
		 */
	}

	/**
	 * For this main method, iterate over the numbers 1 through 115 and print the
	 * relevant messages to sysout
	 */
	public static void main(String[] args) {
		
	  	for (String message : messages(1, 116)) {
    		System.out.println(message);
    	}
		
		/*
		// Need to determine how to print the relevant messages here...
		for (int i = 1; i <= 115; i++) {
			System.out.println(i);
		}
		*/
	}
}
