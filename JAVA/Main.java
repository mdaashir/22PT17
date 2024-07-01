import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        Factorial();
    }

    public static void Factorial() {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        Function = n -> n == 0 ? 1 : n * Function.applyAsInt(n - 1);
        System.out.print("Factorial of " + Number + " is " + Function.applyAsInt(Number));
        System.out.println();
    }
}
