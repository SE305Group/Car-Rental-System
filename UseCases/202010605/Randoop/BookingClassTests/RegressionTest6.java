
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test1"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    java.util.Scanner scanner3 = booking0.kb;
    booking0.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars5 = booking0.allCars;
    Booking booking6 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars7 = booking6.allCars;
    java.util.Scanner scanner8 = null;
    booking6.kb = scanner8;
    Cars[] cars_array10 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars11 = new java.util.ArrayList<Cars>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars11, cars_array10);
    booking6.allCars = arraylist_cars11;
    Booking booking14 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars15 = booking14.allCars;
    booking6.allCars = arraylist_cars15;
    booking0.allCars = arraylist_cars15;
    // The following exception was thrown during execution in test generation
    try {
    booking0.displayCars();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars15);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test2"); }

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
    // The following exception was thrown during execution in test generation
    try {
    booking0.run();
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

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test3"); }

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
    // The following exception was thrown during execution in test generation
    try {
    Cars cars26 = booking0.getCarDetails((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test4"); }

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
    // The following exception was thrown during execution in test generation
    try {
    Cars cars24 = booking0.getCarDetails(100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
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

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test5"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    booking0.goToPayment();
    booking0.goToPayment();
    // The following exception was thrown during execution in test generation
    try {
    booking0.run();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

}
