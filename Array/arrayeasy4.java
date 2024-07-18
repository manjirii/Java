/*Write a program, take 7 characters as input , Print only vowels from the array */

import java.util.Scanner;

public class arrayeasy4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of an array:");

        int size = sc.nextInt();

        char arr[] = new char[size];

        System.out.println("Enter Array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' ||
                    arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O'
                    || arr[i] == 'U') {

                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();
        sc.close();
    }

}
