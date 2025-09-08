import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);
    public String color;
    public String plateNo;
    public String chassisNo;
    public String brand;
    public String inputColor;
    public String inputPlateNo;
    public String inputChassisNo;
    public String inputBrand;

    public Car() {
        System.out.println("\nLet's register a car:");
        System.out.print("Color: ");
        inputColor = sc.nextLine();
        System.out.print("Plate Number: ");
        inputPlateNo = sc.nextLine();
        System.out.print("Chassis Number: ");
        inputChassisNo = sc.nextLine();
        System.out.print("Brand: ");
        inputBrand = sc.nextLine();

        this.color = inputColor;
        this.plateNo = inputPlateNo;
        this.chassisNo = inputChassisNo;
        this.brand = inputBrand;
    }

    public Car(String color, String plateNo, String chassisNo, String brand) {
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.brand = brand;
    }

    public void displayInfo() {
        String info = "";
        info += "Color: " + this.color;
        info += "\nPlate Number: " + this.plateNo;
        info += "\nChassis Number: " + this.chassisNo;
        info += "\nBrand: " + this.brand;

        System.out.println("\n--- Car Details ---");
        System.out.println(info + "\n");
    }
}
