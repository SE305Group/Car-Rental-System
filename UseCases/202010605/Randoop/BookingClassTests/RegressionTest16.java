
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test1"); }

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
    java.util.ArrayList<Cars> arraylist_cars18 = booking0.allCars;
    // The following exception was thrown during execution in test generation
    try {
    booking0.run();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars18);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test2"); }

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
    Cars cars12 = null;
    // The following exception was thrown during execution in test generation
    try {
    booking0.bookCar(cars12);
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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test3"); }

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
    java.util.ArrayList<Cars> arraylist_cars45 = booking0.allCars;
    
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
    org.junit.Assert.assertNotNull(arraylist_cars45);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test4"); }

    Booking booking0 = new Booking();
    Booking booking1 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars2 = booking1.allCars;
    java.util.Scanner scanner3 = null;
    booking1.kb = scanner3;
    Cars[] cars_array5 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars6 = new java.util.ArrayList<Cars>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars6, cars_array5);
    booking1.allCars = arraylist_cars6;
    java.util.Scanner scanner9 = null;
    booking1.kb = scanner9;
    java.util.ArrayList<Cars> arraylist_cars11 = booking1.allCars;
    Booking booking12 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars13 = booking12.allCars;
    java.util.Scanner scanner14 = null;
    booking12.kb = scanner14;
    Cars[] cars_array16 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars17 = new java.util.ArrayList<Cars>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars17, cars_array16);
    booking12.allCars = arraylist_cars17;
    Booking booking20 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars21 = booking20.allCars;
    booking12.allCars = arraylist_cars21;
    booking1.allCars = arraylist_cars21;
    java.util.Scanner scanner24 = null;
    booking1.kb = scanner24;
    java.util.ArrayList<Cars> arraylist_cars26 = booking1.allCars;
    booking0.allCars = arraylist_cars26;
    booking0.goToPayment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars26);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16.test5"); }

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
    Booking booking25 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars26 = booking25.allCars;
    java.util.ArrayList<Cars> arraylist_cars27 = booking25.allCars;
    java.util.ArrayList<Cars> arraylist_cars28 = booking25.allCars;
    booking0.allCars = arraylist_cars28;
    
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
    org.junit.Assert.assertNotNull(arraylist_cars26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars28);

  }

}
