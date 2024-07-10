//d     d       d       d
//c     c       c       c
//b     b       b       b
//a     a       a       a

public class simplenestedforloop8 {

    public static void main(String[] args) {

        char ch = 'd';

        for (char i = 1; i <= 4; i++) {

            for (char j = 1; j <= 4; j++) {

                System.out.print(ch + " ");
            }

            ch--;
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
 *          for ( char i = 'd' ; i >= 'a' ; i--){
 * 
 *              for ( int j = 1; j <= 4; j++){
 * 
 *                  System.out.print(i + " ")
 *              }
 * 
 *              System.out.println();
 *          }
 *      }
 *  }
 */
