
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10.test1"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    Cars[] cars_array4 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars5 = new java.util.ArrayList<Cars>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars5, cars_array4);
    booking0.allCars = arraylist_cars5;
    booking0.goToPayment();
    Booking booking9 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars10 = booking9.allCars;
    java.util.Scanner scanner11 = null;
    booking9.kb = scanner11;
    Cars[] cars_array13 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars14 = new java.util.ArrayList<Cars>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars14, cars_array13);
    booking9.allCars = arraylist_cars14;
    java.util.Scanner scanner17 = null;
    booking9.kb = scanner17;
    java.util.ArrayList<Cars> arraylist_cars19 = booking9.allCars;
    Booking booking20 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars21 = booking20.allCars;
    java.util.Scanner scanner22 = null;
    booking20.kb = scanner22;
    Cars[] cars_array24 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars25 = new java.util.ArrayList<Cars>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars25, cars_array24);
    booking20.allCars = arraylist_cars25;
    Booking booking28 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars29 = booking28.allCars;
    booking20.allCars = arraylist_cars29;
    booking9.allCars = arraylist_cars29;
    booking0.allCars = arraylist_cars29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars29);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10.test2"); }

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
    java.util.ArrayList<Cars> arraylist_cars10 = booking0.allCars;
    Booking booking11 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars12 = booking11.allCars;
    java.util.Scanner scanner13 = null;
    booking11.kb = scanner13;
    Cars[] cars_array15 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars16 = new java.util.ArrayList<Cars>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars16, cars_array15);
    booking11.allCars = arraylist_cars16;
    Booking booking19 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars20 = booking19.allCars;
    booking11.allCars = arraylist_cars20;
    booking0.allCars = arraylist_cars20;
    booking0.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars24 = booking0.allCars;
    java.util.ArrayList<Cars> arraylist_cars25 = booking0.allCars;
    // The following exception was thrown during execution in test generation
    try {
    booking0.confirmBooking();
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
    org.junit.Assert.assertNotNull(arraylist_cars10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars25);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10.test3"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    Cars[] cars_array4 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars5 = new java.util.ArrayList<Cars>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars5, cars_array4);
    booking0.allCars = arraylist_cars5;
    booking0.goToPayment();
    // The following exception was thrown during execution in test generation
    try {
    booking0.displayCars();
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

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10.test4"); }

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
    // The following exception was thrown during execution in test generation
    try {
    booking0.displayCars();
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10.test5"); }

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
    // The following exception was thrown during execution in test generation
    try {
    int i14 = booking0.getCarNumber();
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

}
