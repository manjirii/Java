// 9       8       7
// 9       8       7
// 9       8       7

public class simplenestedforloop6 {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            int x = 9;
            for (int j = 1; j <= 3; j++) {

                System.out.print(x + " ");
                x = x - 1;
            }

            System.out.println();
        }
    }
}
