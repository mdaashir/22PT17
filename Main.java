import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Temperature();
        Distance();
        Interest();
        Sphere();
        Pizza();
        convert();
    }

    private static void Temperature() {
        System.out.print("Enter the Fahrenheit: ");
        float Fahrenheit = input.nextFloat();
        System.out.printf("Fahrenheit = %.2f F\n", Fahrenheit);
        float Celsius = (Fahrenheit - 32) * (5.0f / 9.0f);
        System.out.printf("Celsius = %.2f C\n", Celsius);
        System.out.println();
    }

    private static void Distance() {
        System.out.print("Enter the Kilometers: ");
        float KiloMeter = input.nextFloat();
        System.out.printf("Kilometers = %.2f KM\n", KiloMeter);
        float Mile = (0.62f * KiloMeter);
        System.out.printf("Miles = %.2f mile\n", Mile);
        System.out.println();
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
        System.out.println();
    }

    private static void Sphere() {
        System.out.print("Enter the Radius: ");
        float Radius = input.nextFloat();
        System.out.printf("Radius of Sphere = %.2f units\n", Radius);
        float Volume = (float) ((4.0f / 3.0f) * Math.PI * Math.pow(Radius, 3));
        float SurfaceArea = (float) (4 * Math.PI * Math.pow(Radius, 2));
        System.out.printf("Volume of Sphere = %.2f cubic units\n", Volume);
        System.out.printf("Surface Area of Sphere = %.2f square units\n", SurfaceArea);
        System.out.println();
    }

    public static void Pizza() {
        System.out.print("Enter the Diameter of Pizza, Price: ");
        float Diameter = input.nextFloat();
        float Price = input.nextFloat();
        System.out.printf("Diameter of Pizza = %.2f Inch(s)\n", Diameter);
        System.out.printf("Price of Pizza = Rs. %.2f\n", Price);
        float Area = (float) (Math.PI * Math.pow((Diameter / 2), 2));
        float PricePerSquareInch = Price / Area;
        System.out.printf("Price per square inch of Pizza = Rs. %.2f\n", PricePerSquareInch);
        System.out.println();
    }

    public static void convert() {
        System.out.print("Enter the Distance between two cities(in Km): ");
        float Kilometers = input.nextFloat();
        float Miles = (0.621371f * Kilometers);
        float Feet = (3280.84f * Kilometers);
        System.out.printf("Distance between two cities = %.2f Km or %.2f miles or %.2f ft\n", Kilometers, Miles, Feet);
        System.out.println();
    }
}
