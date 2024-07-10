//Write a program to check whether the number is a palindrome number or not (2332)
//Output : 2332 is a palindrome number
//Palindrome is when after reverse , the reverse Num is same as that of the original Number

public class simplewhile10 {

    public static void main(String[] args) {

        int num = 2332;
        int rev = 0;
        int temp = num;

        while (temp != 0) {

            rev = rev * 10 + (temp % 10); // to store reverse number
            temp /= 10; // temp = temp / 10
        }

        if (num == rev) {

            System.out.println(num + " is a palindrome number");

        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }
}
