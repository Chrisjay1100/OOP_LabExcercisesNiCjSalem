public class CarTester {
    public static void main(String[] args) {
        Car car1 = new Car("Ivory White", "AQC 2345", "CH-928374XZ", "Toyota");

        Car car2 = new Car();

        car1.displayInfo();
        car2.displayInfo();
    }
}
