
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test1"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    booking0.goToPayment();
    booking0.goToPayment();
    Booking booking5 = new Booking();
    java.util.Scanner scanner6 = null;
    booking5.kb = scanner6;
    java.util.Scanner scanner8 = booking5.kb;
    booking5.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars10 = booking5.allCars;
    Booking booking11 = new Booking();
    java.util.Scanner scanner12 = null;
    booking11.kb = scanner12;
    java.util.Scanner scanner14 = booking11.kb;
    booking11.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars16 = booking11.allCars;
    Booking booking17 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars18 = booking17.allCars;
    java.util.Scanner scanner19 = null;
    booking17.kb = scanner19;
    Cars[] cars_array21 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars22 = new java.util.ArrayList<Cars>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars22, cars_array21);
    booking17.allCars = arraylist_cars22;
    Booking booking25 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars26 = booking25.allCars;
    booking17.allCars = arraylist_cars26;
    booking11.allCars = arraylist_cars26;
    Booking booking29 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars30 = booking29.allCars;
    Booking booking31 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars32 = booking31.allCars;
    java.util.Scanner scanner33 = null;
    booking31.kb = scanner33;
    Cars[] cars_array35 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars36 = new java.util.ArrayList<Cars>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars36, cars_array35);
    booking31.allCars = arraylist_cars36;
    java.util.Scanner scanner39 = null;
    booking31.kb = scanner39;
    java.util.ArrayList<Cars> arraylist_cars41 = booking31.allCars;
    booking29.allCars = arraylist_cars41;
    java.util.Scanner scanner43 = booking29.kb;
    booking11.kb = scanner43;
    booking5.kb = scanner43;
    booking0.kb = scanner43;
    java.util.Scanner scanner47 = booking0.kb;
    java.util.Scanner scanner48 = booking0.kb;
    java.util.ArrayList<Cars> arraylist_cars49 = booking0.allCars;
    booking0.goToPayment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars49);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test2"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    booking0.goToPayment();
    Booking booking5 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars6 = booking5.allCars;
    java.util.Scanner scanner7 = null;
    booking5.kb = scanner7;
    Cars[] cars_array9 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars10 = new java.util.ArrayList<Cars>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars10, cars_array9);
    booking5.allCars = arraylist_cars10;
    booking0.allCars = arraylist_cars10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test3"); }

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
    booking0.goToPayment();
    Booking booking17 = new Booking();
    java.util.Scanner scanner18 = null;
    booking17.kb = scanner18;
    java.util.Scanner scanner20 = booking17.kb;
    booking17.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars22 = booking17.allCars;
    Booking booking23 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars24 = booking23.allCars;
    java.util.Scanner scanner25 = null;
    booking23.kb = scanner25;
    Cars[] cars_array27 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars28 = new java.util.ArrayList<Cars>();
    boolean b29 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars28, cars_array27);
    booking23.allCars = arraylist_cars28;
    Booking booking31 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars32 = booking31.allCars;
    booking23.allCars = arraylist_cars32;
    booking17.allCars = arraylist_cars32;
    Booking booking35 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars36 = booking35.allCars;
    Booking booking37 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars38 = booking37.allCars;
    java.util.Scanner scanner39 = null;
    booking37.kb = scanner39;
    Cars[] cars_array41 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars42 = new java.util.ArrayList<Cars>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars42, cars_array41);
    booking37.allCars = arraylist_cars42;
    java.util.Scanner scanner45 = null;
    booking37.kb = scanner45;
    java.util.ArrayList<Cars> arraylist_cars47 = booking37.allCars;
    booking35.allCars = arraylist_cars47;
    java.util.Scanner scanner49 = booking35.kb;
    booking17.kb = scanner49;
    booking0.kb = scanner49;
    
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
    org.junit.Assert.assertNull(scanner20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner49);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test4"); }

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
    java.util.ArrayList<Cars> arraylist_cars12 = booking0.allCars;
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars12);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19.test5"); }

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
    Booking booking23 = new Booking();
    java.util.Scanner scanner24 = null;
    booking23.kb = scanner24;
    booking23.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars27 = booking23.allCars;
    java.util.ArrayList<Cars> arraylist_cars28 = booking23.allCars;
    java.util.ArrayList<Cars> arraylist_cars29 = booking23.allCars;
    booking0.allCars = arraylist_cars29;
    
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
    org.junit.Assert.assertNotNull(arraylist_cars27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars29);

  }

}
