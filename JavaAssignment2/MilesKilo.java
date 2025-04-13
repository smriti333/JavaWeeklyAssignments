package main;
import java.util.Scanner;

public class MilesKilo {
	public static void main(String[] args) {
		
		float mile;
		double kilometer;
		
		Scanner Obj = new Scanner(System.in);
		System.out.print("Enter the value for converison of miles to kilometers: ");
		mile = Obj.nextFloat();
		kilometer = (double) mile * 1.60935;
		
		System.out.println(mile + " mile is equal to " + kilometer + " kilometer.");
		
		Obj.close();
		
		
		
	}

}
