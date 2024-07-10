public class numberincreasingpyramid {

    public static void printPattern(int n) {

        int i, j;

        for (i = 1; i <= n; i++) { // Outer loop to handle number of rows

            for (j = 1; j <= i; j++) {

                System.out.print(j + " "); // printing column values upto the row value
            }

            System.out.println();
        }
    }

    public static void main(String[] args) { // This is driver function

        int n = 6;
        printPattern(n);
    }
}
