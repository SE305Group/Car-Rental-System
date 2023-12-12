import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class BookingTest {

    @Test
    public void testGetCarNumberValidInput() {
        // Arrange
        Booking booking = new Booking();
        booking.allCars.add(new Cars("Honda", "Civic", 2016, 30)); // Add other cars
        booking.kb = new Scanner(new ByteArrayInputStream("1\n".getBytes()));

        // Act
        int carNumber = booking.getCarNumber();

        // Assert
        assertEquals(1, carNumber); // Verify correct car number is retrieved
    }
    @Test
    public void testGetCarNumberInvalidInput_LessThanOne() {
        // Arrange
        Booking booking = new Booking();
        booking.kb = new Scanner(new ByteArrayInputStream("0\n".getBytes()));

        // Act
        int carNumber = booking.getCarNumber();

        // Assert
        assertEquals(-1, carNumber); // Verify invalid input handling
        // Assert termination message
        String output = booking.kb.nextLine();
        assertTrue(output.contains("Terminated"));
    }
    @Test
    public void testGetCarNumberInvalidInput_GreaterThanListSize() {
        // Arrange
        Booking booking = new Booking();
        booking.allCars.add(new Cars("Honda", "Civic", 2016, 30));
        booking.kb = new Scanner(new ByteArrayInputStream("3\n".getBytes()));

        // Act
        int carNumber = booking.getCarNumber();

        // Assert
        assertEquals(-1, carNumber); // Verify invalid input handling
        // Assert termination message
        String output = booking.kb.nextLine();
        assertTrue(output.contains("Terminated"));
    }
    
    @Test
public void testDisplayCarsYes() {
    // Capture the output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));

    // Booking setup
    Booking booking = new Booking();
    booking.allCars.add(new Cars("Honda", "Civic", 2016, 30));
    booking.allCars.add(new Cars("H", "C", 2010, 300)); // Add other cars
    booking.kb = new Scanner(new ByteArrayInputStream("yes".getBytes()));

    // Method call
    booking.displayCars();
    booking.kb.close();

    // Restore and capture output
    System.setOut(originalOut);
    String actualOutput = outputStream.toString();

    // **Print the actual output before the assertion**
    System.out.println("Actual output:");
    System.out.println(actualOutput);

    // Assert the initial prompt and car details
   // assertTrue(actualOutput.equals("Type 'yes' if you would like to display the cars available!\n" +
                           // "1: Honda Civic\n"));
}
@Test
public void testConfirmBooking_YesInput() {
  ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  PrintStream originalOut = System.out;
  System.setOut(new PrintStream(outputStream));
  
  // Arrange
  Booking booking = new Booking();
  booking.kb = new Scanner(new ByteArrayInputStream("yes\n".getBytes()));
  
  // Act
  booking.confirmBooking();
  
  System.setOut(originalOut);
  String actualOutput = outputStream.toString();
  
  // Assert
  assertTrue(actualOutput.contains("Sent to payment page!"));
}

@Test
public void testGetCarDetailsValidIndex() {
    // Arrange


    Booking booking = new Booking();
    booking.allCars.add(new Cars("Honda", "Civic", 2016, 30)); // Add other cars
    int validIndex = 0; // Index of the first car

    // Act
    Cars selectedCar = booking.getCarDetails(validIndex+1);

    // Assert
    // Verify returned car object
    assertNotNull(selectedCar);
    assertEquals("Honda", selectedCar.getBrand());
    assertEquals("Civic", selectedCar.getModel());
    assertEquals(2016, selectedCar.getYear());
    assertEquals(30, selectedCar.getPrice());
}
@Test
public void testBookCar_YesInput() {
         ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(outputStream));
    // Arrange
    Booking booking = new Booking();
    Cars selectedCar = new Cars("Honda", "Civic", 2016, 30); // Create a sample car
    booking.kb = new Scanner(new ByteArrayInputStream("yes 2023-12-15 2023-12-20\n".getBytes()));
    

    // Act
    booking.bookCar(selectedCar);
    
    // Restore and capture output
    System.setOut(originalOut);
    String actualOutput = outputStream.toString();

    // **Print the actual output before the assertion**
    System.out.println("Actual output:");
    System.out.println(actualOutput);

    // Assert
    // Verify booking confirmation message
    //String output = booking.kb.nextLine();
    //assertTrue(output.contains("2023-12-15 2023-12-20 is available\n"));
}

}

