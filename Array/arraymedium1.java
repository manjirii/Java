/*
Write a program to create an array of 'n' integer elements.
Where 'n' value should be taken from the user.
Insert the values from user and find the sum of all elements in the array.
 */

import java.io.*;

public class arraymedium1 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of an array: ");

        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter elements in the array:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }

        System.out.println("Sum of array = " + sum);
    }
}
