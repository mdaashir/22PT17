import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Kilometers: ");
        float KiloMeter = input.nextFloat();
        System.out.printf("Kilometers = %.2f KM\n", KiloMeter);
        float Mile = (0.62f * KiloMeter);
        System.out.printf("Miles = %.2f mile\n", Mile);
        input.close();
    }
}
