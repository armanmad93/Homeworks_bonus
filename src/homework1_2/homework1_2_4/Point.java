package homework1_2.homework1_2_4;

public class Point {
    private double coordinateX;
    private double coordinateY;

    Point(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double distance() {
        return Math.sqrt(Math.pow(coordinateX, 2) + Math.pow(coordinateY, 2));
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(coordinateX - point.coordinateX, 2) + Math.pow(coordinateY - point.coordinateY, 2));
    }
}
