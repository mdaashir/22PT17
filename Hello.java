import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Principal, Time Period, Rate of Interest: ");
        float Principal = input.nextFloat();
        float NumberOfYear = input.nextFloat();
        float RateOfInterest = input.nextFloat();
        System.out.printf("Principal = Rs. %.2f\n", Principal);
        System.out.printf("Time Period = %.2f Year(s)\n", NumberOfYear);
        System.out.printf("Rate of Interest = %.2f %%\n", RateOfInterest);
        float SI = (Principal * NumberOfYear * RateOfInterest) / 100;
        float CI = (Principal * (float)Math.pow((1 + (RateOfInterest/100)), NumberOfYear)) - Principal;
        System.out.printf("Simple Interest = Rs. %.2f\n", SI);
        System.out.printf("Compound Interest = Rs. %.2f\n", CI);
    }
}
