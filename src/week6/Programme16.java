package week6;

import java.util.Scanner;

public class Programme16 {
    /* Write a Java program to add two binary numbers.
       Input Data: Input first binary number: 10
       Input second binary number: 11
       Expected Output: Sum of two binary numbers: 101 */

    public static void main(String[] args) {

        //first convert binary inputs to string
        String binary1 = "10";
        String binary2 = "11";

        //convert string to integer with method and do sum of two numbers
        int sum = (Integer.parseInt(binary1, 2) + Integer.parseInt(binary2, 2));
        System.out.println(sum);

        // convert int sum to binary format with method
        String binaryResult = Integer.toBinaryString(sum);
        System.out.println(binaryResult);

    }
}

