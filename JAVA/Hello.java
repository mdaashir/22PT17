import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;
    private static BiFunction<StringBuilder, Integer, Integer> Functions = null;

    public static void main(String[] args) {
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
        int Number = 110, Line = 11;
        for (int i = 1; i <= Number; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                if (i % 3 == 0)
                    System.out.print("Coza");
                if (i % 5 == 0)
                    System.out.print("Loza");
                if (i % 7 == 0)
                    System.out.print("Woza");
                System.out.printf("%-6s", "");
            } else {
                System.out.printf("%-6d", i);
            }

            if (i % Line == 0) {
                System.out.println();
            }
        }
    }
}
