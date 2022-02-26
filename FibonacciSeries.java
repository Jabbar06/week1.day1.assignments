package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstNum = -1;
		int secNum = 1;
		for (int i = 1; i <= range; i++) {
			int sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}
	}
}
