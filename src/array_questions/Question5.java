package array_questions;


import java.util.Arrays;

// Sorting an array
public class Question5 {
    public static void main(String[] args) {

        int a[] = {100,600,200,400,500};
        System.out.println("Before sorting...");
        System.out.println(Arrays.toString(a));         //Arrays.toString() -> For 1D array  |  Arrays.deepToString() -> For 2D array

        System.out.println("After sorting");
        Arrays.sort(a);                                 //Sort the array
        System.out.println(Arrays.toString(a));




// Sorting String in an array

//        String Names [] = {"Talib", "Rahman", "Haider", "Taiba", "Muhib"};
//        System.out.println("Before Sorting ..." + Arrays.toString(Names));
//        Arrays.sort(Names);
//        System.out.println("Before Sorting ..." + Arrays.toString(Names));

        }

    }

