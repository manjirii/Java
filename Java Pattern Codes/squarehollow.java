//star will print only when it is in first row or last row or first column or last column otherwise print space only

//import java.util.*;

public class squarehollow {

    public static void printPattern(int n) { // This is function to demonstrate pattern

        int i, j;

        for (i = 0; i < n; i++) { // Outer loop to handle no of rows

            for (j = 0; j < n; j++) { // inner loop to handle no of columns

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {

                    System.out.print("*");
                } else {

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) { // This is driver function

        int n = 6;
        printPattern(n);
    }
}