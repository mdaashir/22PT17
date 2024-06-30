import java.util.Scanner;

public class Hello {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.print("Enter number of racers: ");
        // int NumberOfRacers = input.nextInt();
        int NumberOfRacers = 5;
        int[] SpeedOfRacers = new int[NumberOfRacers];
        int Average = 0;
        System.out.print("Enter the speed of " + NumberOfRacers + " racer: ");
        for (int i = 0; i < NumberOfRacers; i++) {
            SpeedOfRacers[i] = input.nextInt();
            Average += SpeedOfRacers[i];
        }
        Average /= NumberOfRacers;
        // System.out.println("Average speed: " + Average + " kmph");
        System.out.println("Speed of qualifying racers: ");
        for (int i = 0; i < NumberOfRacers; i++) {
            if (SpeedOfRacers[i] >= Average)
                System.out.println("Racer " + (i + 1) + " = " + SpeedOfRacers[i] + " kmph");
        }
        System.out.println();
    }
}
