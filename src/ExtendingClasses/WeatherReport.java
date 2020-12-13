package ExtendingClasses;

public class WeatherReport {

    private WeatherCalculator calculator;

    public void show(WeatherCalculator calculator) {
        String weather = calculator.report();
        System.out.println(weather);
    }

}
