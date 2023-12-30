
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test1"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    Cars[] cars_array4 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars5 = new java.util.ArrayList<Cars>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars5, cars_array4);
    booking0.allCars = arraylist_cars5;
    java.util.Scanner scanner8 = null;
    booking0.kb = scanner8;
    java.util.Scanner scanner10 = null;
    booking0.kb = scanner10;
    java.util.Scanner scanner12 = booking0.kb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner12);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test2"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    java.util.Scanner scanner3 = booking0.kb;
    // The following exception was thrown during execution in test generation
    try {
    booking0.confirmBooking();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner3);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test3"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.ArrayList<Cars> arraylist_cars2 = booking0.allCars;
    Booking booking3 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars4 = booking3.allCars;
    java.util.Scanner scanner5 = null;
    booking3.kb = scanner5;
    Cars[] cars_array7 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars8 = new java.util.ArrayList<Cars>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars8, cars_array7);
    booking3.allCars = arraylist_cars8;
    booking3.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars12 = booking3.allCars;
    booking0.allCars = arraylist_cars12;
    java.util.ArrayList<Cars> arraylist_cars14 = booking0.allCars;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars14);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test4"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    Cars[] cars_array4 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars5 = new java.util.ArrayList<Cars>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars5, cars_array4);
    booking0.allCars = arraylist_cars5;
    java.util.Scanner scanner8 = null;
    booking0.kb = scanner8;
    java.util.Scanner scanner10 = booking0.kb;
    java.util.Scanner scanner11 = booking0.kb;
    java.util.Scanner scanner12 = null;
    booking0.kb = scanner12;
    Cars cars14 = null;
    // The following exception was thrown during execution in test generation
    try {
    booking0.bookCar(cars14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner11);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12.test5"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    Cars[] cars_array4 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars5 = new java.util.ArrayList<Cars>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars5, cars_array4);
    booking0.allCars = arraylist_cars5;
    Booking booking8 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars9 = booking8.allCars;
    booking0.allCars = arraylist_cars9;
    booking0.goToPayment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars9);

  }

}
