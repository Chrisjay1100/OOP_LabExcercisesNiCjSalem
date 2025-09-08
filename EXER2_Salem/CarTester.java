public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car("COLOR", "PLATENUMBER", "CHASSISNUMBER", "BRAND");
        
        Car c2 = new Car();
        
        c1.displayInfo();
        c2.displayInfo();
    }
}
