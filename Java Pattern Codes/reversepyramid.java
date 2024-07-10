//Number increasing reverse pyramid pattern

public class reversepyramid {

    public static void printPattern(int n) {

        int i, j;

        for (i = n; i >= 1; i--) { // Outer loop to handle no of rows

            for (j = 1; j <= i; j++) { // printing column values up to the row values

                System.out.print(j + " ");

            }
            System.out.println(); // print new line for each row

        }
    }

    public static void main(String[] args) {

        int n = 6;
        printPattern(n);
    }
}
