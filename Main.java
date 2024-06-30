import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Temperature();
        Distance();
        Interest();
        Sphere();
        Pizza();
        Lightning();
        Convert();
        Slope();
        Weight();
        Euclidean();
        Gregorian();
        Racer();
        Egg();
        Population();
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

    public static void Lightning() {
        System.out.print("Enter the time elapsed(in sec): ");
        float TimeElapsed = input.nextFloat();
        float SpeedOfLight = 1100; // ft per sec
        float Feet = (TimeElapsed * SpeedOfLight); // ft
        float Miles = (Feet / 5280f); // ft to mile
        System.out.printf("The lightning strike is approximately %.2f miles away.\n", Miles);
        System.out.println();
    }

    public static void Convert() {
        System.out.print("Enter the Distance between two cities(in Km): ");
        float Kilometers = input.nextFloat();
        float Miles = (0.621371f * Kilometers);
        float Feet = (3280.84f * Kilometers);
        System.out.printf("Distance between two cities = %.2f Km or %.2f miles or %.2f ft\n", Kilometers, Miles, Feet);
        System.out.println();
    }

    public static void Slope() {
        System.out.print("Enter the coordinates of the point (x1, y1): ");
        float[] Point1 = { input.nextFloat(), input.nextFloat() };
        System.out.print("Enter the coordinates of the point (x2, y2): ");
        float[] Point2 = { input.nextFloat(), input.nextFloat() };
        if (Point1[0] == Point2[0])
            System.out.println("The points are on the same vertical line.");
        else {
            float Slope = (Point2[1] - Point1[1]) / (Point2[0] - Point1[0]);
            System.out.printf("The slope of the line = %.2f\n", Slope);
        }
        System.out.println();
    }

    public static void Weight() {
        System.out.print("Enter the number of Hydrogen(H), Carbon(C), Oxygen(O) atoms: ");
        int hydrogenAtoms = input.nextInt();
        int carbonAtoms = input.nextInt();
        int oxygenAtoms = input.nextInt();
        float molecularWeight = (1.0079f * hydrogenAtoms) + (12.011f * carbonAtoms) + (15.9994f * oxygenAtoms);
        System.out.printf("The molecular weight of %dH %dC %dO = %.2f grams/mole\n", hydrogenAtoms, carbonAtoms,
                oxygenAtoms, molecularWeight);
        System.out.println();
    }

    public static void Euclidean() {
        System.out.print("Enter the coordinates of the point (x1, y1): ");
        float[] Point1 = { input.nextFloat(), input.nextFloat() };
        System.out.print("Enter the coordinates of the point (x2, y2): ");
        float[] Point2 = { input.nextFloat(), input.nextFloat() };
        float Distance = (float) Math.sqrt(Math.pow((Point2[0] - Point1[0]), 2) + Math.pow((Point2[1] - Point1[1]), 2));
        System.out.printf("The Distance between 2 points = %.2f units\n", Distance);
        System.out.println();
    }

    public static void Gregorian() {
        System.out.print("Enter a 4-digit year: ");
        int Year = input.nextInt();
        if (Year < 1000 || Year > 9999) {
            System.out.print("Please enter a valid 4-digit year.");
            return;
        }
        int Century = Year / 100;
        int Epact = (8 + (Century / 4) - Century + ((8 * Century + 13) / 25) + 11 * (Year % 19)) % 30;
        System.out.println("The Gregorian epact for the year " + Year + " is: " + Epact);
        System.out.println();
    }

    public static void Racer() {
        // System.out.print("Enter number of racers: ");
        // int NumberOfRacers = input.nextInt();
        int NumberOfRacers = 5;
        int[] SpeedOfRacers = new int[NumberOfRacers];
        int Average = 0;
        System.out.print("Enter the speed of " + NumberOfRacers + " racer: ");
        for (int i = 0; i < NumberOfRacers; i++) {
            SpeedOfRacers[i] = input.nextInt();
            Average += SpeedOfRacers[i];
        }
        Average /= NumberOfRacers;
        // System.out.println("Average speed: " + Average + " kmph");
        System.out.println("Speed of qualifying racers: ");
        for (int i = 0; i < NumberOfRacers; i++) {
            if (SpeedOfRacers[i] >= Average)
                System.out.println("Racer " + (i + 1) + " = " + SpeedOfRacers[i] + " kmph");
        }
        System.out.println();
    }

    public static void Egg() {
        System.out.print("Enter number of eggs: ");
        int NumberOfEggs = input.nextInt();
        int NumberofDozens = NumberOfEggs / 12;
        int NumberofLeftOver = NumberOfEggs % 12;
        float Price = (3.25f * NumberofDozens) + (0.45f * NumberofLeftOver);
        System.out.printf("Total price of eggs = $%.2f ", Price);
        System.out.println();
    }

    public static void Population() {
        System.out.print("Enter the current world population: ");
        long CurrentPopulation = input.nextLong();
        System.out.print("Enter the annual world population growth rate (as a percentage): ");
        float GrowthRate = input.nextFloat();
        GrowthRate /= 100;
        System.out.println("Estimated World Population: ");
        for (int year = 1; year <= 5; year++) {
            double EstimatedPopulation = CurrentPopulation * Math.pow(1 + GrowthRate, year);
            System.out.printf("Year %d: %.0f\n", year, EstimatedPopulation);
        }
        System.out.println();
    }
}
