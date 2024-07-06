import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        int Count = 0, Max = Integer.MIN_VALUE;
        System.out.print("Enter a numbers(0 to stop): ");
        while (true) {
            int Number = input.nextInt();
            if (Number == 0)
                break;
            if (Number > Max) {
                Max = Number;
                Count = 1;
            } else if (Max == Number) {
                Count++;
            }
        }
        System.out.printf("The largest is %d and the occurrence count for %d is %d.\n", Max, Max, Count);
    }
}
