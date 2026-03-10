package day2;

/*Make a boolean variable isAdult = true and hasTicket = false. Use logical operators to check:
Can the person enter if they are adult and have ticket?
Can the person enter if they are adult or have ticket?*/


public class Question3 {

	public static void main(String[] args) {
		boolean isAdult = true;
		boolean hasTicket = false;
		
		System.out.println("Can the person enter if they are adult and have ticket?:"+" "+ (isAdult && hasTicket));
		System.out.println("Can the person enter if they are adult or have ticket?:"+" "+(isAdult || hasTicket));
		
	}

}
