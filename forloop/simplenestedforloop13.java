//14    15  16  17
//15    16  17  18
//16    17  18  19
//17    18  19  20

public class simplenestedforloop13 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            int num = 14 + i - 1;

            for (int j = 1; j <= 4; j++) {

                System.out.print(num++ + " ");
            }
            System.out.println();
            num = num + 1;
        }
    }
}
