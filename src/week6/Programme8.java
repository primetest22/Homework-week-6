package week6;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {

        //Triangle area = (height * base)/2
        double area, height, base;

        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter Height:");
        height = triangle.nextInt();
        System.out.println("Enter Base:");
        base = triangle.nextInt();

        System.out.println("Triangle Area:" + (area = (height * base) / 2));


    }
}
