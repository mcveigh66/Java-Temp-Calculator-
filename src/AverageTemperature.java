import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. take input from the user (number of days)
        System.out.print("How many days' temperatures? ");
        int numDays = scanner.nextInt();

        // made sure 0 days cant be entered
        if (numDays <= 0) {
            System.out.println("Number of days must be greater than 0.");
            scanner.close();
            return;
        }

        double[] temperatures = new double[numDays];
        double sum = 0;

        // 2. prompt the user to enter all temperature values
        System.out.println("Enter " + numDays + " temperature values:");
        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }

        // 3. calculate the average temperature
        double average = sum / numDays;
        System.out.printf("%nAverage temp = %.1f%n", average);

        // 4. count how many temperatures are above average
        int countAboveAverage = 0;
        for (int i = 0; i < numDays; i++) {
            if (temperatures[i] > average) {
                countAboveAverage++;
            }
        }

        System.out.println(countAboveAverage + " days were above average.");

        scanner.close();
    }
}