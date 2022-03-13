package week6;

public class Programme18 {

    /* Expected Output : 125 + 24 = 149
       125 - 24 = 101
       125 x 24 = 3000
       125 / 24 = 5
       125 mod 24 = 5
                      */

    public static void main(String[] args) {
        addition(125, 24);
        subtraction(125, 24);
        multiplication(125, 24);
        division(125, 24);
        remainder(125, 24);
    }

    public static void addition(int a, int b) {
        System.out.println("Addition:" + (a + b));
    }

    public static void subtraction(int a, int b) {
        System.out.println("Subtraction:" + (a - b));
    }

    public static void multiplication(int a, int b) {
        System.out.println("Multiplication:" + (a * b));
    }

    public static void division(int a, int b) {
        System.out.println("Division:" + (a / b));
    }

    public static void remainder(int a, int b) {
        System.out.println("Remainder:" + (a % b));
    }
}

