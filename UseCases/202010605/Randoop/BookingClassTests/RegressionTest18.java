
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test1"); }

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
    booking0.goToPayment();
    Booking booking12 = new Booking();
    java.util.Scanner scanner13 = null;
    booking12.kb = scanner13;
    java.util.Scanner scanner15 = booking12.kb;
    booking12.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars17 = booking12.allCars;
    Booking booking18 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars19 = booking18.allCars;
    java.util.Scanner scanner20 = null;
    booking18.kb = scanner20;
    Cars[] cars_array22 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars23 = new java.util.ArrayList<Cars>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars23, cars_array22);
    booking18.allCars = arraylist_cars23;
    Booking booking26 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars27 = booking26.allCars;
    booking18.allCars = arraylist_cars27;
    booking12.allCars = arraylist_cars27;
    java.util.ArrayList<Cars> arraylist_cars30 = booking12.allCars;
    booking0.allCars = arraylist_cars30;
    java.util.Scanner scanner32 = null;
    booking0.kb = scanner32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars30);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test2"); }

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
    // The following exception was thrown during execution in test generation
    try {
    Cars cars12 = booking0.getCarDetails((int)(short)0);
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
    org.junit.Assert.assertNull(scanner10);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test3"); }

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
    booking0.goToPayment();
    
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
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test4"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    java.util.Scanner scanner3 = booking0.kb;
    booking0.goToPayment();
    // The following exception was thrown during execution in test generation
    try {
    int i5 = booking0.getCarNumber();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner3);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18.test5"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.ArrayList<Cars> arraylist_cars2 = booking0.allCars;
    java.util.Scanner scanner3 = booking0.kb;
    java.util.ArrayList<Cars> arraylist_cars4 = booking0.allCars;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars4);

  }

}
