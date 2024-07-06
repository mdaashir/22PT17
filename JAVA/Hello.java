import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        // System.out.print("Enter a number: ");
        // int Number = input.nextInt();
        int Number = 20;
        int[] Fibo = new int[Number];
        Fibo[0] = 0;
        Fibo[1] = 1;
        Function = n -> (n < 2) ? Fibo[n] : (Fibo[n] = Function.applyAsInt(n - 1) + Function.applyAsInt(n - 2));
        Function.applyAsInt(Number - 1);
        int sum = 0;
        for (int i : Fibo)
            sum += i;
        System.out.printf("The average of %d Fibonacci numbers is %f", Number, (float) sum / Number);
        System.out.println();
    }
}
