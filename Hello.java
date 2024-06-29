import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the coordinates of the point (x1, y1): ");
        float[] Point1 = { input.nextFloat(), input.nextFloat() };
        System.out.print("Enter the coordinates of the point (x2, y2): ");
        float[] Point2 = { input.nextFloat(), input.nextFloat() };
        float Distance = (float)Math.sqrt(Math.pow((Point2[0] - Point1[0]), 2) + Math.pow((Point2[1] - Point1[1]), 2));
        System.out.printf("The Distance between 2 points = %.2f units\n", Distance);
        System.out.println();
    }
}
