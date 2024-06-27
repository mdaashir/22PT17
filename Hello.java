import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the time elapsed(in sec): ");
        float TimeElapsed = input.nextFloat();
        float SpeedOfLight = 1100; // ft per sec
        float Feet = (TimeElapsed * SpeedOfLight); // ft
        float Miles = (Feet / 5280f); // ft to mile
        System.out.printf("The lightning strike is approximately %.2f miles away.\n", Miles);
        System.out.println();
    }
}
