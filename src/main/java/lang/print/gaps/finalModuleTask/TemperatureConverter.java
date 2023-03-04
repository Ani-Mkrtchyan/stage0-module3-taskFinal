package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius) {
        double fahrenheit = temperatureCelsius * 1.8 + 32;
        System.out.println(fahrenheit);
    }

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        temperatureConverter.toFahrenheit(22);
    }
}
