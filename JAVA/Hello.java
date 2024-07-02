import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int Number = input.nextInt();
        if (Number == 1)
            System.out.print("ONE");
        else if (Number == 2)
            System.out.print("TWO");
        else if (Number == 3)
            System.out.print("THREE");
        else if (Number == 4)
            System.out.print("FOUR");
        else if (Number == 5)
            System.out.print("FIVE");
        else if (Number == 6)
            System.out.print("SIX");
        else if (Number == 7)
            System.out.print("SEVEN");
        else if (Number == 8)
            System.out.print("EIGHT");
        else if (Number == 9)
            System.out.print("NINE");
        else
            System.out.print("NONE");
        System.out.println();
    }
}
