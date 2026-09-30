
abstract class Shape {
    abstract double calculateArea();
    public void displayInfo() {
        System.out.println("This is a geometric shape.");
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    double calculateArea() {
        return 0.5 * base * height;
    }
}
public class ShapeAreaCalculator {
    public static void main(String[]args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(3.0, 8.0);
        System.out.println("--- Area Calculations ---");
        System.out.printf("Area of Circle (Radius 5): %.2f\n", circle.calculateArea());
        System.out.printf("Area of Rectangle (4x6): %.2f\n", rectangle.calculateArea());
        System.out.printf("Area of Triangle (Base 3, Height 8): %.2f\n", triangle.calculateArea());
    }
}