//Write a program to count the Odd digits of the given number
//Input : 942111423
//Output : count of odd digits = 5

public class simplewhile4 {

    public static void main(String[] args) {

        int digit = 942111423;
        int count = 0;

        while (digit != 0) {
            int rem = digit % 10;

            if (rem % 2 == 1) {
                count++;
            }

            digit = digit / 10;
        }

        System.out.println("Count of Odd digits : " + count);
    }

}
