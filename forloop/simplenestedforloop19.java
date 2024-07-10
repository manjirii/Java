//1C3   4B2     9A1
//16C3  25B2    36A1
//49C3  64B2    81A1

public class simplenestedforloop19 {

    public static void main(String[] args) {

        int rows = 3;
        int x = 1;

        for (int i = 1; i <= rows; i++) {

            int num = rows;
            char ch = 'C';

            for (int j = 1; j <= rows; j++) {

                System.out.print(x * x + "" + ch-- + "" + num-- + " ");
                x++;
            }
            System.out.println();
        }
    }
}

//*********************************************************************************
/*
class Solution9{
    public static void main(String[]args){

        int rows =3;
        int x = 1;

        for ( int i = 1; i<= rows; i++){

            int num = rows;
            int ch = 65 + rows - 1;

            for ( int j = 1; j<=rows ; j++){

                System.out.print(x*x +"" + (char)ch + "" +num +" ")
                num--;
                ch--;
                x++;
            }
            System.out.println();
        }
    }
} */ 
