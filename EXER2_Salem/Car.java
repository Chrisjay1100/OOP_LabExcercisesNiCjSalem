import java.util.Scanner;

public class Car {
    Scanner sc = new Scanner(System.in);
    public String color;
    public String plateNo;
    public String chassisNo;
    public String brand;
    public String scColor;
    public String scPN;
    public String scCN;
    public String scBrand;
    
    public Car() {
        System.out.println("Enter The Specific Attributes of a car you want!");
        System.out.println("Enter color you want: ");
        scColor = sc.nextLine();
        System.out.println("Enter PlateNumber: ");
        scPN = sc.nextLine();
        System.out.println("Enter Chassis No.: ");
        scCN = sc.nextLine();
        System.out.println("Enter the brand of the cra: ");
        scBrand = sc.nextLine();
        
        this.color = scColor;
        this.plateNo = scPN;
        this.chassisNo = scCN;
        this.brand = scBrand;
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
        info += "\nPlateNo: " + this.plateNo;
        info += "\nChassisNo: " + this.chassisNo;
        info += "\nBrand: " + this.brand;
        
        System.out.println(info);
    }
}
