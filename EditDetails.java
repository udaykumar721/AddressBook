import java.util.ArrayList;
import java.util.Scanner;

class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public Person(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getter and setter methods for the person's details


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAddress :" + address + "\nCity :"+ city +"\nState :"+ state + "\nZIP :"+zip+"\nPhone Number :"+ phoneNumber +"\nEmail :"+email;
    }
}

public class EditDetails {
    private static ArrayList<Person> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Adding some initial contacts for demonstration
        contacts.add(new Person("kiran","kumar","kothapalli","kadapa","AP","516330","6301072707","keru56367@gmail.com"));
        contacts.add(new Person("Uday","kumar","rekalakunta","kadapa","AP","516503","9121696212","uday56367@gmail.com"));

        displayMenu();
    }

    private static void displayMenu() {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. View Contacts");
            System.out.println("2. Edit Contact");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    viewContacts();
                    break;
                case 2:
                    editContact();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    private static void viewContacts() {
        System.out.println("\nContacts:");
        for (Person person : contacts) {
            System.out.println(person);
            System.out.println("--------------------");
        }
    }

    private static void editContact() {
        System.out.print("Enter the name of the person to edit: ");
        String searchName = scanner.nextLine();

        Person foundPerson = null;
        for (Person person : contacts) {
            if (person.getFirstName().equalsIgnoreCase(searchName)) {
                foundPerson = person;
                break;
            }
        }

        if (foundPerson != null) {
            System.out.println("Found the following contact:\n" + foundPerson);
            System.out.println("Enter new details:");

            System.out.print("New First Name: ");
            foundPerson.setFirstName(scanner.nextLine());

            System.out.print("New Last Name: ");
            foundPerson.setLastName(scanner.nextLine());

            System.out.print("New Address: ");
            foundPerson.setAddress(scanner.nextLine());

            System.out.print("New City: ");
            foundPerson.setCity(scanner.nextLine());

            System.out.print("New State: ");
            foundPerson.setState(scanner.nextLine());

            System.out.print("New ZIP: ");
            foundPerson.setZip(scanner.nextLine());

            System.out.print("New Phone Number: ");
            foundPerson.setPhoneNumber(scanner.nextLine());

            System.out.print("New Email: ");
            foundPerson.setEmail(scanner.nextLine());

            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}
