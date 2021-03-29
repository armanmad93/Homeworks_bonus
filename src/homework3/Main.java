package homework3;

public class Main {
    public static void main(String[] args) {

        Convector convector = new Convector();

        String word = convector.convect((long) 9);
        System.out.println(word);
        word = convector.convect((long) 12);
        System.out.println(word);
        word = convector.convect((long) 159);
        System.out.println(word);
        word = convector.convect((long) 2768);
        System.out.println(word);
        word = convector.convect((long) 13496);
        System.out.println(word);
        word = convector.convect((long) 115915);
        System.out.println(word);
        word = convector.convect((long) 1369875);
        System.out.println(word);
        word = convector.convect((long) 12486502);
        System.out.println(word);
        word = convector.convect((long) 159357155);
        System.out.println(word);
        word = convector.convect((long) 17000);
        System.out.println(word);

    }
}
