
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test1"); }

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
    java.util.ArrayList<Cars> arraylist_cars16 = booking0.allCars;
    java.util.ArrayList<Cars> arraylist_cars17 = booking0.allCars;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars17);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test2"); }

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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test3"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    booking0.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars4 = booking0.allCars;
    java.util.Scanner scanner5 = booking0.kb;
    // The following exception was thrown during execution in test generation
    try {
    Cars cars7 = booking0.getCarDetails((int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner5);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test4"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    Booking booking2 = new Booking();
    java.util.Scanner scanner3 = null;
    booking2.kb = scanner3;
    java.util.Scanner scanner5 = booking2.kb;
    booking2.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars7 = booking2.allCars;
    Booking booking8 = new Booking();
    java.util.Scanner scanner9 = null;
    booking8.kb = scanner9;
    java.util.Scanner scanner11 = booking8.kb;
    booking8.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars13 = booking8.allCars;
    Booking booking14 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars15 = booking14.allCars;
    java.util.Scanner scanner16 = null;
    booking14.kb = scanner16;
    Cars[] cars_array18 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars19 = new java.util.ArrayList<Cars>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars19, cars_array18);
    booking14.allCars = arraylist_cars19;
    Booking booking22 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars23 = booking22.allCars;
    booking14.allCars = arraylist_cars23;
    booking8.allCars = arraylist_cars23;
    Booking booking26 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars27 = booking26.allCars;
    Booking booking28 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars29 = booking28.allCars;
    java.util.Scanner scanner30 = null;
    booking28.kb = scanner30;
    Cars[] cars_array32 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars33 = new java.util.ArrayList<Cars>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars33, cars_array32);
    booking28.allCars = arraylist_cars33;
    java.util.Scanner scanner36 = null;
    booking28.kb = scanner36;
    java.util.ArrayList<Cars> arraylist_cars38 = booking28.allCars;
    booking26.allCars = arraylist_cars38;
    java.util.Scanner scanner40 = booking26.kb;
    booking8.kb = scanner40;
    booking2.kb = scanner40;
    booking0.kb = scanner40;
    java.util.Scanner scanner44 = booking0.kb;
    Booking booking45 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars46 = booking45.allCars;
    java.util.Scanner scanner47 = null;
    booking45.kb = scanner47;
    Cars[] cars_array49 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars50 = new java.util.ArrayList<Cars>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars50, cars_array49);
    booking45.allCars = arraylist_cars50;
    java.util.Scanner scanner53 = null;
    booking45.kb = scanner53;
    java.util.ArrayList<Cars> arraylist_cars55 = booking45.allCars;
    booking0.allCars = arraylist_cars55;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars55);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15.test5"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    // The following exception was thrown during execution in test generation
    try {
    Cars cars3 = booking0.getCarDetails((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);

  }

}
