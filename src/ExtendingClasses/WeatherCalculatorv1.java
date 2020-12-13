package ExtendingClasses;

public class WeatherCalculatorv1 implements WeatherCalculator {

    private float temp;

    public WeatherCalculatorv1() {
        this.temp = 0;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getTemp() {
        return this.temp;
    }

    @Override
    public String report() {
        return "The weather for today" +
                "\n---------------------" +
                "\nTemp: " + this.temp;
    }
}
