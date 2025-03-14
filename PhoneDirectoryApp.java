import java.util.ArrayList;
import java.util.Scanner;

public class PhoneDirectoryApp {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> phoneNumbers = new ArrayList<>();

        String[] initialNames = {"French", "Rj", "Raph", "Lance", "Llyod", "John", "Kean", "Karel", "Kirby", "Sigh"};
        String[] initialNumbers = {"09993161210", "09987654321", "09123456789", "09234567890", "09345678901",  
                                    "09456789012", "09567890123", "09678901234", "09789012345", "09890123456"};

        for (int i = 0; i < 10; i++) {
            names.add(initialNames[i]);
            phoneNumbers.add(initialNumbers[i]);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name to search (or 'quit' to exit): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                System.out.println("Exiting the program.");
                break;
            }

            int index = names.indexOf(name);
            if (index != -1) {
                System.out.println("Phone number for " + name + " is: " + phoneNumbers.get(index));
            } else {
                if (names.size() >= 30) {
                    System.out.println("Directory is full. Cannot add new entries.");
                    break;
                } else {
                    System.out.print("Name not found. Enter phone number for " + name + ": ");
                    String phoneNumber = scanner.nextLine();
                    names.add(name);
                    phoneNumbers.add(phoneNumber);
                    System.out.println("New entry added for " + name + ".");
                }
            }
        }

        scanner.close();
    }
}