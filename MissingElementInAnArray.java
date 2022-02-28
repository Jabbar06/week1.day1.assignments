package week1.day1.assignments;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 6, 7, 8, 9, 11, 14 };
		int b = 1;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != i + b) {
				int c = i + b;
				System.out.println("The Missing Element of the array is " + c);
				b = b + 1;
			}
		}

	}

}
