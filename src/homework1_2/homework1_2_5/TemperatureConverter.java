package homework1_2.homework1_2_5;

public class TemperatureConverter {

    //convertFarenheitToCelsius
    public double convertFarenheitToCelsius(int degree) {
        return (degree - 32) / 1.8;
    }

    //convertFarenheitToKelvin
    public double convertFarenheitToKelvin(int degree) {
        return (degree - 32) * 5 / 9 + 273.15;
    }

    //convertCelsiusToFarenheit
    public double convertCelsiusToFarenheit(int degree) {
        return degree * 1.8 + 32;
    }

    //convertCelsiusToKelvin
    public double convertCelsiusToKelvin(int degree) {
        return degree + 273.15;
    }

    //convertKelvinToFarenheit
    public double convertKelvinToFarenheit(int degree) {
        return ((degree - 273.15) * 9 / 5) + 32;
    }

    //convertKelvinToCelsius
    public double convertKelvinToCelsius(int degree){
        return degree - 273.15;
    }
}
