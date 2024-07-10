public class palindrometraingle {

    public static void printPattern(int n) {

        int i, j;

        for (i = 1; i <= n; i++) { // outer loop to handle no of rows

            for (j = 1; j <= 2 * (n - i); j++) { // inner loop to print the spaces

                System.out.print(" ");
            }

            for (j = i; j >= 1; j--) { // inner loop to print the first part

                System.out.print(j + " ");
            }

            for (j = 2; j <= i; j++) {          //inner loop to print the second part

                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 6;
        printPattern(n);
    }
}
