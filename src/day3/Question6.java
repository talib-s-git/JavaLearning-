package day3;
//   Take int a = 10, b = 20, c = 5;. Print which number is the largest.
	

public class Question6 {

	public static void main(String[] args) {
		int bill = 2323;
		if (bill>5000) {
			System.out.println("You get 20% discount");
		}
		else if (bill>=2000 && bill<=5000) {
			System.out.println("You get 10% discount");
		}
		else if (bill>=1000 && bill<=1999) {
			System.out.println("You get 5% discount");
		}
		else {
			System.out.println("No discount");
		}
	}

}
