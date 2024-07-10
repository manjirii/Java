public class numberchangingpyramid {

    public static void printPattern(int n) {

        int i, j;
        int num = 1;

        for (i = 1; i <= n; i++) { // Outer loop to handle no of rows

            for (j = 1; j <= i; j++) { // Inner loop to handle no of columns

                System.out.print(num + " ");
                num++; // increasing the value of num
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 6;
        printPattern(n);
    }
}
