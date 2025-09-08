import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    public String name;
    public String age;
    public String gender;
    public String occupation;
    public String inputName;
    public String inputAge;
    public String inputGender;
    public String inputOccupation;

    public Person() {
        System.out.println("\nEnter details for a new person:");
        System.out.print("Name: ");
        inputName = sc.nextLine();
        System.out.print("Age: ");
        inputAge = sc.nextLine();
        System.out.print("Gender: ");
        inputGender = sc.nextLine();
        System.out.print("Occupation: ");
        inputOccupation = sc.nextLine();

        this.name = inputName;
        this.age = inputAge;
        this.gender = inputGender;
        this.occupation = inputOccupation;
    }

    public Person(String name, String age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
    }

    public void displayInfo() {
        String info = "";
        info += "Name: " + this.name;
        info += "\nAge: " + this.age;
        info += "\nGender: " + this.gender;
        info += "\nOccupation: " + this.occupation;

        System.out.println("\n--- Person Details ---");
        System.out.println(info + "\n");
    }
}
