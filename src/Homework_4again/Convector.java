package Homework_4again;

public class Convector {
    public String convert(long number) {
        String[] numbers = {"", "մեկ", "երկու", "երեք", "չորս", "հինգ", "վեց", "յոթ", "ութ", "ինը",
                "", "տասն", "քսան", "երեսուն", "քառասուն", "հիսուն", "վաթսուն", "յոթանասուն", "ութանասուն", "իննսուն"};

        String oneDigit = numbers[(int) (number % 10)];

        String twoDigit = numbers[(int) (number % 100) / 10 + 10] + oneDigit;

        String treeDigit = (number % 1000 / 100 == 0) ?
                numbers[(int) (number % 1000 / 100)] : numbers[(int) (number % 1000 / 100)] + " հարյուր " + twoDigit;

        String fourOrFiveDigit = (number % 1000000 / 10000 == 0 ? (
                numbers[(int) (number % 100000 / 10000) + 10] + numbers[(int) (number % 10000 / 1000)]) :
                (numbers[(int) (number % 100000 / 10000) + 10] + numbers[(int) (number % 10000 / 1000)] + " հազար ")) + treeDigit;

        String sixDigit = ((number % 1000000 / 100000 == 0) ? (
                numbers[(int) (number % 1000000 / 100000)]) : (numbers[(int) (number % 1000000 / 100000)] + " հարյուր ")) + fourOrFiveDigit;

        String forMillion = (number % 1000000000 == 0 ?
                numbers[(int) (number % 100000000 / 10000000) + 10] + numbers[(int) (number % 10000000 / 1000000)] :
                numbers[(int) (number % 100000000 / 10000000) + 10] + numbers[(int) (number % 10000000 / 1000000)] + " միլիոն ") + sixDigit;

        String forHundredMillion = ((number % 1000000000 / 100000000 == 0) ? (
                numbers[(int) (number % 1000000000 / 100000000)]) : (numbers[(int) (number % 1000000000 / 100000000)] + " հարյուր ")) + forMillion;

        String forMiliard = numbers[(int) ((number / 10000000000L) + 10)] + numbers[(int) (number % 10000000000L / 1000000000)] + " միլիարդ " + forHundredMillion;


        if (number < 10) {
            return oneDigit;
        }
        if (number < 100) {
            return twoDigit;
        }
        if (number < 1000) {
            return treeDigit;
        }
        if (number < 100000) {
            return fourOrFiveDigit;
        }
        if (number < 1000000) {
            return sixDigit;
        }
        if (number < 100000000) {
            return forMillion;
        }
        if (number < 1000000000) {
            return forHundredMillion;
        }
        if(number < 100000000000L){
            return forMiliard;
        }
        return null;
    }

}
