import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of Hydrogen(H), Carbon(C), Oxygen(O) atoms: ");
        int hydrogenAtoms = input.nextInt();
        int carbonAtoms = input.nextInt();
        int oxygenAtoms = input.nextInt();
        float molecularWeight = (1.0079f * hydrogenAtoms) + (12.011f * carbonAtoms) + (15.9994f * oxygenAtoms);
        System.out.printf("The molecular weight of %dH %dC %dO = %.2f grams/mole\n",hydrogenAtoms, carbonAtoms, oxygenAtoms, molecularWeight );
        System.out.println();
    }
}
