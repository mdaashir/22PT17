import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        Factorial();
        Solve();
        NumberName();
        SumAverage();
        Fibonacci();
        Palindrome();
        Cube();
        MaximumCount();
        TriPattern();
        Table();
        DataPlan();
        NetPay();
        HarmonicSum();
        Employee();
    }

    private static void Factorial() {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        Function = n -> n == 0 ? 1 : n * Function.applyAsInt(n - 1);
        System.out.println("Factorial of " + Number + " is " + Function.applyAsInt(Number));
        System.out.println();
    }

    private static void Solve() {
        System.out.print("Enter coefficient of A, B, C [in A(x^2) + B(x) + C]: ");
        float[] Coefficient = { input.nextFloat(), input.nextFloat(), input.nextFloat() };
        float Discriminant = (Coefficient[1] * Coefficient[1]) - (4 * Coefficient[0] * Coefficient[2]);
        if (Discriminant > 0) {
            float Root1 = (-Coefficient[1] + (float) Math.sqrt(Discriminant)) / (2 * Coefficient[0]);
            float Root2 = (-Coefficient[1] - (float) Math.sqrt(Discriminant)) / (2 * Coefficient[0]);
            System.out.println("The equation has two real and distinct roots: " + Root1 + " and " + Root2);
        } else if (Discriminant == 0) {
            float Root = -Coefficient[1] / (2 * Coefficient[0]);
            System.out.println("The equation has one real root: " + Root);
        } else {
            float RealPart = -Coefficient[1] / (2 * Coefficient[0]);
            float ImaginaryPart = (float) (Math.sqrt(-Discriminant) / (2 * Coefficient[0]));
            System.out.println("The equation has complex roots: " + RealPart + " ± " + ImaginaryPart + "i");
        }
        System.out.println();
    }

    private static void NumberName() {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        if (Number == 1)
            System.out.print("ONE");
        else {
            if (Number == 2)
                System.out.print("TWO");
            else {
                if (Number == 3)
                    System.out.print("THREE");
                else {
                    if (Number == 4)
                        System.out.print("FOUR");
                    else {
                        if (Number == 5)
                            System.out.print("FIVE");
                        else {
                            if (Number == 6)
                                System.out.print("SIX");
                            else {
                                if (Number == 7)
                                    System.out.print("SEVEN");
                                else {
                                    if (Number == 8)
                                        System.out.print("EIGHT");
                                    else {
                                        if (Number == 9)
                                            System.out.print("NINE");
                                        else
                                            System.out.print("NONE");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
    }

    private static void SumAverage() {
        // System.out.print("Enter a number: ");
        // int Number = input.nextInt();
        int Number = 100;
        long Sum = (Number * (Number + 1)) / 2;
        float Average = ((float) Sum / Number);
        System.out.printf("\nThe sum of the first %d natural numbers is %d and average is %.2f", Number, Sum, Average);
        System.out.println();
    }

    public static void Fibonacci() {
        // System.out.print("Enter a number: ");
        // int Number = input.nextInt();
        int Number = 20;
        int[] Fibo = new int[Number];
        Fibo[0] = 0;
        Fibo[1] = 1;
        Function = n -> (n < 2) ? Fibo[n] : (Fibo[n] = Function.applyAsInt(n - 1) + Function.applyAsInt(n - 2));
        Function.applyAsInt(Number - 1);
        int sum = 0;
        for (int i : Fibo)
            sum += i;
        System.out.printf("The average of %d Fibonacci numbers is %f", Number, (float) sum / Number);
        System.out.println();
    }

    public static void Palindrome() {
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

    public static void Cube() {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        for (int i = 1; i <= Number; i++) {
            System.out.print((int) Math.pow(i, 3) + " ");
        }
        System.out.println();
    }

    public static void MaximumCount() {
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

    public static void TriPattern() {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        String Pattern = new String();
        for (int i = 1; i <= Number; i++) {
            Pattern = Pattern + i + " ";
            System.out.println(Pattern);
        }
    }

    public static void Table() {
        System.out.print("Enter a size: ");
        int Size = input.nextInt();
        int i = 1;
        System.out.print("* | ");
        while (i <= Size) {
            System.out.print(i + " | ");
            i++;
        }
        System.out.println();
        System.out.println("--------------------------------------------");
        i = 1;
        while (i <= Size) {
            int j = 1;
            System.out.print(i + " | ");
            while (j <= Size) {
                System.out.print(i * j + "   ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void DataPlan() {
        System.out.print("Enter maximum talk minutes used per month: ");
        int talkMinutes = input.nextInt();
        System.out.print("Enter maximum text messages sent per month: ");
        int textMessages = input.nextInt();
        System.out.print("Enter maximum gigabytes of data used per month: ");
        float gigabytesData = input.nextFloat();
        if (talkMinutes < 500 && textMessages == 0 && gigabytesData == 0) {
            System.out.println("Recommendation: Plan A ($49 per month)");
        } else if (talkMinutes < 500 && textMessages > 0) {
            System.out.println("Recommendation: Plan B ($55 per month)");
        } else if (talkMinutes >= 500 && gigabytesData == 0) {
            if (textMessages < 100) {
                System.out.println("Recommendation: Plan C ($61 per month)");
            } else {
                System.out.println("Recommendation: Plan D ($70 per month)");
            }
        } else if (gigabytesData > 0 && gigabytesData <= 3) {
            System.out.println("Recommendation: Plan E ($79 per month)");
        } else if (gigabytesData > 3) {
            System.out.println("Recommendation: Plan F ($87 per month)");
        } else {
            System.out.println("No suitable plan found for the entered criteria.");
        }
    }

    public static void NetPay() {
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

    public static void HarmonicSum() {
        // System.out.print("Enter a number: ");
        // int Number = input.nextInt();
        int Number = 50000;
        BiFunction<Integer, Integer, Double> computeSum = (start, end) -> {
            double sum = 0.0;
            for (int i = start; ((start < end ? 1 : -1) > 0 ? i <= end : i >= end); i += (start < end ? 1 : -1))
                sum += 1.0 / i;
            return sum;
        };
        double sumLTR = computeSum.apply(1, Number);
        double sumRTL = computeSum.apply(Number, 1);
        System.out.println("Sum from left to right: " + sumLTR);
        System.out.println("Sum from right to left: " + sumRTL);
        System.out.println("Absolute difference: " + Math.abs(sumLTR - sumRTL));
    }

    public static void Employee() {
        System.out.print("Enter the monthly salary: $");
        float salary = input.nextFloat();
        System.out.print("Enter the age: ");
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
