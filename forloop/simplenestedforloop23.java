//10
//9     8
//7     6       5
//4     3       2       1

public class simplenestedforloop23 {

    public static void main(String[] args) {

        int rows = 4;
        int num = 10;

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(num + " ");
                num = num - 1;
            }

            System.out.println();
        }
    }
}



/****************************************************************************************************************
class Solution3{

    public static void main (String[]args){

        int row = 4;
        int num = row * ( row + 1)/2;

        for ( int i = 1; i<=row; i++){

            for ( int j = 1; j<=i ; j++){

                System.out.print(num + " ");
                num--;
            }
            System.out.println();
        }
    }
}
 */
