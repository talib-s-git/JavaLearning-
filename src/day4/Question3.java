package day4;
//   Find the factorial of a number using a for loop.


public class Question3 {

	public static void main(String[] args) {
		int a=5;
		int factorial=1;  // 1, 2, 6, 24, 
		
		for(int i=2;i<=a;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of "+a+ " is: "+factorial);

	}

}
