package main;


 class Record {
 private String name;
 private String accountNumber;
 private double balance;

 // Constructor with all details
 public Record(String name, String accountNumber, double balance) {
     this.name = name;
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // New constructor: name + account number, balance defaults to 0
 public Record(String name, String accountNumber) {
     this.name = name;
     this.accountNumber = accountNumber;
     this.balance = 0.0;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited Rs" + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 public void withdraw(double amount) {
     if (amount > balance) {
         System.out.println("Insufficient balance.");
     } else if (amount <= 0) {
         System.out.println("Withdrawal amount must be positive.");
     } else {
         balance -= amount;
         System.out.println("Withdrew Rs" + amount);
     }
 }

 public void display() {
     System.out.println("Name: " + name);
     System.out.println("Account #: " + accountNumber);
     System.out.printf("Balance: $%.2f\n", balance);
     System.out.println();
 }
 
}




public class Transactions {
	
	 public static void main(String[] args) {
	       
		    Record acc1 = new Record("Smriti", "A1001", 500.00);
	        acc1.display();

	        
	        Record acc2 = new Record("Josh", "A1002");
	        acc2.display();

	        
	        acc2.deposit(200);
	        acc2.withdraw(50);
	        acc2.display();
	    }

}
