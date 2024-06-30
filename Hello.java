import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the weight(in pounds): ");
        float Pounds = input.nextFloat();
        System.out.print("Enter the Height(in inches): ");
        float Inches = input.nextFloat();
        float Weight = 0.45359237f * Pounds; // kilograms
        float Height = 0.0254f * Inches; // meters
        float BMI = Weight / (Height * Height);
        System.out.printf("BMI: %.2f", BMI);
        System.out.println();
    }
}
