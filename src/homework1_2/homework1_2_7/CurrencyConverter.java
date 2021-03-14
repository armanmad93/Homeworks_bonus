package homework1_2.homework1_2_7;

public class CurrencyConverter {

    public double convert(Dram dram, Ruble ruble) {
        return 1 / 6.17;
    }

    public double convert(Dram dram, Dollar dollar) {
        return 1 / 498.8;
    }

    public double convert(Dollar dollar, Ruble ruble) {
        return 75.86;
    }

    public double convert(Dollar dollar, Dram dram) {
        return 498.8;
    }

    public double convert(Ruble ruble, Dram dram) {
        return 6.17;
    }

    public double convert(Ruble ruble, Dollar dollar) {
        return 1 / 75.86;
    }
}
