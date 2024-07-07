import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        System.out.print("Enter the monthly salary and age: $");
        float salary = input.nextFloat();
        int age = input.nextInt();
        float employeeRate = 0;
        float employerRate = 0;
        if (age <= 55) {
            employeeRate = 20.0f;
            employerRate = 17.0f;
        } else if (age > 55 && age <= 60) {
            employeeRate = 13.0f;
            employerRate = 13.0f;
        } else if (age > 60 && age <= 65) {
            employeeRate = 7.5f;
            employerRate = 9.0f;
        } else if (age > 65) {
            employeeRate = 5.0f;
            employerRate = 7.5f;
        } else {
            System.out.println("Invalid age entered.");
            return;
        }
        float cappedSalary = Math.min(salary, 6000.0f);
        float employeeContribution = (employeeRate / 100f) * cappedSalary;
        float employerContribution = (employerRate / 100f) * cappedSalary;
        System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
        System.out.printf("The total contribution is: $%.2f\n", employeeContribution + employerContribution);
    }
}
