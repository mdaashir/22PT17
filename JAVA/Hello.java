import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
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
}
