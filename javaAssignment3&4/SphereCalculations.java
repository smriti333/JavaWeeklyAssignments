package JavaLab;
import java.util.Scanner;

public class SphereCalculations {
	
	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	   
	        System.out.print("Enter the radius of the sphere: ");
	        double radius = input.nextDouble();

	        // Calculating the volume and surface area
	        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);

	        // Printing the  results with 4 decimal places
	        System.out.printf("Volume: %.4f\n", volume);
	        System.out.printf("Surface Area: %.4f\n", surfaceArea);

	        input.close();
	    }
	
	

}
