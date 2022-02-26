package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		int a = 9739;
		int b = a/2;
		boolean flag = true;
		for (int i=2; i<b; i++) {
			int c = a%i;
			if (c == 0) {
				flag = false;
				break;
			}
			}
			  if (flag == false) { 
				  System.out.println(a+ " Is not a Prime Number"); 
			  } 
			  else {
			  System.out.println(a+ " Is a Prime Number"); 
			  }
	}
}
