/*write a Java Program to solve quadratic equations 
 Test data 
 Input a : 1
 Input b : 5
 input c : 1

 [Formula = b*b-4.0*a*c ]
 */

import java.util.Scanner;

public class ifelse11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a:");
        int a = sc.nextInt();

        System.out.println("Input b:");
        int b = sc.nextInt();

        System.out.println("Input c:");
        int c = sc.nextInt();

        sc.close();

        int result = b * b - 4 * a * c;

        if (result > 0.0) {

            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);

            System.out.print("The roots are " + r1 + "and " + r2);
        } else if (result == 0.0) {

            double r1 = -b / (2.0 * a);
            System.out.print("The root is " + r1);
        } else {

            System.out.print("The equation has no real roots.");
        }
    }

    
}
