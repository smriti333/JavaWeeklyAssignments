package main;
import java.util.Scanner;

public class Square {
	public static void main(String[]args) {
		
		int length,area,perimeter;
		Scanner UserInput = new Scanner(System.in);
		System.out.print("Enter the length of the square: ");
		
		length = UserInput.nextInt();
	    area = length*length;
	    perimeter = 4*length;
	    System.out.println("The area of the square is " + area + " meter" + "." );
	    System.out.println("The perimeter of the square is "+ perimeter + " meter" +  ".");
	    
	    UserInput.close();
	    
		
		
	}

}
