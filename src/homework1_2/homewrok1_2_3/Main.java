package homework1_2.homewrok1_2_3;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 6, 7);
        Triangle triangle2 = new Triangle(10, 15, 20);

        System.out.println("perimeter triangle1: " + triangle1.calculatePerimeter());
        System.out.println("perimeter triangle2: " + triangle2.calculatePerimeter());

        System.out.println("area triangle1: " + triangle1.calculateArea());
        System.out.println("area triangle2: " + triangle2.calculateArea());
    }
}
