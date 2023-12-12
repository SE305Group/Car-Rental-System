
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.Test; // Import the Test annotation

public class LoginProgram {

    private static ArrayList<User> users = new ArrayList<>();

    @Test
  public void testLogin() {
        // Add the user to the users list
        users.add(new User("abdulla", "password1"));

        // Login logic
        String enteredUsername = "abdulla";
        String enteredPassword = "password1";

        User foundUser = findUser(enteredUsername, enteredPassword);

        // Assert that the returned user is the expected user,
        // or null if the user does not exist
        assertSame(users.get(0), foundUser);
    }
    
    private static User findUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
    
        // Exit the loop if the user is not found
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
