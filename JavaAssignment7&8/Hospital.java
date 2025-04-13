package main;

//Base class
class Employee {
 protected int empId; //Subclasses like Doctor, Nurse, Cleaner can directly access empId and name without needing getter method so protected is used here.
 protected String name;

 public Employee(int empId, String name) {
     this.empId = empId;
     this.name = name;
 }

 public void displayInfo() {
     System.out.println("Employee Name: " + name + ", ID: " + empId);
 }
}

//Doctor subclass
class Doctor extends Employee {
 private String specialty;

 public Doctor(int empId, String name, String specialty) {
     super(empId, name);
     this.specialty = specialty;
 }

 public void specialize() {
     System.out.println("Doctor Emp#" + empId + " specializes in " + specialty);
 }
}

//Nurse subclass
class Nurse extends Employee {
 public Nurse(int empId, String name) {
     super(empId, name);
 }

 public void attendPatients() {
     System.out.println("Nurse Emp#" + empId + " is attending patients");
 }
}

//Receptionist subclass
class Receptionist extends Employee {
 public Receptionist(int empId, String name) {
     super(empId, name);
 }

 public void answerPhone() {
     System.out.println("Receptionist Emp#" + empId + " is answering phone calls");
 }
}

//Cleaner subclass
class Cleaner extends Employee {
 public Cleaner(int empId, String name) {
     super(empId, name);
 }

 public void sweep() {
     System.out.println("Cleaner Emp#" + empId + " is sweeping the hospital");
 }
}


//Hospital driver class
public class Hospital { 
    public static void main(String[] args) {
        // Create employee instances
        Doctor doc = new Doctor(101, "Dr. Sita", "Cardiology");
        Nurse nurse = new Nurse(102, "Nurse Rita");
        Receptionist receptionist = new Receptionist(103, "Gopal");
        Cleaner cleaner = new Cleaner(104, "Ram");

        // Call their respective services
        doc.specialize();
        nurse.attendPatients();
        receptionist.answerPhone();
        cleaner.sweep();
    }
}





