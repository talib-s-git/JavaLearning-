package array_questions;

import org.w3c.dom.ls.LSOutput;

public class Question3 {
    public static void main() {

        // 2) Search the element in an array : a={10,20,30,40,50}

        int a[] = {10, 20, 30, 40, 50};
        int SearchElement = 40;
        boolean Found = false;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] == SearchElement) {
//                System.out.println("Element Found at index:  " + i);
//                Found = true;
//                break;
//            }
//        }
//        if (! Found){
//            System.out.println("Element not found");
//        }



//  Write using enhanced for loop

        for (int num : a){
            if (num == SearchElement){
                System.out.println("Element found");
                Found =true;
                break;
            }
        }
        if (!Found){
            System.out.println("Element not found");
        }

    }
}
