package homework1_2.homework1_2_2;

public class Rectangle {
    private double height;
    private double width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    public double calculateArea() {
        return height * width;
    }
}
