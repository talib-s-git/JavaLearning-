package day4;

//Count digits in a number (e.g., 12345 → 5 digits)
public class Question8 {

    public static void main(String[] args) {

//        int num = 12345;
//        int count = 0;
//        while (num != 0) {
//            int digit=num%10;   //Extract the last digit (5)
//            count++;
//            num=num/10;
//
//        }
//        System.out.println(count);


// reverse a number (eg; 12345 --> 54321)
//        int num = 12345;
//        int reverse = 0;
//        while (num != 0) {
//            int digit = num % 10; // 5
//            reverse = reverse * 10 + digit;  // 5
//            num=num/10;
//        }
//        System.out.println("Reverse number is :  "+ reverse);



// Check if 1221 is palindrome or not
//        int number = 1221;
//        int original  = number;
//        int reverse = 0;
//        while(number!=0){
//            int digit = number%10;      //1
//            reverse=reverse*10+digit;
//            number=number/10;
//
//        }
//        if (reverse==original){
//            System.out.println("The given number is palindrome");
//        }
//        else {
//            System.out.println("The given number isn't a palindrome");
//        }




// Count the even & odd digits in a number
// (eg: Input=987654321 Output= (Even=5 Odd=4))

//        int Number = 987654321;
//        int Even = 0;
//        int Odd = 0;
//        while (Number != 0) {
//            int digit = Number % 10;     //1
//            if (digit % 2 == 0) {         //1%2=1
//                Even++;
//            } else {
//                Odd++;
//            }
//            System.out.println("Even digits are  " + Even);
//            System.out.println("Odd digits are   " + Odd);
//        }



 // Find sun of all the digits of a number (4556 =20)


        int num = 4556;
        int sum = 0;
        while(num!=0){
            int digit = num % 10;     //6
            sum = sum + digit;       //6
            num = num/10;
        }
        System.out.println("Total sum of digits are:  "+ sum);
    }
}
