//4     4   4   4
//5     5   5   5
//6     6   6   6
//7     7   7   7

public class simplenestedforloop12 {

    public static void main(String[] args) {

        int rows = 4;
        int num = 4;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows; j++) {

                System.out.print(num + " ");
            }
            System.out.println();
            num = num + 1; // num++
        }
    }
}
