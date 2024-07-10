//Write a program to calculate the factorial of the given number
//Input : 6
//Output : factorial of 6 is 720

public class simplewhile2 {

    public static void main(String[] args) {

        int n = 6;
        int fact = 1;
        int itr = 1;

        while (itr <= 6) {

            fact = fact * itr;
            itr++;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
