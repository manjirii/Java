//Write a program to count the digits of the given number
//Input : 942111423
//Output : count of digits = 9

public class simplewhile3 {

    public static void main(String[] args) {

        int digit = 242111423;
        int count = 0;

        while (digit != 0) {

            count++;
            digit = digit / 10;
        }
        System.out.println("Count of digits: " + count);
    }
}
