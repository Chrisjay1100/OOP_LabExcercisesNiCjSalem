public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person("Marcus Lee", "34", "Male", "Software Engineer");

        Person person2 = new Person();

        person1.displayInfo();
        person2.displayInfo();
    }
}
