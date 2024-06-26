import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Temperature();
        Distance();
        Interest();
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
    private static void Interest() {
        System.out.print("Enter the Principal, Time Period, Rate of Interest: ");
        float Principal = input.nextFloat();
        float NumberOfYear = input.nextFloat();
        float RateOfInterest = input.nextFloat();
        System.out.printf("Principal = Rs. %.2f\n", Principal);
        System.out.printf("Time Period = %.2f Year(s)\n", NumberOfYear);
        System.out.printf("Rate of Interest = %.2f %%\n", RateOfInterest);
        float SI = (Principal * NumberOfYear * RateOfInterest) / 100;
        float CI = (Principal * (float) Math.pow((1 + (RateOfInterest / 100)), NumberOfYear)) - Principal;
        System.out.printf("Simple Interest = Rs. %.2f\n", SI);
        System.out.printf("Compound Interest = Rs. %.2f\n", CI);
    }
}
