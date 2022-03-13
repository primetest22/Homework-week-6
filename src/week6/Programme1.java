package week6;

public class Programme1 {
    //instance variables
    int a = 10;
    int b = 10;

    public static void main(String[] args) {
        //object created(obj) to call instance method (firstMethod)
        Programme1 obj = new Programme1();
        obj.firstMethod();
    }

    //instance method
    public void firstMethod() {
        System.out.println(a);//10
        System.out.println(b);//10
    }
}
