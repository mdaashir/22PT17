import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        String Pattern = new String();
        for (int i = 1; i <= Number; i++) {
            Pattern = Pattern + i + " ";
            System.out.println(Pattern);
        }
    }
}
