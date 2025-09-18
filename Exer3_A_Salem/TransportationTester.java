public class TransportationTester {
    public static void main(String[] args) {
        Transportation[] transports = {
            new Airplane(),
            new Helicopter(),
            new Truck(),
            new SUV(),
            new Motorcycle(),
            new Tricycle(),
            new Kariton(),
            new Sailboat(),
            new Ferry(),
            new Boat(),
            new Submarine()
            
        };

        for (Transportation t : transports) {
            System.out.println("\nTesting: " + t.getClass().getSimpleName());
            t.move();

            if (t instanceof AirTransport) {
                ((AirTransport) t).fly();
            } else if (t instanceof LandTransport) {
                ((LandTransport) t).drive();
            } else if (t instanceof WaterTransport) {
                ((WaterTransport) t).sail();
            }
        }
    }
}
