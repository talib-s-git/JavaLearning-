package array_questions;


// How to read data in runtime(taking input from keyboard)

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of Students :  ");
        int NumberOfStudents = Sc.nextInt();
        String arr [] = new String[NumberOfStudents];
        for (int i=0 ; i <= arr.length-1 ; i++ ){
            System.out.println( "Enter the name :  ");
            arr[i] = Sc.next();

        }
        System.out.println( "Final array is : " + Arrays.toString(arr));


    }
}
