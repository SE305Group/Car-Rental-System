import java.util.ArrayList;
import java.util.Scanner;

public class LoginProgram {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample user data
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));

        // Login or Register
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Choose an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
        }
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the user exists
        User foundUser = findUser(username, password);

        if (foundUser != null) {
            System.out.println("Login successful. Welcome, " + foundUser.getUsername() + "!");
        } else {
            System.out.println("User not registered. Please register before logging in.");
            register();
        }
    }

    private static void register() {
        System.out.print("Enter a new username: ");
        String newUsername = scanner.nextLine();

        // Check if the username already exists
        if (userExists(newUsername)) {
            System.out.println("Username already exists. Please choose a different username.");
            return;
        }

        System.out.print("Enter a password: ");
        String newPassword = scanner.nextLine();

        // Create a new user
        User newUser = new User(newUsername, newPassword);
        users.add(newUser);

        System.out.println("Registration successful. Welcome, " + newUsername + "!");

        // Log in the newly registered user
        System.out.println("Logging in...");
        System.out.println("Login successful. Welcome, " + newUsername + "!");
    }

    private static User findUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    private static boolean userExists(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
}
