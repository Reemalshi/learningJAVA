import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape triangle = new Triangle(5, 8, 12, 13, 10);

        display(rectangle);
        display(circle);
        display(triangle);
    }

    public static void display(Shape shape) {
        System.out.println("Shape Type: " + shape.getClass().getSimpleName());
        System.out.println("Area: " + shape.area());
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println();
    }
}
