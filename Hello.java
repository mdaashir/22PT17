import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit: ");
        float Fahrenheit = input.nextFloat();
        System.out.printf("Fahrenheit = %.2f F\n", Fahrenheit);
        float Celsius = (Fahrenheit - 32) * (5.0f / 9.0f);
        System.out.printf("Celsius = %.2f C\n", Celsius);
        input.close();
    }
}
