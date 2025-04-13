package main;
import java.util.Scanner;


class Manchey {
    String firstName;
    String lastName;
    String postalCode;

    public Manchey(String firstName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public void display() {
        System.out.printf("%-15s %-15s %-10s\n", firstName, lastName, postalCode); //%-15s → left-align a string in a space of 15 characters

                                                                                   //%-10s → left-align a string in 10 characters

                                                                                   //\n → newline at the end
    }
}

public class PostCodeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manchey[] people = new Manchey[25];
        int count = 0;

        System.out.println("Enter up to 25 records (firstName lastName postalCode).");
        System.out.println("Enter an empty line to stop input early.");

        while (count < 25) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }

            String[] parts = line.split("\\s+"); // split by one or more spaces
            if (parts.length != 3) {
                System.out.println("Invalid input format. Please enter exactly 3 values separated by spaces.");
                continue;
            }

            people[count] = new Manchey(parts[0], parts[1], parts[2]);
            count++;
        }

        System.out.printf("\n%-15s %-15s %-10s\n", "First Name", "Last Name", "Postal Code");
        System.out.println("---------------------------------------------");
        for (int i = 0; i < count; i++) {
            people[i].display();
        }

        scanner.close();
    }
}
