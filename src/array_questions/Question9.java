package array_questions;


import java.util.Arrays;

//  Find the largest number in an array
public class Question9 {
    public static void main(String[] args) {


        int arr[] = {100, 300, 200, 700, 500, 900};
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length-1]);



 // Method : Without sorting (recommended)

    int largest = arr [0];    //First element is start
        for ( int i = 1 ; i < arr.length ; i++){
            if ( arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println( "Largest number is :  " + largest);

        System.out.println("Hello");


    }
}



