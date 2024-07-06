import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class Hello {
    private static Scanner input = new Scanner(System.in);
    private static IntUnaryOperator Function = null;

    public static void main(String[] args) {
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
}
