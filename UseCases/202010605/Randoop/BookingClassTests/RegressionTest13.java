
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test1"); }

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
    java.util.Scanner scanner11 = booking0.kb;
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
    org.junit.Assert.assertNotNull(arraylist_cars9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner11);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test2"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    Booking booking3 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars4 = booking3.allCars;
    Booking booking5 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars6 = booking5.allCars;
    java.util.Scanner scanner7 = null;
    booking5.kb = scanner7;
    Cars[] cars_array9 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars10 = new java.util.ArrayList<Cars>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars10, cars_array9);
    booking5.allCars = arraylist_cars10;
    java.util.Scanner scanner13 = null;
    booking5.kb = scanner13;
    java.util.ArrayList<Cars> arraylist_cars15 = booking5.allCars;
    booking3.allCars = arraylist_cars15;
    java.util.Scanner scanner17 = booking3.kb;
    Booking booking18 = new Booking();
    java.util.Scanner scanner19 = null;
    booking18.kb = scanner19;
    java.util.Scanner scanner21 = booking18.kb;
    booking18.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars23 = booking18.allCars;
    Booking booking24 = new Booking();
    java.util.Scanner scanner25 = null;
    booking24.kb = scanner25;
    java.util.Scanner scanner27 = booking24.kb;
    booking24.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars29 = booking24.allCars;
    Booking booking30 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars31 = booking30.allCars;
    java.util.Scanner scanner32 = null;
    booking30.kb = scanner32;
    Cars[] cars_array34 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars35 = new java.util.ArrayList<Cars>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars35, cars_array34);
    booking30.allCars = arraylist_cars35;
    Booking booking38 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars39 = booking38.allCars;
    booking30.allCars = arraylist_cars39;
    booking24.allCars = arraylist_cars39;
    Booking booking42 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars43 = booking42.allCars;
    Booking booking44 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars45 = booking44.allCars;
    java.util.Scanner scanner46 = null;
    booking44.kb = scanner46;
    Cars[] cars_array48 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars49 = new java.util.ArrayList<Cars>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars49, cars_array48);
    booking44.allCars = arraylist_cars49;
    java.util.Scanner scanner52 = null;
    booking44.kb = scanner52;
    java.util.ArrayList<Cars> arraylist_cars54 = booking44.allCars;
    booking42.allCars = arraylist_cars54;
    java.util.Scanner scanner56 = booking42.kb;
    booking24.kb = scanner56;
    booking18.kb = scanner56;
    booking3.kb = scanner56;
    booking0.kb = scanner56;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner56);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test3"); }

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
    java.util.Scanner scanner14 = booking0.kb;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner14);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test4"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    java.util.Scanner scanner3 = booking0.kb;
    java.util.Scanner scanner4 = booking0.kb;
    // The following exception was thrown during execution in test generation
    try {
    booking0.confirmBooking();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner4);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13.test5"); }

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
    java.util.Scanner scanner23 = null;
    booking0.kb = scanner23;
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

  }

}
