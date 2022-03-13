package week6;

public class Programme13 {
    //Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    public static void main(String[] args) {
        Programme13 obj = new Programme13();
        obj.average(2, 2, 2);
    }

    public void average(int a, int b, int c) {

        System.out.println("Average:" + (a + b + c) / 3);
    }
}
