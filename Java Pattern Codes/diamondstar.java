public class diamondstar {
    
    public static void printPattern(int n){

        int i,j;

        for (i=1;i<=n;i++){                     //Outer loop to handle upper part

            for(j=1;j<=n-i;j++){                //inner loop to print spaces

                System.out.print(" ");
            }

            for(j=1;j<=2*i-1;j++){              //inner loop to print stars

                System.out.println("*");
            }

            System.out.println();
        }
    }
}
