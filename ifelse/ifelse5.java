/* write a java program, in whicg according to month no print the no of days in that month
 Input : month=7
 Output : July has 31 days

 Input : month=13
 Output : invalid month 

 Input : month=-6
 output : ???
 */

public class ifelse5 {

    public static void main(String[] args) {

        int month = 1;
        if (month <= 0 || month > 12) {

            System.out.println("Invalid Month");
        } else if (month == 1) {

            System.out.println("January has 31 days");
        } else if (month == 2) {

            System.out.println("February has 28 or 29 days");
        } else if (month == 3) {

            System.out.println("March has 31 days");
        } else if (month == 4) {

            System.out.println("April has 30 days");
        } else if (month == 5) {

            System.out.println("May has 31 days");
        } else if (month == 6) {

            System.out.println("June has 30 days");
        } else if (month == 7) {

            System.out.println("July has 31 days");
        } else if (month == 8) {

            System.out.println("August has 31 days");
        } else if (month == 9) {

            System.out.println("September has 30 days");
        } else if (month == 10) {

            System.out.println("october has 31 days");
        } else if (month == 11) {

            System.out.println("November has 30 days");
        } else if (month == 12) {

            System.out.println("December has 31 days");
        }
    }
}
