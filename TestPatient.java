import java.util.*;

class Blooddata {
    private String bloodtype;

    public Blooddata() {
        this.bloodtype = "0";
    }

    public Blooddata(String bloodtype, char rhfactor) {
        this.bloodtype = bloodtype;
    }

    public String getbloodtype() {
        return bloodtype;
    }
}

class Patient {
    private int PatientId;
    private int age;
    private Blooddata blooddata;

    public Patient() {
        this.PatientId = 0;
        this.age = 0;
        this.blooddata = new Blooddata();
    }

    public Patient(int PatientId, int age, Blooddata blooddata) {
        this.PatientId = PatientId;
        this.age = age;
        this.blooddata = blooddata;
    }

    public int getPatientId() {
        return PatientId;
    }

    public int getage() {
        return age;
    }

    public Blooddata getBlooddata() {
        return blooddata;
    }
}

class TestPatient {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of patients: ");
        int num = sc.nextInt();
        List<Patient> patients = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            System.out.print("\nEnter the information of patient " + i + ": ");
            System.out.print("\nPatient ID: ");
            int PatientId = sc.nextInt();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Blood Type (e.g., A, B, AB, O): ");
            String bloodType = sc.next();
            System.out.print("Rh Factor (+ or -): ");
            char rhfactor = sc.next().charAt(0);

            Blooddata blooddata = new Blooddata(bloodType, rhfactor);
            Patient patient = new Patient(PatientId, age, blooddata);
            patients.add(patient);
        }

        System.out.println("\nPatient Information:");
        for (int i = 0; i < num; i++) {
            	Patient patient = patients.get(i);
		System.out.println("Patient "+(i+1));
            	System.out.println("ID: " + patient.getPatientId());
            	System.out.println("Age: " + patient.getage());
            	System.out.println("Blood Type: " + patient.getBlooddata().getbloodtype());
            	System.out.println("Rh Factor: " + patient.getBlooddata().getrhfactor());
            	System.out.println();
        }

        sc.close();
    }
}
