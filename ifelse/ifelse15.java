/*Write a Java program that takes a year from the user and prints whether it is leap year or not */

import java.util.Scanner;

public class ifelse15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input the year;");
        int year = sc.nextInt();

        sc.close();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {

            System.out.println(year + " is not a leap year");
        }
    }
}
