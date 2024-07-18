/*
Write a program to find the number of even and odd integers in a given array of integers.
*/

import java.io.*;

public class arraymedium2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of an array:");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter elements of an array:");

        for (int i = 0; i < size; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        int ecount = 0;
        int ocount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

                ecount++;
            } else {
                ocount++;
            }
        }

        System.out.println("Number of even elements : " + ecount);
        System.out.println("Number of odd elements : " + ocount);
    }
}
