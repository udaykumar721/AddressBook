import java.util.Scanner;

public class AddContact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input contact details
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
