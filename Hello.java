import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the monthly savings amount: ");
        float SavingsAmount = input.nextFloat();
        // System.out.print("Enter the annual interest rate: ");
        // float AnnualRate = input.nextFloat() / 100f;
        float AnnualRate = 5 / 100f;
        float MonthlyRate = AnnualRate / 12f;
        Double AmountValue = 0.0;
        // System.out.print("Enter the number of months: ");
        // int Months = input.nextInt();
        int Months = 6;
        for (int i = 0; i < Months; i++) {
            AmountValue = (SavingsAmount + AmountValue) * (1 + MonthlyRate);
        }
        System.out.printf("Your savings amount after %d months = $%.3f",Months, AmountValue);
        System.out.println();
    }
}
