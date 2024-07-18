/*
Write a program , take 10 input from the user and print only elements that are divisible by 5
 */

import java.io.*;

public class arrayeasy6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of an array:");

        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The elements divisible by 5 in the array are: ");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 5 == 0) {

                System.out.print(arr[i] + " ");
            }

        }

        System.out.println();

    }
}
