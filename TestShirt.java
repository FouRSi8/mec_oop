import java.util.Scanner;

class Shirt {
    private String material = "cotton";
    private int collarSize;
    private int sleeveLength;

    public Shirt(int collarSize, int sleeveLength) {
        this.collarSize = collarSize;
        this.sleeveLength = sleeveLength;
    }

    public void displayInfo() {
        System.out.println("Shirt Information:");
        System.out.println("Material: " + material);
        System.out.println("Collar Size: " + collarSize);
        System.out.println("Sleeve Length: " + sleeveLength);
        System.out.println();
    }
}

public class TestShirt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shirt[] shirts = new Shirt[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Shirt " + (i + 1));
            System.out.print("Collar Size: ");
            int collarSize = scanner.nextInt();
            System.out.print("Sleeve Length: ");
            int sleeveLength = scanner.nextInt();

            shirts[i] = new Shirt(collarSize, sleeveLength);
        }

	System.out.println();
	System.out.println("Shirt Details:");
	System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Shirt " + (i + 1) + ":");
            shirts[i].displayInfo();
        }
    }
}
