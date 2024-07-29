import java.util.Scanner;

public class Temp {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Question Number: ");
            new Problem_Sheet_3(input.nextInt());
        }
    }
}
