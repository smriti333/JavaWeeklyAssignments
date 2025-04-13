package main;
import java.util.Scanner;

class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
            System.out.println("Deposited Rs" + amount + " to " + accountHolder + "'s account.");
        }
    }

    
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds for " + accountHolder + ".");
        } else {
            balance -= amount;
            System.out.println("Withdrew Rs" + amount + " from " + accountHolder + "'s account.");
        }
    }

    
    
    public void addInterest() {
        balance += balance * 0.03;
    }

    public void showAccount() {
        System.out.printf("%-20s $%.2f\n", accountHolder, balance);
    }
}




public class LLBank {
	
	private static final int MAX_CUSTOMERS = 30;
    private static Account[] accounts = new Account[MAX_CUSTOMERS];
    private static int accountCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- L&L Bank Menu ---");
            System.out.println("1. Create an account");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Add 3% interest to all accounts");
            System.out.println("5. Show all accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> createAccount(scanner);
                case 2 -> makeDeposit(scanner);
                case 3 -> makeWithdrawal(scanner);
                case 4 -> addInterestToAll();
                case 5 -> showAllAccounts();
                case 6 -> System.out.println("Exiting... Thank you for banking with us!");
                default -> System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        scanner.close();
    }

    private static void createAccount(Scanner scanner) {
        if (accountCount >= MAX_CUSTOMERS) {
            System.out.println("Cannot create more accounts. Limit reached.");
            return;
        }
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        accounts[accountCount++] = new Account(name);
        System.out.println("Account created for " + name + ".");
    }

    private static Account findAccount(String name) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountHolder().equalsIgnoreCase(name)) {
                return accounts[i];
            }
        }
        return null;
    }

    private static void makeDeposit(Scanner scanner) {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        Account account = findAccount(name);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        account.deposit(amount);
    }

    private static void makeWithdrawal(Scanner scanner) {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        Account account = findAccount(name);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        account.withdraw(amount);
    }

    private static void addInterestToAll() {
        for (int i = 0; i < accountCount; i++) {
            accounts[i].addInterest();
        }
        System.out.println("3% interest added to all accounts.");
    }

    private static void showAllAccounts() {
        if (accountCount == 0) {
            System.out.println("No accounts found.");
        } else {
            System.out.println("\n--- Account List ---");
            for (int i = 0; i < accountCount; i++) {
                accounts[i].showAccount();
            }
        }
    }


}
