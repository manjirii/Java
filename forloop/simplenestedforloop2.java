// 4    5   6   7
// 4    5   6   7
// 4    5   6   7
// 4    5   6   7


public class simplenestedforloop2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            int x = 4;

            for (int j = 1; j <= 4; j++) {

                System.out.print(x + " ");
                x = x + 1;
            }
            System.out.println();
        }
    }
}
