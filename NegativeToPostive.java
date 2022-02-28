package week1.day1.assignments;

public class NegativeToPostive {

	public static void main(String[] args) {
		int a = 100;
		if (a<0) {
			int b = -(a);
			System.out.println("The postive number of" +a+ " is "+b);
		}else {
			if (a== 0) {
				System.out.println("The given number is 0");	
			}else
			System.out.println("The given number " +a +" is Postive");
		}

	}

}
