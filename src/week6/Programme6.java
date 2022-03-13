package week6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        // Area A=PI*r*r where PI = 3.14
        int radius;
        double area;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter radius:");
        radius = obj.nextInt();
        System.out.println("Area:" + (radius * radius * 3.14));

    }
}
