import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;
    private static BiFunction<StringBuilder, Integer, Integer> Functions = null;

    public static void main(String[] args) {

        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        while (true) {
            System.out.print("Enter a number (99 to exit): ");
            int Number = input.nextInt();
            if (Number == 99)
                break;

            StringBuilder Roman = new StringBuilder();
            for (int i = 0; i < values.length && Number > 0; i++) {
                while (Number >= values[i]) {
                    Roman.append(symbols[i]);
                    Number -= values[i];
                }
            }
            System.out.println("Roman numeral: " + Roman);
        }

        // System.out.print("Enter the first 9 digits of the ISBN: ");
        // String first9String = input.nextLine();
        // StringBuilder Output = new StringBuilder(first9String);

        // Functions = (str, index) -> {
        // if (index < 0)
        // return 0;
        // int digit = str.charAt(index) - '0';
        // System.out.println(digit);
        // return (digit * (index + 1)) + Functions.apply(str, index - 1);
        // };
        // int sum = Functions.apply(Output.reverse(), Output.length() - 1);
        // System.out.println("Total sum: " + sum);
        // int check = (11 - (sum % 11)) % 11;
        // int checksum = (check == 11) ? 0 : check;
        // String isbnLastDigit = (check == 10) ? "X" : String.valueOf(check);
        // System.out.println("The ISBN-10 is " + first9String + isbnLastDigit);
        // int sum = 0;
        // for (int i = 0; i < Output.length(); i++) {
        // int digit = Output.charAt(i) - '0';
        // sum += digit * (i + 1);
        // System.out.println(sum);
        // }
        // System.out.println("Enter the number: ");
        // int Number = input.nextInt();
        // System.out.println("Enter number per line: ");
        // int Line = input.nextInt();
    }
}
