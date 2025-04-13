package JavaLab;

class Bulb {
    private boolean isOn; // Represents whether the bulb is on or off

    
    public Bulb() {
        this.isOn = false; // Bulb is off by default
    }

    // Method to turn on the bulb
    public void turnOn() {
        isOn = true;
        System.out.println("The bulb is now ON.");
    }

    // Method to turn off the bulb
    public void turnOff() {
        isOn = false;
        System.out.println("The bulb is now OFF.");
    }

    // Method to check if the bulb is on or off
    public boolean isOn() {
        return isOn;
    }

    // toString method to display the current state of the bulb
    public String toString() {
        return "The bulb is " + (isOn ? "ON" : "OFF");
    }
}


public class Lights {
	
	public static void main(String[] args) {
        // Creating Bulb objects
        Bulb bul1 = new Bulb();
        Bulb bul2 = new Bulb();

        // Displaying initial state of bulbs
        System.out.println(bul1);
        System.out.println(bul2);

        // Turning on the bulbs
        bul1.turnOn();
        bul2.turnOn();

        // Displaying state of bulbs after turning on
        System.out.println(bul1);
        System.out.println(bul2);
    }

}
