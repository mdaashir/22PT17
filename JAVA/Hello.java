import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;
    private static BiFunction<StringBuilder, Integer, Integer> Functions = null;

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter patient ID (-1 to stop): ");
            int patientID = input.nextInt();
            if (patientID == -1)
                break;
            System.out.print("Enter the number of readings for patient ID " + patientID + ": ");
            int numReadings = input.nextInt();
            float sum = 0;
            for (int i = 0; i < numReadings; i++) {
                System.out.print("Enter reading " + (i + 1) + ": ");
                float reading = input.nextFloat();
                sum += reading;
            }
            System.out.printf("For patient ID#: %d average BP = %.2f%n", patientID, sum / numReadings);
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
