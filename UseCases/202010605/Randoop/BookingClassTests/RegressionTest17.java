
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test1"); }

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
    Booking booking11 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars12 = booking11.allCars;
    java.util.Scanner scanner13 = null;
    booking11.kb = scanner13;
    Cars[] cars_array15 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars16 = new java.util.ArrayList<Cars>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars16, cars_array15);
    booking11.allCars = arraylist_cars16;
    java.util.Scanner scanner19 = null;
    booking11.kb = scanner19;
    java.util.ArrayList<Cars> arraylist_cars21 = booking11.allCars;
    booking9.allCars = arraylist_cars21;
    java.util.Scanner scanner23 = booking9.kb;
    booking0.kb = scanner23;
    
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
    org.junit.Assert.assertNotNull(arraylist_cars21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner23);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test2"); }

    Booking booking0 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars1 = booking0.allCars;
    java.util.Scanner scanner2 = null;
    booking0.kb = scanner2;
    booking0.goToPayment();
    Cars cars5 = null;
    // The following exception was thrown during execution in test generation
    try {
    booking0.bookCar(cars5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test3"); }

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
    booking9.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars33 = booking9.allCars;
    Booking booking34 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars35 = booking34.allCars;
    java.util.Scanner scanner36 = null;
    booking34.kb = scanner36;
    Cars[] cars_array38 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars39 = new java.util.ArrayList<Cars>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars39, cars_array38);
    booking34.allCars = arraylist_cars39;
    java.util.Scanner scanner42 = null;
    booking34.kb = scanner42;
    java.util.ArrayList<Cars> arraylist_cars44 = booking34.allCars;
    java.util.ArrayList<Cars> arraylist_cars45 = booking34.allCars;
    booking9.allCars = arraylist_cars45;
    Booking booking47 = new Booking();
    java.util.Scanner scanner48 = null;
    booking47.kb = scanner48;
    java.util.Scanner scanner50 = booking47.kb;
    booking47.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars52 = booking47.allCars;
    Booking booking53 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars54 = booking53.allCars;
    java.util.Scanner scanner55 = null;
    booking53.kb = scanner55;
    Cars[] cars_array57 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars58 = new java.util.ArrayList<Cars>();
    boolean b59 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars58, cars_array57);
    booking53.allCars = arraylist_cars58;
    Booking booking61 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars62 = booking61.allCars;
    booking53.allCars = arraylist_cars62;
    booking47.allCars = arraylist_cars62;
    Booking booking65 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars66 = booking65.allCars;
    Booking booking67 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars68 = booking67.allCars;
    java.util.Scanner scanner69 = null;
    booking67.kb = scanner69;
    Cars[] cars_array71 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars72 = new java.util.ArrayList<Cars>();
    boolean b73 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars72, cars_array71);
    booking67.allCars = arraylist_cars72;
    java.util.Scanner scanner75 = null;
    booking67.kb = scanner75;
    java.util.ArrayList<Cars> arraylist_cars77 = booking67.allCars;
    booking65.allCars = arraylist_cars77;
    java.util.Scanner scanner79 = booking65.kb;
    booking47.kb = scanner79;
    booking9.kb = scanner79;
    booking0.kb = scanner79;
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner79);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test4"); }

    Booking booking0 = new Booking();
    java.util.Scanner scanner1 = null;
    booking0.kb = scanner1;
    java.util.Scanner scanner3 = booking0.kb;
    booking0.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars5 = booking0.allCars;
    Booking booking6 = new Booking();
    java.util.Scanner scanner7 = null;
    booking6.kb = scanner7;
    java.util.Scanner scanner9 = booking6.kb;
    booking6.goToPayment();
    java.util.ArrayList<Cars> arraylist_cars11 = booking6.allCars;
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
    booking6.allCars = arraylist_cars21;
    Booking booking24 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars25 = booking24.allCars;
    Booking booking26 = new Booking();
    java.util.ArrayList<Cars> arraylist_cars27 = booking26.allCars;
    java.util.Scanner scanner28 = null;
    booking26.kb = scanner28;
    Cars[] cars_array30 = new Cars[] {  };
    java.util.ArrayList<Cars> arraylist_cars31 = new java.util.ArrayList<Cars>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<Cars>)arraylist_cars31, cars_array30);
    booking26.allCars = arraylist_cars31;
    java.util.Scanner scanner34 = null;
    booking26.kb = scanner34;
    java.util.ArrayList<Cars> arraylist_cars36 = booking26.allCars;
    booking24.allCars = arraylist_cars36;
    java.util.Scanner scanner38 = booking24.kb;
    booking6.kb = scanner38;
    booking0.kb = scanner38;
    booking0.goToPayment();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(scanner9);
    
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
    org.junit.Assert.assertNotNull(arraylist_cars25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cars_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(arraylist_cars36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(scanner38);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17.test5"); }

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
    booking0.goToPayment();
    // The following exception was thrown during execution in test generation
    try {
    int i13 = booking0.getCarNumber();
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

}
