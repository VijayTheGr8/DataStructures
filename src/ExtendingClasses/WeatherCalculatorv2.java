package ExtendingClasses;

public class WeatherCalculatorv2 implements WeatherCalculator {

    private float temp;
    private boolean windy;

    public WeatherCalculatorv2() {
        this.temp = 0;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getTemp() {
        return this.temp;
    }

    public boolean isWindy() {
        return windy;
    }

    public void setWindy(boolean windy) {
        this.windy = windy;
    }

    public String report() {
        return "The weather for today" +
                "\n---------------------" +
                "\nTemp: " + this.temp  +
                "\nWindy: " + this.windy;
    }
}
