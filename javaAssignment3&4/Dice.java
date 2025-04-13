package JavaLab;


import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("How many sides does die 1 have? ");
        int side1 = scanner.nextInt();
        
        System.out.print("How many sides does die 2 have? ");
        int side2 = scanner.nextInt();

        int sumDice1 = 0, sumDice2 = 0;

        
        for (int i = 1; i <= 3; i++) {
            int roll1 = random.nextInt(side1) + 1; 
            int roll2 = random.nextInt(side2) + 1;
            
            System.out.println("Die 1 roll " + i + " = " + roll1 + ".");
            System.out.println("Die 2 roll " + i + " = " + roll2 + ".");

            sumDice1 += roll1;
            sumDice2 += roll2;
        }

       
        double avgDice1 = sumDice1 / 3.0;
        double avgDice2 = sumDice2 / 3.0;

        System.out.println("Die 1 rolled a total of " + sumDice1 + " and rolled " + avgDice1 + " on average.");
        System.out.println("Die 2 rolled a total of " + sumDice2 + " and rolled " + avgDice2 + " on average.");

        scanner.close();
    }
}

