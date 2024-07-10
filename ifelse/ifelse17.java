/*Write a Java Program to display n terms of natural numbers and their sum */

import java.util.Scanner;

public class ifelse17 {

    public static void main(String[] args) {

        int i, n, sum = 0;

        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input number :");
            n = sc.nextInt();
            sc.close();
        }

        System.out.println("The first n natural numbers are : " + n);

        for (i = 1; i <= n; i++) {

            System.out.println(i);
            sum += i;
        }

        System.out.println("The Sum of Natural Numbers upto " + n + " terms : " + sum);
    }
}
