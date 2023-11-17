import java.util.ArrayList;
import java.util.Scanner;
class DetailsOfPerson {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;

    public DetailsOfPerson(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
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

public class MultipleAdressBook {
    private static ArrayList<Person> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        contacts.add(new Person("kiran","kumar","kothapalli","kadapa","AP","516330","6301072707","keru56367@gmail.com"));
        contacts.add(new Person("Uday","kumar","rekalakunta","kadapa","AP","516503","9121696212","uday56367@gmail.com"));

        displayMenu();
    }

    private static void displayMenu() {
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. View Contacts");
            System.out.println("2. Add Multiple Contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    viewContacts();
                    break;
                case 2:
                    addMultipleContacts();
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
    private static void addMultipleContacts(){
        System.out.println("Enter Number Of Contacts You Want To Add:");
        int num = scanner.nextInt();
        for (int i =1 ; i <= num; i++){
            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter City: ");
            String city = scanner.nextLine();

            System.out.print("Enter State: ");
            String state = scanner.nextLine();

            System.out.print("Enter ZIP: ");
            String zip = scanner.nextLine();

            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            // Create a new contact
            AddressBook contact = new AddressBook(firstName, lastName, address, city,
                    state, zip, phoneNumber, email);

            // Display contact details
            contact.displayContact();
        }


    }
}
