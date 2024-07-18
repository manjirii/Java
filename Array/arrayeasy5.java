/*
 write a program , take 7 characters as input , Print only vowels from the array 
 */

import java.io.*;

public class arrayeasy5 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char carr[] = new char[7];

        System.out.println("Enter 7 characters:");

        for (int i = 0; i < carr.length; i++) {

            carr[i] = (char) br.read();
            br.skip(2);
        }
        System.out.println("Output: ");

        for (int i = 0; i < carr.length; i++) {

            if (carr[i] == 'a' || carr[i] == 'e' || carr[i] == 'i' || carr[i] == 'o' || carr[i] == 'u' ||
                    carr[i] == 'A' || carr[i] == 'E' || carr[i] == 'I' || carr[i] == 'O' || carr[i] == 'U') {

                System.out.print(carr[i] + " ");
            }
        }
        System.out.println();
    }
}
