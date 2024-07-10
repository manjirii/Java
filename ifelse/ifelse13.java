/*Write a Java Program that reads two floating-point numbers and tests whether they are same up to three decimal places
 Test Data
 input : 25.586
 input2 : 25.589
 Output: They are different
 */

import java.util.Scanner;

public class ifelse13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input floating-point number:");
        double x = sc.nextDouble();

        System.out.println("Input floating-point another number:");
        double y = sc.nextDouble();

        sc.close();

        x = Math.round(x * 1000);  //Multiply by 1000 to shift three decimal places to the left.Convert to integer to truncate decimal parts
        //x = x / 1000;

        y = Math.round(y * 1000);
        //y = y / 1000;

        if (x == y) {

            System.out.println("They are same up to three decimal places");
        } else {

            System.out.println("They are different");
        }

    }
}
