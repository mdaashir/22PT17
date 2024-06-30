import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the total miles driven per day: ");
        float TotalMilesPerDay = input.nextFloat();
        System.out.print("Enter the average miles per gallon: ");
        float MilesPerGallon = input.nextFloat();
        System.out.print("Enter the cost per gallon of gasoline: ");
        float CostPerGallon = input.nextFloat();
        float DailyGasolineCost = (TotalMilesPerDay / MilesPerGallon) * CostPerGallon;
        System.out.print("Enter the parking fees per day: ");
        float ParkingFees = input.nextFloat();
        System.out.print("Enter the tolls per day: ");
        float TollsPerDay = input.nextFloat();
        float DailyDrivingCost = DailyGasolineCost + ParkingFees + TollsPerDay;
        System.out.printf("Your daily driving cost is: $%.2f%n", DailyDrivingCost);
        System.out.println();
    }
}
