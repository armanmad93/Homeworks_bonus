package homework1_2.homework1_2_7;

public class Main {
    public static void main(String[] args) {

        CurrencyConverter currencyConverter = new CurrencyConverter();

        Dram dram = new Dram();
        Ruble ruble = new Ruble();
        Dollar dollar = new Dollar();

        System.out.println("1 dram is: " + currencyConverter.convert(dram, ruble) + " ruble");
        System.out.println("1 dram is: " + currencyConverter.convert(dram, dollar) + " dollar");
        System.out.println("1 dollar is: " + currencyConverter.convert(dollar, dram) + " dram");
        System.out.println("1 dollar is: " + currencyConverter.convert(dollar, ruble) + " ruble");
        System.out.println("1 ruble is: " + currencyConverter.convert(ruble, dram) + " dram");
        System.out.println("1 ruble is: " + currencyConverter.convert(ruble, dollar) + " dollar");
    }
}
