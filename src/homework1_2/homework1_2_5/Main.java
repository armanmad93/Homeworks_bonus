package homework1_2.homework1_2_5;

public class Main {
    public static void main(String[] args) {

        TemperatureConverter temperatureConverter = new TemperatureConverter();

        //convertFarenheitToCelsius
        Celsius celsius = new Celsius();
        celsius.setDegree(temperatureConverter.convertFarenheitToCelsius(32));
        System.out.println("convertFarenheitToCelsius: " + celsius.getDegree());

        //convertFarenheitToKelvin
        Kelvin kelvin = new Kelvin();
        kelvin.setDegree(temperatureConverter.convertFarenheitToKelvin(0));
        System.out.println("convertFarenheitToKelvin: " + kelvin.getDegree());

        //convertCelsiusToFarenheit
        Farenheit farenheit = new Farenheit();
        farenheit.setDegree(temperatureConverter.convertCelsiusToFarenheit(0));
        System.out.println("convertCelsiusToFarenheit: " + farenheit.getDegree());

        //convertCelsiusToKelvin
        Kelvin celsiusToKelvin = new Kelvin();
        celsiusToKelvin.setDegree(temperatureConverter.convertCelsiusToKelvin(0));
        System.out.println("convertCelsiusToKelvin: " + celsiusToKelvin.getDegree());

        //convertKelvinToFarenheit
        Farenheit kelvinToFarenheit = new Farenheit();
        kelvinToFarenheit.setDegree(temperatureConverter.convertKelvinToFarenheit(0));
        System.out.println("convertKelvinToFarenheit: " + kelvinToFarenheit.getDegree());

        //convertKelvinToCelsius
        Celsius kelvinToCelsiu = new Celsius();
        kelvinToCelsiu.setDegree(temperatureConverter.convertKelvinToCelsius(0));
        System.out.println("convertKelvinToCelsius: " + kelvinToCelsiu.getDegree());
    }
}
