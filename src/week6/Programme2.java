package week6;

public class Programme2 {
    //static variables
    static int a = 10;
    static String name = "chetan";

    public static void main(String[] args) {
        //calling static method
        method();
    }

    //static method
    public static void method() {
        System.out.println(a);
        System.out.println(name);
    }
}
