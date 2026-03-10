package day3;

public class ConditionalStatements {

//1) if
//2) if else
//3) nested if else
//4) switch case
	
	public static void main(String[] args) {
//		1) if statements 
		int Person_age=25;
		if (Person_age>=18)
		{
			System.out.println("Person has right to vote");
		}
		
//		2) else if
		if(Person_age<=18)
		{
			System.out.println("Person is not eligible for vote");
		}
		else
		{
			System.out.println("Person is eligible for vote");
		}
		
//		3) nested if else  --> used when one decision depends on another.
		int cart_value=210;
		boolean Membership=true;
		if (cart_value>=199)
		{
			if(Membership)
			{
				System.out.println("25% Discount applicable");
			}
			else
			{
				System.out.println("Discount is not applicable");
			}
		}
		else
		{
			System.out.println("Discount is not applicable");
		}
		
//		4) switch case --> Used when one value matches multiple conditions
		int day=6;
		switch (day) {
		case 1:System.out.println("Sunday");break;
		case 2:System.out.println("Monday");break;
		case 3:System.out.println("Tuesday");break;
		case 4:System.out.println("Wednesday");break;
		case 5:System.out.println("Thursday");break;
		case 6:System.out.println("Friday");break;
		case 7:System.out.println("Saturday");break;
		default:System.out.println("Invalid week number");
		}
		
		
		
		
		
		
		
	}
		

}
