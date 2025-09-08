package bankaccount;

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
        System.out.println("Tell me about yourself.");
        System.out.print("Your full name: ");
        inputName = sc.nextLine();
        System.out.print("Your age: ");
        inputAge = sc.nextLine();
        System.out.print("Your gender: ");
        inputGender = sc.nextLine();
        System.out.print("Your occupation: ");
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
        info += "Personal Information:";
        info += "\nName: " + this.name;
        info += "\nAge: " + this.age;
        info += "\nGender: " + this.gender;
        info += "\nOccupation: " + this.occupation;

        System.out.println("\n" + info + "\n");
    }
}
