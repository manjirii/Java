/*
Write a program to find the common elements between two arrays.
*/

import java.io.*;

public class arraymedium7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of first array: ");
        int size1 = Integer.parseInt(br.readLine());
        int arr1[] = new int[size1];

        System.out.println("Enter the size of a second array: ");
        int size2 = Integer.parseInt(br.readLine());
        int arr2[] = new int[size2];

        System.out.println("Enter The elements of first array :");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Enter The elements of second array :");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("The common elements in an array are: ");
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {

                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}
