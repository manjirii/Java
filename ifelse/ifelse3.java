/* Write a Java Program , take a number , and print whether it is positive or negative
 Input : num=5
 Output : 5 is a positive number

 Input : num=-9
 Output : -9 is a megative number

 Input : num=0
 output : ???
 */

public class ifelse3 {
    public static void main(String[] args) {

        int var = -9;
        if (var < 0) {

            System.out.println(var + " is Negative Number");
        } else if (var > 0) {

            System.out.println(var + " is a Positive Number");
        } else {

            System.out.println(var + " is neither positive nor negative number");
        }
    }
}
