import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        // System.out.print("Enter a number: ");
        // int Number = input.nextInt();
        int Number = 50000;
        BiFunction<Integer, Integer, Double> computeSum = (start, end) -> {
            double sum = 0.0;
            for (int i = start; ((start < end ? 1 : -1) > 0 ? i <= end : i >= end); i += (start < end ? 1 : -1))
                sum += 1.0 / i;
            return sum;
        };
        double sumLTR = computeSum.apply(1, Number);
        double sumRTL = computeSum.apply(Number, 1);
        System.out.println("Sum from left to right: " + sumLTR);
        System.out.println("Sum from right to left: " + sumRTL);
        System.out.println("Absolute difference: " + Math.abs(sumLTR - sumRTL));
    }
}
