import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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
