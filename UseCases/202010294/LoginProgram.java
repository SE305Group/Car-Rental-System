import java.util.ArrayList;
import java.util.Scanner;

public class LoginProgram {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample user data
        users.add(new User("abdulla", "password1"));
        users.add(new User("yusuf", "password2"));
        users.add(new User("ahmed", "password3"));


        // Login
        System.out.println("Login");
        login();
    }

    private static void login() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Check if the user exists
        User foundUser = findUser(username, password);

        if (foundUser != null) {
            System.out.println("Login successful. Welcome, " + foundUser.getUsername() + "!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }
    }

    private static User findUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    private static class User {
        private String username;
        private String password;
        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }
    }
}
