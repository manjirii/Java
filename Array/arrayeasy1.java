/*WAP to take the size of the array from the user and also take integer elements from the user.Print the sum of
 odd elements only*/

import java.io.*;

public class arrayeasy1 {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.println("Enter array Elements");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] % 2 == 1) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
