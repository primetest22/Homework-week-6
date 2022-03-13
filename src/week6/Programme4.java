package week6;

public class Programme4 {

    //instance variable
    int a = 10;
    int z = 20;
    //static variable
    static int b = 100;
    static int y = 200;

    public static void main(String[] args) {
        method1();

        //created object(obj2) to call instance method(method2)
        Programme4 obj2 = new Programme4();
        obj2.method2();

    }

    //static method
    public static void method1() {
        //created object(obj1) to use instance variable (a and z)
        Programme4 obj1 = new Programme4();
        System.out.println("static method result:\n" + obj1.a);
        System.out.println(obj1.z);

        System.out.println(b);
        System.out.println(y);
    }

    //instance method
    public void method2() {
        System.out.println("instance method result:\n" + a);
        System.out.println(z);
        System.out.println(b);
        System.out.println(y);
    }
}
