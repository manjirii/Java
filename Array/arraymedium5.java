/*
Write a program to take size of array from user and also take integer elements from user.
Find the minimum element from the array.
*/

import java.io.*;

public class arraymedium5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an array:");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {

                min = arr[i];
            }
        }
        System.out.println("The smallest element in an array is " + min);
    }
}
