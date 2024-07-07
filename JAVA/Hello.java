import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;
    private static BiFunction<StringBuilder, Integer, Integer> Functions = null;

    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of the ISBN: ");
        String first9String = input.nextLine();
        StringBuilder Output = new StringBuilder(first9String);

        Functions = (str, index) -> {
            if (index < 0)
                return 0;
            int digit = str.charAt(index) - '0';
            return (digit * (index + 2)) + Functions.apply(str, index - 1);
        };
        int sum = Functions.apply(Output.reverse(), Output.length() - 1);
        String LastDigit = (((11 - (sum % 11)) == 10) ? "X" : String.valueOf(11 - (sum % 11)));
        System.out.printf("The ISBN-10 is %09d%s", Integer.valueOf(first9String), LastDigit);
        System.out.println();
    }
}
