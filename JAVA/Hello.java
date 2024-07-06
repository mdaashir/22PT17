import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        System.out.print("Enter hours worked per week: ");
        float hoursWorked = input.nextFloat();
        System.out.print("Enter shift (1 for first, 2 for second, 3 for third): ");
        int shift = input.nextInt();
        boolean participateRetirement = false;
        if (shift == 2 || shift == 3) {
            System.out.print("Do you want to participate in the retirement plan? (yes/no): ");
            String response = input.next();
            if (response.equalsIgnoreCase("yes")) {
                participateRetirement = true;
            }
        }
        float hourlyRate = 0;
        if (shift == 1) {
            hourlyRate = 17.0f;
        } else if (shift == 2) {
            hourlyRate = 18.50f;
        } else if (shift == 3) {
            hourlyRate = 22.0f;
        } else {
            System.out.println("Invalid shift entered.");
            return;
        }
        float regularPay = 0;
        float overtimePay = 0;
        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyRate;
        } else {
            regularPay = 40 * hourlyRate;
            overtimePay = ((hoursWorked - 40f) * hourlyRate * 1.5f);
        }
        float totalPay = regularPay + overtimePay;
        float retirementDeduction = 0;
        if (participateRetirement) {
            retirementDeduction = 0.03f * totalPay;
        }
        double netPay = totalPay - retirementDeduction;
        System.out.println("\nPay Details:");
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Shift: " + shift);
        System.out.println("Hourly pay rate: $" + hourlyRate);
        System.out.println("Regular pay: $" + regularPay);
        System.out.println("Overtime pay: $" + overtimePay);
        System.out.println("Total pay (regular + overtime): $" + totalPay);
        if (participateRetirement) {
            System.out.println("Retirement deduction: $" + retirementDeduction);
        } else {
            System.out.println("Retirement deduction: $0.00 (not participating)");
        }
        System.out.println("Net pay: $" + netPay);
    }
}
