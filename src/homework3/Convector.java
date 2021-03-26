package homework3;

public class Convector {


    public String convect(Integer number) {
        String[] strings = {"", "մեկ", "երկու", "երեք", "չորս", "հինգ", "վեց", "յոթ", "ութ", "ինը", "",
                "տասն", "քսան", "երեսուն", "քառասուն", "հիսուն", "վաթսուն", "յոթանասուն", "ութանասուն", "իննսուն",};

        String oneDigits = strings[(number % 10) % 10];
        String towDigits = ((number % 100) == 0 ? strings[0] : strings[(number % 100) / 10 + 10]);
        String treeDigits = ((number / 100) % 10 == 0 ? strings[0] : strings[(number / 100) % 10] + " հարյուր ");

        String fourOrFiveOrSixDigits = (number / 100000 == 0 ? strings[0] : strings[(number / 100000) % 10] + " հարյուր ")
                + strings[((number % 100000) / 10000) + 10] + strings[(number / 1000) % 10] + " հազար ";

        String fourMilion = (number / 100000000 == 0 ? strings[0] : strings[(number / 100000000) % 10] + " հարյուր ")
                + strings[((number % 100000000) / 10000000) + 10] + strings[(number / 1000000) % 10] + " միլիոն ";

        /*
        String fourMiliard = (number % 10 == 0 ? strings[0] : strings[(number % 10)] + " հարյուր ")
                + strings[(number % 100) / 10 + 10] + strings[number % 10] + " միլիարդ ";
        */
        if (number == 0) {
            return "Զրո";
        }
        if (number < 10) {
            return strings[number];
        }
        if (number < 100) {
            return strings[number / 10 + 10] + ((number % 10) == 0 ? strings[0] : strings[number % 10]);
        }
        if (number < 1000) {
            return treeDigits + towDigits + oneDigits;
        }

        if (number < 1000000) {
            return fourOrFiveOrSixDigits + treeDigits + towDigits + oneDigits;
        }

        if (number < 1000000000) {
            return fourMilion + fourOrFiveOrSixDigits + treeDigits + towDigits + oneDigits;
        }

        return null;
    }
}
