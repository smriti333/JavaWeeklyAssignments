package practice;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] bins = new int[10]; // bins for 1-10, 11-20, ..., 91-100

        System.out.println("Enter numbers between 1 and 100 (type any non-integer to finish):");

        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 100) {
                int index = (num - 1) / 10;
                bins[index]++;
            } else {
                System.out.println("Number out of range (1-100), ignored.");
            }
        }

        // Print the histogram
        System.out.println("\nHistogram:");
        for (int i = 0; i < bins.length; i++) {
            int low = i * 10 + 1;
            int high = (i + 1) * 10;
            System.out.printf("%2d -%3d | ", low, high);
            for (int j = 0; j < bins[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

