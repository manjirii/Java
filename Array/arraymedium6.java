
/*
Write a program to take the size of array from user and also take integer elemets from user.
Find the maximum element from the array.
*/
import java.io.*;

public class arraymedium6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the size of an array: ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element in an array is " + max);
    }

}
