package main;

import java.util.Random;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Prompt user for a 4-digit PIN
        System.out.print("Enter a 4-digit pin number to encrypt: ");
        int pin = scanner.nextInt();

        // Converting the pin to hexadecimal
        String hexPin = Integer.toHexString(pin);

        // Generating the two random numbers in the range 1001 to 65535
        int randomNum1 = 1000 + random.nextInt(64536); // Ensuring number is between 1000 and 65535
        int randomNum2 = 1000 + random.nextInt(64536);

        // Converting random numbers to hexadecimal
        String hexRandom1 = Integer.toHexString(randomNum1);
        String hexRandom2 = Integer.toHexString(randomNum2);

        // Concatenating the hex values to form the encrypted pin
        String encryptedPin = hexRandom1 + hexPin + hexRandom2;

        // Displaying the encrypted PIN
        System.out.println("Your encrypted pin number is " + encryptedPin + ".");

        scanner.close();
    }
}


