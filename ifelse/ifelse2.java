/*Write a Java Program, take a number, and print whether it is less than 10 or greater than 10
 Input 1 : var=5
 Output : 5 is less than 10

 Input 2 : var=16
 output: 16 is greater than 10

 input 3 : var=10
 output : ???
 */

public class ifelse2 {

    public static void main(String[] args) {

        int var = 5;
        if (var < 10) {

            System.out.println(var + " is less than 10");
        } else if (var > 10) {

            System.out.println(var + " is greater than 10");
        } else {

            System.out.println(var + " is equal to 10");
        }
    }
}
