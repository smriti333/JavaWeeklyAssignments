package JavaLab;

import java.text.DecimalFormat;

class Sphere {
    private double diameter;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getVolume() {
        double radius = diameter / 2.0;
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double getSurfaceArea() {
        double radius = diameter / 2.0;
        return 4 * Math.PI * Math.pow(radius, 2); // This calculates radius squared.
    }

    public String toString() {
        return "The Sphere with diameter " + df.format(diameter) + " has volume " + df.format(getVolume()) + " and surface area " + df.format(getSurfaceArea());
    }
}

public class MultiSphere {
    public static void main(String[] args) {
        Sphere sphere1 = new Sphere(5);
        Sphere sphere2 = new Sphere(7);
        
        System.out.println(sphere1);
        System.out.println(sphere2);
        
        sphere1.setDiameter(3);
        System.out.println("\n" + "After updating sphere1's diameter:");
        System.out.println(sphere1);
    }
}
