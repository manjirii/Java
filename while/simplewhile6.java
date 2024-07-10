//Write a program to print the sum of all even numbers and the multiplication of odd numbers between 1 to 10
//Output : sum of even numbers between 1 to 10 = 30
//Multiplication of odd numbers between 1 to 10 = 945 

public class simplewhile6 {

    public static void main(String[] args) {

        int sum = 0;
        int product = 1;
        int i = 1;

        while (i <= 10) {

            if (i % 2 == 0) {
                sum = sum + i; // Sum of even no
            }

            else {
                product = product * i; // multiplication of odd no
            }
            i++;
        }

        System.out.println("Sum of Even numbers between 1 to 10 = " + sum);
        System.out.println("Multiplication of Odd numbers between 1 to 10 = " + product);
    }
}
