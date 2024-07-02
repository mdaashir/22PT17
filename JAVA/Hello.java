import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        long Sum = (Number * (Number + 1)) / 2;
        float Average = ((float) Sum / Number);
        System.out.printf("The sum of the first %d natural numbers is %d and average is %.2f", Number, Sum, Average);
        System.out.println();
    }
}
