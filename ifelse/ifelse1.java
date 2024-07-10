/*Write a Java Program to check if a number is even or odd
 Input : var=10
 Output : 10 is even no

 Input:var=37;
 Output:37 is an odd no

 Input : var=0
 Output:???
*/

public class ifelse1 {

    public static void main(String[] args) {

        int var = 10;
        if (var % 2 == 0) {

            System.out.println(var + " is an Even Number");
        } else {

            System.out.println(var + " is an Odd Number");
        }
    }
}
