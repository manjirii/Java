public class rhombus {

    public static void printPattern(int n) {

        int i, j;

        for (i = 1; i <= n; i++) { // outer loop to handle no of rows

            for (j = 1; j <= n - i; j++) {

                System.out.print(" "); // inner loop to print spaces
            }

            for (j = 1; j <= n; j++) { // inner loop to print stars

                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 6;
        printPattern(n);
    }
}
