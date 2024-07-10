//9
//9     8
//9     8       7
//9     8       7       6

public class simplenestedforloop26 {

    public static void main(String[] args) {

        int rows = 4;

        for (int i = 1; i <= rows; i++) {

            int num = 9;

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num = num - 1;
            }
            System.out.println();
        }
    }
}
