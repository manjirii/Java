/*Write A Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print
 "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds
 1,000,000.

 Test data
 Input value:25
 */

import java.util.Scanner;

public class ifelse12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input value:");
        double a = input.nextDouble();

        input.close();

        if (a > 0) {

            if (a < 1) {

                System.out.println("Positive Small Number");
            } else if (a > 1000000) {

                System.out.println("Positive large Number");

            } else {

                System.out.println("Positive Number");
            }
        }

        else if (a < 0) {

            if (Math.abs(a) < 1) {

                System.out.println("Negative Small Number");
            } else if (Math.abs(a) > 1000000) {

                System.out.println("Negative Large Number");
            } else {

                System.out.println("Negative Number");
            }
        } else {

            System.out.println("Zero");
        }
    }
}
