//Write a Program to print the square of even digits of the given number
//Input : 942111423
//Output : 4 16 4 16

public class simplewhile5 {

    public static void main(String[] args) {

        int digit = 942111423;
        while (digit != 0) {

            int rem = digit % 10;

            if (rem % 2 == 0) {
                System.out.print((rem * rem) + " "); // Square of even no
            }

            digit /= 10; // digit = digit/10
        }
        System.out.println("\n");
    }
}
