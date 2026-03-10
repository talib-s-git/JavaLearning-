package day3;
/*Take marks = 85. Print grades:

90+ → "A"

75–89 → "B"

50–74 → "C"

below 50 → "Fail"   */


public class Question4 {

	public static void main(String[] args) {
		int marks = 30;
		if(marks>90) {
			System.out.println('A');
		}
		else if (marks>74 && marks<90) {
			System.out.println('B');
		}
		else if(marks>49 && marks<75) {
			System.out.println('C');
		}
		else {
			System.out.println("Fail");
		}
	}

}
