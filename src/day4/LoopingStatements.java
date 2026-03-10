package day4;
//When we need to repeat something many times, instead of writing the same code again and again, we use loops.


public class LoopingStatements {

	
	public static void main(String[] args) {
//		1. for Loop	 -->  Best when you know exactly how many times you want to repeat.
		for (int i=1;i<=5;i++) {    //initialization,condition,incrementation/decrementation in a single line
			System.out.println(i);
		}
		
//		2. while Loop  -->  Used when you don’t know the number of times in advance, but you have a condition.
		int i=1;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
//		3. do-while Loop  -->  Same as while, but guarantees the block runs at least once.
		int a = 10;
		do {
		    System.out.println(a);
		    a++;
		} while (a <= 12);
		
//		4. Enhanced for (For-Each Loop)  -->  Used for arrays/collections.
		int[]numbers= {10,20,30,40};
		for(int num:numbers) {
			System.out.println(num);
		}
		
		
		
		
		
		

	}

}
