//C     B       A
//C     B       A
//C     B       A

public class simplenestedforloop9 {

    public static void main(String[] args) {

        for (char i = 1; i <= 3; i++) {

            char ch = 'C';
            for (char j = 1; j <= 3; j++) {

                System.out.print(ch + " ");
                ch--;
            }
            System.out.println();
        }
    }
}


/* ************************************* OR ********************************************************* */
/*
 * public class nestedforloop8 {
 * 
 *      public static void main ( String[] args){
 * 
 *          for ( char i = 1 ; i <= 3 ; i++){
 * 
 *              for ( int j = 'C'; j >= 'A'; j--){
 * 
 *                  System.out.print(j + " ")
 *              }
 * 
 *              System.out.println();
 *          }
 *      }
 *  }
 */
