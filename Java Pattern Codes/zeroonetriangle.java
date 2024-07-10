//Zero-one triangle pattern
//if the sum of (i+j) is even then print 1 otherwise print 0

public class zeroonetriangle {

    public static void printPattern(int n) {

        int i, j;

        for (i = 1; i <= n; i++) { // Outer loop to handle no of rows

            for (j = 1; j <= i; j++) { // Inner loop to handle no of columns

                if ((i + j) % 2 == 0) {

                    System.out.print(1 + " ");
                } else {

                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 6;
        printPattern(n);
    }
}
