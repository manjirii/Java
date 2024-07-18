/*
Write a program to find the sum of even and odd numbers in an array.Display the sum value.
 */

import java.io.*;

public class arraymedium3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of an array:");

        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter elements of an array:");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = Integer.parseInt(br.readLine());
        }

        int esum = 0;
        int osum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                esum = esum + arr[i];
            } else {
                osum = osum + arr[i];
            }
        }
        System.out.println("The sum of even elements are : " + esum);
        System.out.println("The sum of odd elements are : " + osum);
    }
}
