package day4;

import java.util.Scanner;

// Display this AP ---->   1,3,5,7,9...n
public class Question10 {

	public static void main(String[] args) {
//        Scanner Sc=new Scanner(System.in);
//        System.out.println("Select the End-Point of AP  :");
//        int n=Sc.nextInt();
//        for (int i=1;i<=n;i++){
//            if (i%2!=0){
//                System.out.println(i);
//            }
//        }


// Find the highest factor of a number 'n' (other than itself)     70

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number  :");
        int x = Input.nextInt();
        int HF = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                HF = i;
            }
        }
        System.out.println(HF);
    }
}
