
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test1"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    // The following exception was thrown during execution in test generation
    try {
    booking0.displayCars();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test2"); }

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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars25);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test3"); }

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
    Booking booking22 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars23 = booking22.allCars;
    Booking booking24 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars25 = booking24.allCars;
    java.util.Scanner scanner26 = null;
    booking24.kb = scanner26;
    Cars[] cars_array28 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars29 = new java.util.ArrayList<Cars>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars29, cars_array28);
    booking24.allCars = arraylist_cars29;
    java.util.Scanner scanner32 = null;
    booking24.kb = scanner32;
    java.util.ArrayList<Cars> arraylist_cars34 = booking24.allCars;
    booking22.allCars = arraylist_cars34;
    java.util.Scanner scanner36 = booking22.kb;
    booking4.kb = scanner36;
    booking0.kb = scanner36;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner36);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test4"); }

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
    // The following exception was thrown during execution in test generation
    try {
    Cars cars28 = booking0.getCarDetails((int)' ');
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars25);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14.test5"); }

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
    Booking booking19 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars20 = booking19.allCars;
    Booking booking21 = new Booking();
    java.util.Scanner scanner22 = null;
    booking21.kb = scanner22;
    java.util.Scanner scanner24 = booking21.kb;
    booking21.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars26 = booking21.allCars;
    Booking booking27 = new Booking();
    java.util.Scanner scanner28 = null;
    booking27.kb = scanner28;
    java.util.Scanner scanner30 = booking27.kb;
    booking27.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars32 = booking27.allCars;
    Booking booking33 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars34 = booking33.allCars;
    java.util.Scanner scanner35 = null;
    booking33.kb = scanner35;
    Cars[] cars_array37 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars38 = new java.util.ArrayList<Cars>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars38, cars_array37);
    booking33.allCars = arraylist_cars38;
    Booking booking41 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars42 = booking41.allCars;
    booking33.allCars = arraylist_cars42;
    booking27.allCars = arraylist_cars42;
    Booking booking45 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars46 = booking45.allCars;
    Booking booking47 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars48 = booking47.allCars;
    java.util.Scanner scanner49 = null;
    booking47.kb = scanner49;
    Cars[] cars_array51 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars52 = new java.util.ArrayList<Cars>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars52, cars_array51);
    booking47.allCars = arraylist_cars52;
    java.util.Scanner scanner55 = null;
    booking47.kb = scanner55;
    java.util.ArrayList<Cars> arraylist_cars57 = booking47.allCars;
    booking45.allCars = arraylist_cars57;
    java.util.Scanner scanner59 = booking45.kb;
    booking27.kb = scanner59;
    booking21.kb = scanner59;
    booking19.kb = scanner59;
    java.util.Scanner scanner63 = booking19.kb;
    booking0.kb = scanner63;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner63);

  }

}
