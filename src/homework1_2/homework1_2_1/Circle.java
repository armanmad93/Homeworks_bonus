package homework1_2.homework1_2_1;

public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
