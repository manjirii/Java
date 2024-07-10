//Write a program to reverse the given number
//Input : 942111423

public class simplewhile9 {

    public static void main(String[] args) {

        int No = 942111423;
        int rev = 0;
        int temp = No;
        int rem = 0;

        while (temp != 0) {

            rem = temp % 10; // to find the remainder
            rev = rev * 10 + rem; // store reverse number
            temp = temp / 10; // reduce the original num
        }

        System.out.println(No + " After Reverse : = " + rev);
    }
}
