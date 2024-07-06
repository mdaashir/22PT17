import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        int Org = Number;
        int Rev = 0;
        while (Number > 0) {
            Rev = (Rev * 10 + Number % 10);
            Number /= 10;
        }
        if (Rev == Org) {
            System.out.print("The number is a palindrome");
        } else {
            System.out.print("The number is not a palindrome");
        }
        System.out.println();
    }
}
