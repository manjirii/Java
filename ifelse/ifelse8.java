/* Write a program to check day number (1-7) and print the corresponding day of week
 Input 1: 1
 Output: Monday

 Input 1: 6
 Output: Saturday

 Input 1: 8
 Output: ???
 
 */

public class ifelse8 {

    public static void main(String[] args) {

        int day = 5;
        if (day < 1 && day > 7) {

            System.out.println("Invalid Day Number");
        } else if (day == 1) {

            System.out.println("Monday");
        } else if (day == 2) {

            System.out.println("Tuesday");
        } else if (day == 3) {

            System.out.println("Wednesday");
        } else if (day == 4) {

            System.out.println("Thursday");
        } else if (day == 5) {

            System.out.println("Friday");
        } else if (day == 6) {

            System.out.println("Saturday");
        } else {

            System.out.println("Sunday");
        }
    }
}
