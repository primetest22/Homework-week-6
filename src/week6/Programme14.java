package week6;

public class Programme14 {
    public static void main(String[] args) {

        /* a Java program to print the area and perimeter of a rectangle.
           Expected Output: Area is 5.6 * 8.5 = 47.60
           Perimeter is 2 * (5.6 + 8.5) = 28.20  */

        double width = 5.6;
        double height = 8.5;
        double area;
        double perimeter;

        System.out.println("Rectangle Area:" + (area = (width * height)));
        System.out.println("Rectangle Perimeter:" + (2 * (width + height)));
    }
}
