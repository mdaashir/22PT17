import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        Factorial();
        Solve();
    }

    public static void Factorial() {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        Function = n -> n == 0 ? 1 : n * Function.applyAsInt(n - 1);
        System.out.println("Factorial of " + Number + " is " + Function.applyAsInt(Number));
        System.out.println();
    }

    public static void Solve() {
        System.out.print("Enter coefficient of A, B, C [in A(x^2) + B(x) + C]: ");
        float[] Coefficient = { input.nextFloat(), input.nextFloat(), input.nextFloat() };
        float Discriminant = (Coefficient[1] * Coefficient[1]) - (4 * Coefficient[0] * Coefficient[2]);
        if (Discriminant > 0) {
            float Root1 = (-Coefficient[1] + (float) Math.sqrt(Discriminant)) / (2 * Coefficient[0]);
            float Root2 = (-Coefficient[1] - (float) Math.sqrt(Discriminant)) / (2 * Coefficient[0]);
            System.out.print("The equation has two real and distinct roots: " + Root1 + " and " + Root2);
        } else if (Discriminant == 0) {
            float Root = -Coefficient[1] / (2 * Coefficient[0]);
            System.out.print("The equation has one real root: " + Root);
        } else {
            float RealPart = -Coefficient[1] / (2 * Coefficient[0]);
            float ImaginaryPart = (float) (Math.sqrt(-Discriminant) / (2 * Coefficient[0]));
            System.out.print("The equation has complex roots: " + RealPart + " ± " + ImaginaryPart + "i");
        }
        System.out.println();
    }
}
