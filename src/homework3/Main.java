package homework3;

public class Main {
    public static void main(String[] args) {

        Convector convector = new Convector();

        String word = convector.convect(9);
        System.out.println(word);
        word = convector.convect(12);
        System.out.println(word);
        word = convector.convect(159);
        System.out.println(word);
        word = convector.convect(2768);
        System.out.println(word);
        word = convector.convect(13496);
        System.out.println(word);
        word = convector.convect(115915);
        System.out.println(word);
        word = convector.convect(1369875);
        System.out.println(word);
        word = convector.convect(12486502);
        System.out.println(word);
        word = convector.convect(159357155);
        System.out.println(word);

    }
}
