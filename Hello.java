import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a 4-digit year: ");
        int Year = input.nextInt();
        if (Year < 1000 || Year > 9999) {
            System.out.print("Please enter a valid 4-digit year.");
            return;
        }
        int Century = Year / 100;
        int Epact = (8 + (Century / 4) - Century + ((8 * Century + 13) / 25) + 11 * (Year % 19)) % 30;
        System.out.println("The Gregorian epact for the year " + Year + " is: " + Epact);
        System.out.println();
    }
}
