import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Temperature temp1 = new Temperature();
        System.out.println("Temperature: " + temp1.getTempCelsius());
        Temperature temp2 = new Temperature();

        System.out.println("Temperature readings: ");
        temp1.printCelsius();
        temp2.printCelsius();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature");
        double userTemp = scanner.nextDouble();

        Temperature temp3 = new Temperature(userTemp);
        System.out.println("The temperature you inserted is: ");
        temp3.printCelsius();
        temp3.hotOrCold();
        double fahrenheit = temp3.calculateCelsiusToFahrenheit();
        System.out.printf("Wait, you're american? Ugh fine, here's the temperature in Fahrenheit you imbecile: %.2f° Fahrenheit%n", fahrenheit);
        double kelvin = temp3.calculateCelsiusToKelvin();
        System.out.printf("Kelvin? You mean the guy from PrankBros? Jk, here's your celsius in Kelvin: %.2f° Kelvin%n ", kelvin);
        
        
        
        
        

    }
}