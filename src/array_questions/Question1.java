package array_questions;

public class Question1 {
    public static void main() {


// 1)  Find the sum of elements in an array : a={1,2,3,4,5}
//Sum = 15

        int Sum = 0;
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int a[]= {1,2,3,4,5};

        for (int i=0; i<arr.length;i++){
            Sum = Sum + arr[i];
        }

        System.out.println("Total sum is :  " + Sum);


    }
}
