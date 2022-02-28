package week1.day1.assignments;

import java.util.Arrays;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		int[] ar = { 1, 2, 20, 4, 6, 7, 8, 9, 40, 14 };
		Arrays.sort(ar);
		int a = ar.length;
		int b =  a-2;
		System.out.println(ar[b]);
		
	}
	
	

}
