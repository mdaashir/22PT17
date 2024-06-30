import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the investment amount: ");
        float InvestmentAmount = input.nextFloat();
        System.out.print("Enter the annual interest rate: ");
        float MonthlyRate = (input.nextFloat() / 100) / 12;
        System.out.print("Enter the number of years: ");
        int NumberOfMonths = input.nextInt() * 12;
        double FutureValue = InvestmentAmount * Math.pow((1 + MonthlyRate), NumberOfMonths);
        System.out.printf("The future investment amount = $%.2f", FutureValue);
        System.out.println();
    }
}
