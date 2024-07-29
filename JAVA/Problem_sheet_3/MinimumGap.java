package Problem_sheet_3;

import java.util.Scanner;

class MinimumGap {
    static int minGap(int array[]) {
        int gap = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (Math.abs(array[i + 1] - array[i]) < gap) {
                gap = Math.abs(array[i + 1] - array[i]);
            }
        }
        return gap;
    }

    static void main() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n*** Minimun Gap in Array ***");
            System.out.print("Enter the size of the array:");
            int SizeofArray = input.nextInt();

            if (SizeofArray < 0)
                throw new Exception();

            int[] Array = new int[SizeofArray];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < SizeofArray; i++) {
                Array[i] = input.nextInt();
            }
            System.out.println("The minimum gap is " + minGap(Array));
        } catch (Exception e) {
            System.out.println("Array size cannot be negative");
        }
    }
}
