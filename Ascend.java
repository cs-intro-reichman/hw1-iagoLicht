// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		Math.random();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

				int min =.min(a, b , c); 
		
		int max = Math.max(a, Math.max(b, c));
		int middle = a + b + c - min - max;

	}
}
