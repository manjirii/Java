//C2W1      C2W2        C2W3
//C2W1      C2W2        C2W3
//C2W1      C2W2        C2W3

public class simplenestedforloop11 {

    public static void main(String[] args) {

        int row = 3;
        for (int i = 1; i <= row; i++) {

            int num = 1;
            for (int j = 1; j <= row; j++) {

                System.out.print("C2W" + num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
