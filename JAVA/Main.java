import java.util.Scanner;
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
}
