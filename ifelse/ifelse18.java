/*write a Java Program to input 5 numbers from the keyboard and find their sum and average */

import java.util.Scanner;

public class ifelse18 {

    public static void main(String[] args) {

        int i, n = 0, s = 0;
        double avg;

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input the five numbers : ");

            for (i = 0; i < 5; i++) {

                n = sc.nextInt();

                s += n;

            }

            avg = s / 5;

            System.out.println("The sum of 5 no is : " + s + "\n The Average is : " + avg);

            sc.close();
        }
    }
}
