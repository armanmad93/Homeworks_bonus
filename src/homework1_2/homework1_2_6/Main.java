package homework1_2.homework1_2_6;

public class Main {
    public static void main(String[] args) {

        DistanceConverter distanceConverter = new DistanceConverter();
        double miles = distanceConverter.convertMetersToMiles(1609);
        double meter = distanceConverter.convertMilesToMeters(1);

        System.out.println("convertMetersToMiles: " + miles);
        System.out.println("convertMilesToMeters: " + meter);
    }
}
