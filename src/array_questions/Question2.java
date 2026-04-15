package array_questions;

public class Question2 {
//Print even & odd no from array (a={1,2,3,4,5,6})
//even = 3   odd = 3


    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6};
        int EvenNo = 0;
        int OddNo = 0;
        int i = 0;
        while (i < a.length) {
            if (a[i] % 2 == 0) {
                EvenNo++;
            } else {
                OddNo++;
            }
            i++;
        }
        System.out.println(" Total even numbers are :  " + EvenNo);
        System.out.println("Total odd numbers are :  " + OddNo);

    }

}
