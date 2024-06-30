import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the temperature in Fahrenheit (between -58°F and 41°F): ");
        float Temperature = input.nextFloat();
        while (Temperature < -58 || Temperature > 41) {
            System.out.print("Invalid input. Please enter a temperature between -58°F and 41°F: ");
            Temperature = input.nextFloat();
        }
        System.out.print("Enter the wind speed in miles per hour (>= 2 mph): ");
        float WindSpeed = input.nextFloat();
        while (WindSpeed < 2) {
            System.out.print("Invalid input. Please enter a wind speed of at least 2 mph: ");
            WindSpeed = input.nextFloat();
        }
        double WindChill = 35.74f + 0.6215f * Temperature - 35.75f * Math.pow(WindSpeed, 0.16f)
                + 0.4275f * Temperature * Math.pow(WindSpeed, 0.16f);
        System.out.printf("The wind-chill temperature is: %.2f°F", WindChill);
        System.out.println();
    }
}
