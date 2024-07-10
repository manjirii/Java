/*Write a java Program that requires the user to enter a single character from the alphabet.Print : Vowels or zconsonants
 depending on user input.If the user input. If the user input is not a letter or is a string of length >1 , print an error message
 */

import java.util.Scanner;

public class ifelse14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input an alphabet");

        // It is a Scanner class method used to get the next complete token from the
        // scanner which is in using.
        // The return type of next() method is the next element in the iteration. The
        // next element can be anything -
        // a string, integer or a character. Java shows a NoSuchElementException if
        // there are no more elements present
        // in the iteration.

        String input = sc.next().toLowerCase();            //If next is used, it gives error

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o")
                || input.equals("u");

        sc.close();

        if (input.length() > 1) {

            System.out.println("Error. Not a single character");
        } else if (!(uppercase || lowercase)) {

            System.out.println("Error.Not a letter uppercase or lowercase letter.");
        } else if (vowels) {

            System.out.println("Input letter is Vowel");
        } else {

            System.out.println("Input letter is a consonant");
        }
    }
}
