import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        for (int i = 1; i <= Number; i++) {
            System.out.print((int)Math.pow(i,3)+" ");
        }
        System.out.println();
    }
}
