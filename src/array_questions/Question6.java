package array_questions;


// Print array elements in reverse orders

public class Question6 {

    public static void main(String[] args) {

        int arr [] = {100,200,300,400,500};
        int Print = 0;

        for (int i = arr.length-1 ; i >= 0 ; i--){
            System.out.println(arr[i]);
        }


    }
}
