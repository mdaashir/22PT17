import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Temperature();
        Distance();
    }

    private static void Temperature() {
        System.out.print("Enter the Fahrenheit: ");
        float Fahrenheit = input.nextFloat();
        System.out.printf("Fahrenheit = %.2f F\n", Fahrenheit);
        float Celsius = (Fahrenheit - 32) * (5.0f / 9.0f);
        System.out.printf("Celsius = %.2f C\n", Celsius);
    }

    private static void Distance() {
        System.out.print("Enter the Kilometers: ");
        float KiloMeter = input.nextFloat();
        System.out.printf("Kilometers = %.2f KM\n", KiloMeter);
        float Mile = (0.62f * KiloMeter);
        System.out.printf("Miles = %.2f mile\n", Mile);
    }
}
