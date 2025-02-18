/*
Write a program to print the count of digits in elements of the aarray.
Input : Enter array elements : 02 255 2 1554
Output: 2 3 1 4  
*/

import java.io.*;

public class array1countDigits {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of an array: ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter elements of an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int temp = arr[i];
            while (temp != 0) {
                cnt++;
                temp = temp / 10;
            }
            System.out.println("Count of digit in number" + arr[i] + "=" + cnt);
        }
    }
}
