import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of eggs: ");
        int NumberOfEggs = input.nextInt();
        int NumberofDozens = NumberOfEggs / 12;
        int NumberofLeftOver = NumberOfEggs % 12;
        float Price = (3.25f * NumberofDozens) + (0.45f * NumberofLeftOver);
        System.out.printf("Total price of eggs = $%.2f ",Price);
        System.out.println();
    }
}
