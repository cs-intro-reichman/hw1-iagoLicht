// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		// Replace this comment with your code
		int number = 517;
		int hundreds = (number / 100);
		int tens = (number / 10) % 10;
		int ones = (number % 10);

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}
