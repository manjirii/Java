//write a program that takes a number , if the number is even print that number in reverse order, or if the number is odd print 
//that number in reverse order by difference of two.
//Input : 6
//Output : 6 5 4 3 2 1

//Input : 5
//Output : 7 5 3 1

public class simplewhile7 {

    public static void main(String[] args) {

         int num = 6;
        //int num = 7;

        if (num % 2 == 0) {

            while (num >= 1) {

                System.out.print(num + " ");
                num--;
            }
        }

        else {
            while (num >= 1) {

                System.out.print(num + " ");
                num = num - 2;
            }
        }

        System.out.println();
    }
}
