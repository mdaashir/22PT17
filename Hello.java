import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Radius: ");
        float Radius = input.nextFloat();
        System.out.printf("Radius of Sphere = %.2f units\n", Radius);
        float Volume = (float)((4.0f/3.0f) * Math.PI * Math.pow(Radius, 3));
        float SurfaceArea = (float)(4 * Math.PI * Math.pow(Radius, 2));
        System.out.printf("Volume of Sphere = %.2f cubic units\n", Volume);
        System.out.printf("Surface Area of Sphere = %.2f square units\n", SurfaceArea);
    }
}
