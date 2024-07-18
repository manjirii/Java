/*
 WAP to take size of array from user and also take integer elements from user print product of odd index only
 */

import java.io.*;

public class arrayeasy3 {
    public static void main(String[] args) throws IOException {
        int product = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Size of an array:");

        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.println("Enter elements of an array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (i % 2 != 0) {
                product = product * arr[i];
            }
        }
        System.out.println(product);
    }
}
