import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a five-digit number: ");
        int Number = input.nextInt();
        while (Number < 10000 || Number > 99999) {
            System.out.print("Invalid input. Please enter a five-digit number: ");
            Number = input.nextInt();
        }
        int[] Digits = new int[5];
        for (int i = 0; i < 5; i++) {
            Digits[i] = Number % 10;
            Number /= 10;
        }
        for (int i : Digits) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
