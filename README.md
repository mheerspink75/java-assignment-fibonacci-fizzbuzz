Fibonacci & FizzBuzz
==================

1. Accept the assignment to create a forked branch
2. clone your fork to your local machine
3. import the project into eclipse as a maven project
4. implement the methods in the `Fibonacci` and `FizzBuzz` classes
5. verify that your implementation is correct by running the `FibonacciTests` and `FizzBuzzTests` classes as JUnit tests
6. Commit your changes and push them to your fork
7. Copy and paste the url of your fork into the submit assignment area on Schoology

---

FizzBuzz:

dividesTest();

```
    @Test
    public void dividesTest() {
    	//a is not evenly divisible by b -> false?
        assertTrue(FizzBuzz.divides(3, 3));
        assertTrue(FizzBuzz.divides(5, 5));
        assertTrue(FizzBuzz.divides(15, 3));
        assertTrue(FizzBuzz.divides(15, 5));
```

---

messages();
main();

working on a solution here...
https://replit.com/@MattHeerspink/strArray#Main.java

```
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

		// Need to determine the correct equation to pass the tests
		// Also, need to return the message array with correct messages and no null
		// values
		if (start > end) {
			throw new IllegalArgumentException();
		}

		// determine array length and create int array
		int length = (end - start) + 1;
		int[] intArray = new int[length];

		// start the count and fill the int array
		int count1 = start;
		for (int i = 0; i < length; i++) {
			intArray[i] = count1;
			count1++;
		}

		// Create a string array for the messages
		String[] strArray = new String[intArray.length];
		for (int i = 0; i < intArray.length; i++) {

			// Need to determine the division equation here...
			// And, need to handle null values
			if (intArray[i] % 2 == 1) {
				strArray[i] = String.valueOf(intArray[i] + ": FizzIsOdd");
			}
		}

		return strArray;
	}

	/**
	 * For this main method, iterate over the numbers 1 through 115 and print the
	 * relevant messages to sysout
	 */
	public static void main(String[] args) {

		// Need to determine how to print the relevant messages here...
		for (int i = 1; i <= 115; i++) {
			System.out.println(i);
		}
	}
}
```