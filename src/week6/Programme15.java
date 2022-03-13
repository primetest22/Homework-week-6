package week6;

public class Programme15 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
