package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		int a = 962786359;
		int sum= 0;
	while (a > 0) {
		int reminder = a%10;
		int quotient = a/10;
		a = quotient;
		sum = reminder+ sum;
	}
	System.out.println(sum);

	}

}
