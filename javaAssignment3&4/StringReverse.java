package main;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String name= scanner.nextLine();
		
		String reverse=" ";
		  for(int i= name.length() -1; i>=0; i--) {
			  reverse += name.charAt(i);
		  }
		 System.out.println("Reverse is: " + reverse);
		// displayStrings(reverse, name);
		
	}
	static void Method(String reverse, String name) {
		System.out.println("name: "+ name);
		System.out.println("reverse: "+ reverse);
		
	
	}

}
