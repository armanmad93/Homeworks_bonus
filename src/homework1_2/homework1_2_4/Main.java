package homework1_2.homework1_2_4;

public class Main {
    public static void main(String[] args) {

        Point point = new Point(4, 3);

        System.out.println("distance (from 0:0 coordinate): " + point.distance());
        System.out.println("distance (from 2:3 coordinate): " + point.distance(new Point(2, 3)));
    }
}
