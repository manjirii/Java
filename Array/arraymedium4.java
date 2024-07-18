/*
Write a program to search a specific element from an array nd return its index.
*/

import java.io.*;

public class arraymedium4 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an array: ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter the search element : ");
        int search = Integer.parseInt(br.readLine());

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == search) {

                System.out.println("Element found at index " + i);
            }
        }
    }
}
