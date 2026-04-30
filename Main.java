// Define class person with suitable data member and methods. And extend this class in Manager class. 
// Display manager details.
import java.util.Scanner;

// Base class
class Person {
    String name;
    int age;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}

// Derived class
class Manager extends Person {
    int salary;

    void acceptManager() {
        Scanner sc = new Scanner(System.in);

        super.accept(); // call parent method

        System.out.print("Enter salary: ");
        salary = sc.nextInt();
    }

    void displayManager() {
        super.display(); // call parent method
        System.out.println("Salary: " + salary);
    }

}

// Main class
public class Main {
    public static void main(String[] args) {

        Manager m = new Manager();

        m.acceptManager();
        System.out.println("\nManager Details:");
        m.displayManager();
    }

}
