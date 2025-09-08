package bankaccount;

public class PersonTester {
    public static void main(String[] args) {
        Person p1 = new Person("Angela Sophia Maglines", "20", "Female", "IT");

        Person p2 = new Person();

        p1.displayInfo();
        p2.displayInfo();
    }
}
