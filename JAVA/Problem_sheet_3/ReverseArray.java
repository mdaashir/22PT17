package Problem_sheet_3;

import java.util.Scanner;

class ReverseArray {
    static void main() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number of elements: ");
            int Number = input.nextInt();
            if (Number < 0)
                throw new Exception();
            int[] Array = new int[Number];
            System.out.printf("Enter a values: ");
            for (int i = 0; i < Number; i++) {
                Array[i] = input.nextInt();
            }
            System.out.print("Stored Array before reverse: ");
            for (int i : Array)
                System.out.print(i + " ");
            for (int i = 0; i < Number / 2; i++) {
                int temp = Array[i];
                Array[i] = Array[Number - i - 1];
                Array[Number - i - 1] = temp;
            }
            System.out.printf("%nStored Array after reverse: ");
            for (int i : Array)
                System.out.print(i + " ");
            System.out.println();
        } catch (Exception e) {
            System.out.println("The array size cannot be negative");
        }
    }
}
