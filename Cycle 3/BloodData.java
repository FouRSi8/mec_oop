class BloodData {
    private String bloodType;
    private char rhFactor;

    // Default constructor
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = '+';
    }

    // Overloaded constructor
    public BloodData(String bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public char getRhFactor() {
        return rhFactor;
    }
}

class Patient {
    private int ID;
    private int age;
    private BloodData bloodData;

    // Default constructor
    public Patient() {
        this.ID = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    // Overloaded constructor
    public Patient(int ID, int age, BloodData bloodData) {
        this.ID = ID;
        this.age = age;
        this.bloodData = bloodData;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }
}

public class TestPatient {
    public static void main(String[] args) {
        // Creating a Patient object using the default constructor
        Patient patient1 = new Patient();
        System.out.println("Patient 1 - Default Constructor:");
        System.out.println("ID: " + patient1.getID());
        System.out.println("Age: " + patient1.getAge());
        System.out.println("Blood Type: " + patient1.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient1.getBloodData().getRhFactor());

        // Creating a Patient object using the overloaded constructor
        BloodData bloodData2 = new BloodData("AB", '-');
        Patient patient2 = new Patient(12345, 30, bloodData2);
        System.out.println("\nPatient 2 - Overloaded Constructor:");
        System.out.println("ID: " + patient2.getID());
        System.out.println("Age: " + patient2.getAge());
        System.out.println("Blood Type: " + patient2.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient2.getBloodData().getRhFactor());
    }
}