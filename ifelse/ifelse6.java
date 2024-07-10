/*Write a program to find a maximum between three numbers
 Inputs1:
 num1 = 1
 num2 = 2
 num3 = 3
 Output: 3 is the maximum between 1,2 and 3

 Inputs2:
 num1 = 1
 num2 = 4
 num3 = 3
 Output: 4 is the maximum between 1,2 and 3

 Inputs3:
 num1 = 42
 num2 = 32
 num3 = 42
 Output: ???
 */

public class ifelse6 {

    public static void main(String[] args) {

        int num1 = 42;
        int num2 = 42;
        int num3 = 42;

        if (num1 > num2 && num1 > num3) {

            System.out.println(num1 + " is Maximum between " + num2 + "and" + num3);
        } else if (num2 > num1 && num2 > num3) {

            System.out.println(num2 + " is Maximum between " + num1 + "and" + num3);
        } else if (num3 > num1 && num3 > num2) {

            System.out.println(num3 + " is Maximum between " + num1 + "and" + num2);
        } else if (num1 > num2 && num1 == num3) {

            System.out.println(num1 + " is greater than " + num2 + " and equal to" + num3);
        } else if (num2 > num3 && num2 == num1) {

            System.out.println(num2 + " is greater than " + num3 + " and equal to" + num1);
        } else if (num3 > num1 && num3 == num2) {

            System.out.println(num3 + " is greater than " + num1 + " and equal to" + num1);
        } else {

            System.out.println("All Numbers Are Eual");
        }
    }
}
