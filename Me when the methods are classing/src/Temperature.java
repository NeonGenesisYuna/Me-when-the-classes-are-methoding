public class Temperature {

    public double celsius = 16;

    public Temperature() {
        celsius = 18.32;
    }

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public double getTempCelsius() {
        return celsius;
    }

    public void setTempCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void printCelsius() {
        System.out.printf("%.2f° Celsius%n", celsius);
    }

    public void hotOrCold() {
        if (celsius > 24) {
            System.out.println("Holy ape shit, it's so hot we're all burning outside!");
        } else {
            System.out.println("Holy Guacamole, we're basically having a nuclear winter rn!");
        }
    }

    public double calculateCelsiusToFahrenheit() {
         return (celsius * 9/5) + 32;
    }
    public double calculateCelsiusToKelvin() {
        return (celsius + 273.15);
    }
}
