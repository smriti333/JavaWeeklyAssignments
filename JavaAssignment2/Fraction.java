package main;
import java.util.Scanner;

public class Fraction {
	public static void main(String[]args) {
		
		int numerator, denominator;
		double decimal;
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter the numerator: ");
		numerator = Scanner.nextInt();
		
		System.out.print("Enter the denominator: ");
		denominator = Scanner.nextInt();
		
		decimal = (double) numerator/denominator;
		
		System.out.println("The decimal equivalent of the given fraction is " + decimal + ".");
		
		
		
		Scanner.close();
		
		
	}
	

}
