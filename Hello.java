import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Distance between two cities(in Km): ");
        float Kilometers = input.nextFloat();
        float Miles = (0.621371f * Kilometers);
        float Feet = (3280.84f * Kilometers);
        System.out.printf("Distance between two cities = %.2f Km or %.2f miles or %.2f ft\n", Kilometers, Miles, Feet);
        System.out.println();
    }
}
