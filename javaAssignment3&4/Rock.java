package main;
import java.util.Scanner;
import java.util.Random;


public class Rock {
	public static void main (String[] args) {
		String personPlay;
		String computerPlay;
		int computerInt;
		
		
		Scanner scan = new Scanner(System.in);
			Random generator = new Random();
			
			System.out.print("Enter your play (R , P OR S): ");
			personPlay = scan.next().toUpperCase();
			
			computerInt = generator.nextInt(3);
			
			switch (computerInt) {
			case 0:
				computerPlay = "R";
				break;
			case 1:
				computerPlay = "P";
				break;
			case 2:
				computerPlay = "S";
				break;
			default:
				computerPlay = "R";
			
			}
			
			System.out.println("Computer plays: " +computerPlay);
			
			
			if (personPlay.equals(computerPlay)) {
				System.out.println("Its a tie!");
			}  else if (personPlay.equals("R")) {
				if(computerPlay.equals("S"))
					System.out.println("Rock crushes Scissors. You win!!");
	            else
	                System.out.println("Paper covers Rock. Computer wins!");
	        } else if (personPlay.equals("P")) {
	            if (computerPlay.equals("R"))
	                System.out.println("Paper covers Rock. You win!!");
	            else
	                System.out.println("Scissors cut Paper. Computer wins!");
	        } else if (personPlay.equals("S")) {
	            if (computerPlay.equals("P"))
	                System.out.println("Scissors cut Paper. You win!!");
	            else
	                System.out.println("Rock crushes Scissors. Computer wins!");
	        } else {
	            System.out.println("Invalid input. Please enter R, P, or S.");
	        }

	        scan.close();
	    }
	
			
				
	}
	
	

