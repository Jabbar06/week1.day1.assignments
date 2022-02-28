package week1.day1.assignments;

import java.util.Iterator;

public class Intesection {
	public static void main(String[] args) {

		int[] ar = { 1, 2, 3, 4, 6, 7, 8, 9, 11, 14 };
		int[] ar2 = { 1, 2, 3, 5, 6, 12};
		int b = 1;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar[i] == ar2[j]) {
					System.out.println("The common numbers in the 2 arrays are " + ar2[j]);
				}
			}

		}
	}
}
