// Computes the future value of a saving investment.

import javax.management.StringValueExp;

public class FVCalc {
	public static void main(String[] args) {
		;
		int currentValue = Integer.parseInt(args[0]);
		Double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double raten = (rate / 100);
		double FutureValue = currentValue * (Math.pow(1 + raten, n));
		System.out.println("After " + n + " years" + "," + " a $" + currentValue + " saved at " + rate + "%25 "
				+ "will yield $" + FutureValue);
			

	}

}