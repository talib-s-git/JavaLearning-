package day4;

import java.net.SocketOption;
import java.util.Scanner;

//Print numbers from n TO n (Take input from user)
public class Question9 {

	public static void main(String[] args) {
//		Scanner Sc=new Scanner(System.in);
//		System.out.println("Enter x: ");
//		int x=Sc.nextInt();
//		System.out.println("Enter y: ");
//		int y=Sc.nextInt();
//		
//		for(int i=x;i<=y;i++) {
//			System.out.println(i);
//		}
		

		
//Print all even no from 1 ... 100
//		int i=1;
//		for(i=1;i<=100;i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		
//Print all no divisible by 3 till 100
//		int i=1;
//		for(i=1;i<=100;i++) {
//			if(i%3==0) {
//				System.out.println(i);
//			}
//		}
		
// Print the table of 2

//        int i=1;
//        for(i=1;i<=10;i++){
//            System.out.println(2*i);
//        }

//Print the table of 19
//        for (int i=1;i<=10;i++){
//            System.out.println(19*i);
//        }

//another method to print table 19

//        int i=1;
//        for (i=1;i<=190;i++){
//            if (i % 19 == 0){
//                System.out.println(i);
//            }
//Print the desired table (Table of 'n')


            Scanner Sc =new Scanner(System.in);
            System.out.println("Enter the table you want to print :");
            int n=Sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(n*i);
            }


	}

}
