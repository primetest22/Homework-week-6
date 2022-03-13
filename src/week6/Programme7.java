package week6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        //Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
        int fahrenheit;
        int celsius;

        Scanner convert = new Scanner(System.in);
        System.out.println("Enter fahrenheit:");
        fahrenheit = convert.nextInt();
        System.out.println("Celsius:" + ((fahrenheit - 32) * 5 / 9));
    }
}
