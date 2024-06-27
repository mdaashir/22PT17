import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Diameter of Pizza, Price: ");
        float Diameter = input.nextFloat();
        float Price = input.nextFloat();
        System.out.printf("Diameter of Pizza = %.2f Inch(s)\n", Diameter);
        System.out.printf("Price of Pizza = Rs. %.2f\n", Price);
        float Area = (float) (Math.PI * Math.pow((Diameter / 2), 2));
        float PricePerSquareInch = Price / Area;
        System.out.printf("Price per square inch of Pizza = Rs. %.2f\n", PricePerSquareInch);
        System.out.println();
    }
}
