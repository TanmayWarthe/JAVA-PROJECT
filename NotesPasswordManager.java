package JAVA;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class NotesPasswordManager {
    private static Map<String, String> notes = new HashMap<>();
    private static Map<String, String> passwords = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Add Password");
            System.out.println("4. View Passwords");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addNote();
                    break;
                case 2:
                    viewNotes();
                    break;
                case 3:
                    addPassword();
                    break;
                case 4:
                    viewPasswords();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addNote() {
        System.out.print("Enter a title for your note: ");
        String title = scanner.nextLine();
        System.out.print("Enter the content of your note: ");
        String content = scanner.nextLine();
        notes.put(title, content);
        System.out.println("Note added successfully!");
    }

    private static void viewNotes() {
        if (notes.isEmpty()) {
            System.out.println("No notes available.");
        } else {
            System.out.println("Your notes:");
            for (Map.Entry<String, String> entry : notes.entrySet()) {
                System.out.println("Title: " + entry.getKey());
                System.out.println("Content: " + entry.getValue());
                System.out.println("-----------");
            }
        }
    }

    private static void addPassword() {
        System.out.print("Enter a name for your password entry: ");
        String name = scanner.nextLine();
        System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        passwords.put(name, password);
        System.out.println("Password added successfully!");
    }

    private static void viewPasswords() {
        if (passwords.isEmpty()) {
            System.out.println("No passwords available.");
        } else {
            System.out.println("Your passwords:");
            for (Map.Entry<String, String> entry : passwords.entrySet()) {
                System.out.println("Name: " + entry.getKey());
                System.out.println("Password: " + entry.getValue());
                System.out.println("-----------");
            }
        }
    }
}