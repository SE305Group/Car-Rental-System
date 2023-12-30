
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test1"); }

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
    booking0.goToPayment();
    java.util.Scanner scanner27 = booking0.kb;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner27);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test2"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    Booking booking4 = new Booking();
    java.util.Scanner scanner5 = null;
    booking4.kb = scanner5;
    java.util.Scanner scanner7 = booking4.kb;
    booking4.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars9 = booking4.allCars;
    Booking booking10 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars11 = booking10.allCars;
    java.util.Scanner scanner12 = null;
    booking10.kb = scanner12;
    Cars[] cars_array14 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars15 = new java.util.ArrayList<Cars>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars15, cars_array14);
    booking10.allCars = arraylist_cars15;
    Booking booking18 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars19 = booking18.allCars;
    booking10.allCars = arraylist_cars19;
    booking4.allCars = arraylist_cars19;
    booking0.allCars = arraylist_cars19;
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
    org.junit.Assert.assertNull(scanner7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars19);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test3"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    Booking booking2 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars3 = booking2.allCars;
    java.util.Scanner scanner4 = null;
    booking2.kb = scanner4;
    Cars[] cars_array6 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars7 = new java.util.ArrayList<Cars>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars7, cars_array6);
    booking2.allCars = arraylist_cars7;
    java.util.Scanner scanner10 = null;
    booking2.kb = scanner10;
    java.util.ArrayList<Cars> arraylist_cars12 = booking2.allCars;
    booking0.allCars = arraylist_cars12;
    java.util.Scanner scanner14 = null;
    booking0.kb = scanner14;
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
    org.junit.Assert.assertNotNull(arraylist_cars3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars12);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test4"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    // The following exception was thrown during execution in test generation
    try {
    Cars cars5 = booking0.getCarDetails((int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11.test5"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    java.util.Scanner scanner4 = booking0.kb;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner4);

  }

}
