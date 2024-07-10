/*Write a java program that checks a number from 0 to 5 and print its spelling. If the number is greater than 5 print
 the number is greater than 5

 Input : var=4
 output : four

 Input : var=6
 output: number is greater than 6

 input : var=-6
 output:???
  */

public class ifelse4 {

    public static void main(String[] args) {

        int var = -6;
        if (var < 0) {

            System.out.println(var + " is less than zero");
        } else if (var == 0) {

            System.out.println("Zero");
        } else if (var == 1) {

            System.out.println("One");
        } else if (var == 2) {

            System.out.println("Two");
        } else if (var == 3) {

            System.out.println("Three");
        } else if (var == 4) {

            System.out.println("Four");
        } else if (var == 5) {

            System.out.println("Five");
        } else {
            System.out.println(var + " is greater than 5");
        }
    }
}
