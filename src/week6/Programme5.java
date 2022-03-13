package week6;

public class Programme5 {

    public static void main(String[] args) {
        addition("10", "10");
        subtraction(40, 20);
        Programme5 obj = new Programme5();
        obj.multiplication(2, 2);
        obj.division(10, 2);
    }

    public static void addition(String a, String b) {
        System.out.println(a.concat(b));
    }

    public static void subtraction(int c, int d) {
        System.out.println("subtraction\n:" + c / d);//2
    }

    public void multiplication(int w, int x) {
        System.out.println("Multiplication\n" + w * x);//4
    }

    public void division(int y, int z) {
        System.out.println("Division\n:" + y / z);//5
    }
}
