package week6;

public class Programme3 {
    //instance variable
    int a = 10;
    //static variable
    static int b = 20;

    public static void main(String[] args) {
        method1();
        //created object(obj2) to call instance method(method2)
        Programme3 obj2 = new Programme3();
        obj2.method2();

    }

    //static method
    public static void method1() {
        //created object(obj1) to use instance variable (a)
        Programme3 obj1 = new Programme3();
        System.out.println("static method result:\n" + obj1.a);
        System.out.println(b);
    }

    //instance method
    public void method2() {
        System.out.println("instance method result:\n" + a);
        System.out.println(b);
    }
}
