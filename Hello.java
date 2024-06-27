import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the coordinates of the point (x1, y1): ");
        float[] Point1 = { input.nextFloat(), input.nextFloat() };
        System.out.print("Enter the coordinates of the point (x2, y2): ");
        float[] Point2 = { input.nextFloat(), input.nextFloat() };
        if (Point1[0] == Point2[0])
            System.out.println("The points are on the same vertical line.");
        else {
            float Slope = (Point2[1] - Point1[1]) / (Point2[0] - Point1[0]);
            System.out.printf("The slope of the line = %.2f\n", Slope);
        }
    }
}
