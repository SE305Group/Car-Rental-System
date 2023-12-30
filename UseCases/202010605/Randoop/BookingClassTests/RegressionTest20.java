
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test1"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.ArrayList<Cars> arraylist_cars2 = booking0.allCars;
    java.util.Scanner scanner3 = booking0.kb;
    Booking booking4 = new Booking();
    java.util.Scanner scanner5 = null;
    booking4.kb = scanner5;
    booking4.goToPayment();
    booking4.goToPayment();
    Booking booking9 = new Booking();
    java.util.Scanner scanner10 = null;
    booking9.kb = scanner10;
    java.util.Scanner scanner12 = booking9.kb;
    booking9.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars14 = booking9.allCars;
    Booking booking15 = new Booking();
    java.util.Scanner scanner16 = null;
    booking15.kb = scanner16;
    java.util.Scanner scanner18 = booking15.kb;
    booking15.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars20 = booking15.allCars;
    Booking booking21 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars22 = booking21.allCars;
    java.util.Scanner scanner23 = null;
    booking21.kb = scanner23;
    Cars[] cars_array25 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars26 = new java.util.ArrayList<Cars>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars26, cars_array25);
    booking21.allCars = arraylist_cars26;
    Booking booking29 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars30 = booking29.allCars;
    booking21.allCars = arraylist_cars30;
    booking15.allCars = arraylist_cars30;
    Booking booking33 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars34 = booking33.allCars;
    Booking booking35 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars36 = booking35.allCars;
    java.util.Scanner scanner37 = null;
    booking35.kb = scanner37;
    Cars[] cars_array39 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars40 = new java.util.ArrayList<Cars>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars40, cars_array39);
    booking35.allCars = arraylist_cars40;
    java.util.Scanner scanner43 = null;
    booking35.kb = scanner43;
    java.util.ArrayList<Cars> arraylist_cars45 = booking35.allCars;
    booking33.allCars = arraylist_cars45;
    java.util.Scanner scanner47 = booking33.kb;
    booking15.kb = scanner47;
    booking9.kb = scanner47;
    booking4.kb = scanner47;
    java.util.Scanner scanner51 = booking4.kb;
    booking0.kb = scanner51;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner51);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test2"); }

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
    java.util.Scanner scanner14 = booking0.kb;
    Booking booking15 = new Booking();
    java.util.Scanner scanner16 = null;
    booking15.kb = scanner16;
    booking15.goToPayment();
    booking15.goToPayment();
    Booking booking20 = new Booking();
    java.util.Scanner scanner21 = null;
    booking20.kb = scanner21;
    java.util.Scanner scanner23 = booking20.kb;
    booking20.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars25 = booking20.allCars;
    Booking booking26 = new Booking();
    java.util.Scanner scanner27 = null;
    booking26.kb = scanner27;
    java.util.Scanner scanner29 = booking26.kb;
    booking26.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars31 = booking26.allCars;
    Booking booking32 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars33 = booking32.allCars;
    java.util.Scanner scanner34 = null;
    booking32.kb = scanner34;
    Cars[] cars_array36 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars37 = new java.util.ArrayList<Cars>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars37, cars_array36);
    booking32.allCars = arraylist_cars37;
    Booking booking40 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars41 = booking40.allCars;
    booking32.allCars = arraylist_cars41;
    booking26.allCars = arraylist_cars41;
    Booking booking44 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars45 = booking44.allCars;
    Booking booking46 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars47 = booking46.allCars;
    java.util.Scanner scanner48 = null;
    booking46.kb = scanner48;
    Cars[] cars_array50 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars51 = new java.util.ArrayList<Cars>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars51, cars_array50);
    booking46.allCars = arraylist_cars51;
    java.util.Scanner scanner54 = null;
    booking46.kb = scanner54;
    java.util.ArrayList<Cars> arraylist_cars56 = booking46.allCars;
    booking44.allCars = arraylist_cars56;
    java.util.Scanner scanner58 = booking44.kb;
    booking26.kb = scanner58;
    booking20.kb = scanner58;
    booking15.kb = scanner58;
    java.util.Scanner scanner62 = booking15.kb;
    java.util.Scanner scanner63 = booking15.kb;
    java.util.ArrayList<Cars> arraylist_cars64 = booking15.allCars;
    booking0.allCars = arraylist_cars64;
    
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
    org.junit.Assert.assertNotNull(scanner14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars64);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20.test3"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    Cars[] cars_array4 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars5 = new java.util.ArrayList<Cars>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars5, cars_array4);
    booking0.allCars = arraylist_cars5;
    booking0.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars9 = booking0.allCars;
    Cars cars10 = null;
    // The following exception was thrown during execution in test generation
    try {
    booking0.bookCar(cars10);
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

  }

}
