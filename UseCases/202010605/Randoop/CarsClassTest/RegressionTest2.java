
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null null 0 0"+ "'", str10.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "null", (int)(short)0, 10);
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100", " hi! null null 0 0 52 1 -1 0", 0, (int)(short)10);
    java.lang.String str16 = carTest_instance0.toString();
    int i17 = carTest_instance0.getPrice();
    java.lang.String str18 = carTest_instance0.getBrand();
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10"+ "'", str16.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100"+ "'", str18.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless", (int)(byte)100, (int)(short)1);
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "hi! hi! 52 0 null null 0 0 1 10", (int)(short)-1, (int)' ');
    int i22 = carTest_instance0.getPrice();
    java.lang.String str23 = carTest_instance0.getBrand();
    java.lang.String str24 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str23.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str24.equals("hi! hi! 52 0 null null 0 0 1 10"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null", 1970, 52);
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 35 0", "hi! hi! 97 97 brandless null 1970 0 0 97", (-1), (int)(short)-1);
    carTest_instance0.Cars();
    java.lang.String str23 = carTest_instance0.getModel();
    carTest_instance0.Cars("", "hi! hi! 52 0 null null 0 0 1 10  null null 0 0 null null 0 0 100 52 0 35 97 10", 52, 52);
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 0 100", "", (int)'4', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null"+ "'", str23.equals("null"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless", " hi! 0 0", (int)(byte)1, (int)(short)-1);
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", " hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0", 35, (int)'4');
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 hi! null null 0 0 52 1 10 100", "null null 0 0", 100, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    java.lang.String str5 = carTest_instance0.getModel();
    carTest_instance0.Cars("null", " hi! 0 100", (-1), 100);
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52 0 35 brandless  hi! null null 0 0 52 1 -1 0 35 0 100 35", "", (int)(byte)-1, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " hi! 0 100"+ "'", str12.equals(" hi! 0 100"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.toString();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! hi! 97 97"+ "'", str8.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi! hi! 97 97"+ "'", str9.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", " hi! 0 0", (int)(short)100, 10);
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0 hi! hi! 97 97 1 10", "brandless null null 0 0 0 35", 10, 1970);
    java.lang.String str19 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str12.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null null 0 0 hi! hi! 97 97 1 10 brandless null null 0 0 0 35 10 1970"+ "'", str19.equals("null null 0 0 hi! hi! 97 97 1 10 brandless null null 0 0 0 35 10 1970"));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null null 0 0 0 -1", "brandless  hi! 0 0 97 -1", 0, 35);
    int i19 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", "null  hi! 0 100 -1 100 brandless hi! 97 0 0 0", 100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.toString();
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10", " hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52", (int)'4', (int)' ');
    java.lang.String str17 = carTest_instance0.toString();
    int i18 = carTest_instance0.getYear();
    java.lang.String str19 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 52 32"+ "'", str17.equals("hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 52 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52"+ "'", str19.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null"+ "'", str17.equals("null"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", (int)(byte)0, 35);
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    int i5 = carTest_instance0.getPrice();
    int i6 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", 0, (int)(short)1);
    int i17 = carTest_instance0.getPrice();
    java.lang.String str18 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"+ "'", str18.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0", (int)(short)0, (int)(byte)-1);
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0", "brandless null 1970 0 null null 0 0 -1 100", 0, 1970);
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getModel();
    java.lang.String str18 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970"+ "'", str15.equals(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " hi! 0 0"+ "'", str16.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str17.equals("brandless null 1970 0 null null 0 0 -1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str18.equals("brandless null 1970 0 null null 0 0 -1 100"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0", "hi! hi! 52 0 null null 0 0 1 10", 10, 100);
    int i20 = carTest_instance0.getPrice();
    int i21 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str23 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "brandless null 1970 0"+ "'", str23.equals("brandless null 1970 0"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("", "hi! null null 0 0 52 1", (int)(byte)-1, 0);
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0 hi! hi! 52 0 1970 52", "brandless  hi! null null 0 0 52 1 -1 0 35 0  hi! 0 100 97 10", 100, (int)(short)0);
    java.lang.String str13 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0 hi! hi! 52 0 1970 52 brandless  hi! null null 0 0 52 1 -1 0 35 0  hi! 0 100 97 10 100 0"+ "'", str13.equals("null null 0 0 hi! hi! 52 0 1970 52 brandless  hi! null null 0 0 52 1 -1 0 35 0  hi! 0 100 97 10 100 0"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i7 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "", (int)(short)-1, (int)(byte)-1);
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 brandless null null 0 0 0 35 97 100", "hi! hi! 52 0 null null 0 0 1 10  0 52", (int)(byte)0, (-1));
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "brandless null 1970 0"+ "'", str3.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10  -1 -1"+ "'", str11.equals("hi! hi! 52 0 null null 0 0 1 10  -1 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", " hi! 0 0", (int)(short)100, 10);
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97", "null null 0 0 null null 0 0 100 52 null  hi! 0 100 -1 100 100 35", (int)(byte)-1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"+ "'", str12.equals("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str15.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    int i6 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 52 0", "null null 0 0", 1, 10);
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", " hi! null null 0 0 52 1 -1 0", (int)(byte)0, (int)(byte)10);
    java.lang.String str22 = carTest_instance0.toString();
    carTest_instance0.Cars(" hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0", "brandless null 1970 0 null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35 97 10", (int)(short)-1, (int)(byte)1);
    java.lang.String str28 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "  hi! null null 0 0 52 1 -1 0 0 10"+ "'", str22.equals("  hi! null null 0 0 52 1 -1 0 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + " hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 brandless null 1970 0 null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35 97 10 -1 1"+ "'", str28.equals(" hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 brandless null 1970 0 null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35 97 10 -1 1"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "brandless null 1970 0", 1970, (int)(byte)100);
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str14.equals("hi! hi! 52 0 null null 0 0 1 10"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test029"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100", " hi! null null 0 0 52 1 -1 0", (int)(byte)1, (int)(short)100);
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.toString();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100  hi! null null 0 0 52 1 -1 0 1 100"+ "'", str11.equals("brandless null 1970 0 null null 0 0 -1 100  hi! null null 0 0 52 1 -1 0 1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0 null 1970 52 hi! null null 0 0 52 1 brandless 32 0 10 1970", "hi! null null 0 0 52 1 brandless 32 0", 1, 1);
    java.lang.String str20 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " hi! 0 0"+ "'", str12.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null 1970 0 null 1970 52 hi! null null 0 0 52 1 brandless 32 0 10 1970 hi! null null 0 0 52 1 brandless 32 0 1 1"+ "'", str20.equals("brandless null 1970 0 null 1970 52 hi! null null 0 0 52 1 brandless 32 0 10 1970 hi! null null 0 0 52 1 brandless 32 0 1 1"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "", (int)'#', 0);
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars("null  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 10 10", " hi! 35 0 hi! hi! 52 0 10 0  brandless hi! 97 0 35 0 10 35", 35, (int)(byte)10);
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 35);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "null null 0 0 null null 0 0 100 52", (int)(short)10, (-1));
    int i17 = carTest_instance0.getPrice();
    java.lang.String str18 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 52", " null null 0 0 null null 0 0 100 52 0 35  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 32 97  0 1", 1970, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str18.equals(" hi! null null 0 0 52 1 -1 0"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getPrice();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless"+ "'", str14.equals("brandless"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", 100, (int)'4');
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 52 0 brandless 1 0", "brandless null 1970 0 null null 0 0 -1 100 hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1 -1 1", (int)(byte)100, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str11.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str13.equals("null null 0 0 null null 0 0 100 52"));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 null -1 1", "null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35", (int)(byte)1, (int)'4');
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100   10 1970 0 100", "hi! hi! 97 97 hi! null null 0 0 52 1 0 32  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 0 10", (int)(short)-1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 0 10 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100 35 1", "hi! hi! hi! 97 97 0 0", (int)'#', 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0", " hi! 35 0", (int)(byte)100, (int)(short)100);
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 52 0  hi! 35 0 100 100"+ "'", str10.equals("hi! hi! 52 0  hi! 35 0 100 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " hi! 35 0"+ "'", str11.equals(" hi! 35 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + " brandless null 1970 0 97 0"+ "'", str8.equals(" brandless null 1970 0 97 0"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, (int)'#');
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null null 0 0"+ "'", str16.equals("null null 0 0"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "null", (int)'a', (-1));
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.toString();
    java.lang.String str18 = carTest_instance0.getModel();
    java.lang.String str19 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str15.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! null null 0 0 52 1 -1 0 null 97 -1"+ "'", str17.equals(" hi! null null 0 0 52 1 -1 0 null 97 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null"+ "'", str18.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null"+ "'", str19.equals("null"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1", "brandless", (int)' ', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.toString();
    java.lang.String str15 = carTest_instance0.getModel();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0"+ "'", str14.equals("hi! null null 0 0 52 1 brandless 32 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", "hi! null null 0 0 52 1 brandless 32 0", (int)(byte)0, (int)(short)100);
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    int i17 = carTest_instance0.getPrice();
    int i18 = carTest_instance0.getPrice();
    java.lang.String str19 = carTest_instance0.getModel();
    java.lang.String str20 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100"+ "'", str16.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0"+ "'", str19.equals("hi! null null 0 0 52 1 brandless 32 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100"+ "'", str20.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", "hi! null null 0 0 52 1 brandless 32 0", (int)(byte)0, (int)(short)100);
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getModel();
    int i18 = carTest_instance0.getYear();
    int i19 = carTest_instance0.getYear();
    java.lang.String str20 = carTest_instance0.toString();
    java.lang.String str21 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"+ "'", str16.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0"+ "'", str17.equals("hi! null null 0 0 52 1 brandless 32 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100"+ "'", str20.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0"+ "'", str21.equals("hi! null null 0 0 52 1 brandless 32 0"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97 brandless null 1970 0 0 97", "null", (int)(short)-1, (int)(short)-1);
    java.lang.String str17 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null"+ "'", str17.equals("null"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", " hi! 0 0", 97, (-1));
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.toString();
    java.lang.String str18 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! 0 0"+ "'", str14.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless  hi! 0 0 97 -1"+ "'", str17.equals("brandless  hi! 0 0 97 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless  hi! 0 0 97 -1"+ "'", str18.equals("brandless  hi! 0 0 97 -1"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", "hi! null null 0 0 52 1", 52, 97);
    java.lang.String str9 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", " hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10", 97, 52);
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.toString();
    int i17 = carTest_instance0.getYear();
    java.lang.String str18 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "brandless"+ "'", str3.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"+ "'", str9.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35", " null null 0 0 null null 0 0 100 52 0 35", 0, 100);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless", (int)(byte)100, (int)(short)1);
    int i12 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100", "brandless null 1970 0 null null 0 0 -1 100", (int)'a', (int)(byte)10);
    int i18 = carTest_instance0.getPrice();
    java.lang.String str19 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100 brandless null 1970 0 null null 0 0 -1 100 97 10"+ "'", str19.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100 brandless null 1970 0 null null 0 0 -1 100 97 10"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! null null 0 0 52 1"+ "'", str8.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", (int)(byte)0, 35);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars("brandless hi! 97 0", "hi! hi! 52 0 null null 0 0 1 10  -1 -1", 0, (int)(byte)1);
    carTest_instance0.Cars("brandless hi! 97 0 hi! null null 0 0 52 1 35 97  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 52 1 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 100 35", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970", (int)(byte)0, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless null 1970 0 null null 0 0 -1 100 null 97 10 null null 0 0 hi! hi! 97 97 1 10 0 0", (int)(short)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", 100, (int)(byte)-1);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0 brandless -1 1 brandless null 1970 0 null 1970 52 1 32", "hi! hi! 52 0 null null 0 0 1 10  -1 -1  hi! null null 0 0 52 1 -1 0 97 0", 35, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    int i15 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless hi! 32 1970", " hi! 35 0  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 10 10", (int)' ', (int)' ');
    java.lang.String str21 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "brandless hi! 32 1970  hi! 35 0  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 10 10 32 32"+ "'", str21.equals("brandless hi! 32 1970  hi! 35 0  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 10 10 32 32"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0", "hi! null null 0 0 52 1", 1, (int)(short)100);
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i18 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 null  hi! 0 0 0 -1 97 32", "brandless null 0 10 hi! hi! 52 0 100 -1  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52 10 10", (int)(byte)1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.toString();
    carTest_instance0.Cars(" hi! 0 0  hi! 0 0 1 0", " null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52  0 10", 52, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 97 97"+ "'", str11.equals("hi! hi! 97 97"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", 100, (int)(byte)-1);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i14 = carTest_instance0.getPrice();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", (int)(short)1, (int)(short)100);
    java.lang.String str19 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, (int)'#');
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.toString();
    java.lang.String str18 = carTest_instance0.getModel();
    int i19 = carTest_instance0.getPrice();
    int i20 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null null 0 0 0 35"+ "'", str15.equals("brandless null null 0 0 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null null 0 0 0 35"+ "'", str17.equals("brandless null null 0 0 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null null 0 0"+ "'", str18.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.getBrand();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str14 = carTest_instance0.toString();
    java.lang.String str15 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 1970 0"+ "'", str14.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 0 1970", "brandless null 0 10", (int)(short)-1, 1);
    java.lang.String str22 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10  -1 -1", " hi! hi! 52 0 null null 0 0 1 10  -1 -1 52 97 brandless null null 0 0 1970 0 0 -1", (int)(byte)100, (int)(byte)10);
    int i28 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 0 1970 brandless null 0 10 -1 1"+ "'", str22.equals("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 0 1970 brandless null 0 10 -1 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 10);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getYear();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52 0 35  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 32 97", "", 0, (int)(short)1);
    int i12 = carTest_instance0.getYear();
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 32 97  0 1"+ "'", str13.equals(" null null 0 0 null null 0 0 100 52 0 35  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 32 97  0 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 32 97"+ "'", str14.equals(" null null 0 0 null null 0 0 100 52 0 35  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 32 97"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32", "hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100", (int)'4', (int)(byte)10);
    carTest_instance0.Cars("  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1", "hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100 null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32 0 97", 32, 0);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100 null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32 0 97"+ "'", str13.equals("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100 null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32 0 97"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "null", (int)(short)0, 10);
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars(" hi! 0 0", " hi! 0 0", (int)(byte)1, 0);
    java.lang.String str14 = carTest_instance0.getBrand();
    int i15 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", "brandless null null 0 0 1970 0", (int)(short)-1, (int)(short)0);
    int i21 = carTest_instance0.getPrice();
    java.lang.String str22 = carTest_instance0.getBrand();
    int i23 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! 0 0"+ "'", str14.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"+ "'", str22.equals(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i16 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97", "hi! null null 0 0 52 1", 0, (int)' ');
    java.lang.String str15 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str17 = carTest_instance0.getBrand();
    int i18 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi! null null 0 0 52 1"+ "'", str9.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! null null 0 0 52 1"+ "'", str15.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1970);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0", "hi!", 0, (int)(byte)-1);
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("null hi! hi! 52 0 -1 1 null 97 32", " null null 0 0 null null 0 0 100 52 0 35  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 32 97", (int)' ', (int)(byte)100);
    carTest_instance0.Cars();
    int i17 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1970);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0", "null null 0 0", 1, 52);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0"+ "'", str13.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getPrice();
    java.lang.String str7 = carTest_instance0.toString();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless null 1970 0"+ "'", str7.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    int i2 = carTest_instance0.getYear();
    java.lang.String str3 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null 52 1", "hi! hi! 52 52  97 32", 52, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.toString();
    int i18 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! 0 0"+ "'", str15.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! 0 0"+ "'", str17.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless null 1970 0"+ "'", str7.equals("brandless null 1970 0"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars("brandless null null 0 0 0 35", "null hi! 0 35", (int)(short)100, 0);
    java.lang.String str20 = carTest_instance0.toString();
    int i21 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null null 0 0 0 35 null hi! 0 35 100 0"+ "'", str20.equals("brandless null null 0 0 0 35 null hi! 0 35 100 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("", "hi! null null 0 0 52 1", (int)(byte)-1, 0);
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0 null null 0 0 100 52", (int)(byte)100, 35);
    carTest_instance0.Cars("", "hi!", 35, 0);
    int i26 = carTest_instance0.getYear();
    java.lang.String str27 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str15.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless  hi! 0 0 1 -1", " null null 0 0 null null 0 0 100 52 0 35 brandless null 1970 0 10 35", (int)(byte)10, (int)(byte)-1);
    carTest_instance0.Cars();
    int i20 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0"+ "'", str11.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1970);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("", "hi! null null 0 0 52 1", (int)(byte)-1, 0);
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0 null null 0 0 100 52", (int)(byte)100, 35);
    carTest_instance0.Cars("", "hi!", 35, 0);
    java.lang.String str26 = carTest_instance0.getModel();
    java.lang.String str27 = carTest_instance0.getBrand();
    java.lang.String str28 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str15.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100", (int)'4', (int)(short)-1);
    java.lang.String str16 = carTest_instance0.getModel();
    int i17 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100"+ "'", str16.equals(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0  hi! 0 0 -1 10", "brandless null null 0 0 0 -1", (int)(byte)-1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    carTest_instance0.Cars("null", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", (int)(byte)10, (int)(byte)10);
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52 100 0", "null hi! 0 35", (int)(short)100, 52);
    carTest_instance0.Cars();
    java.lang.String str20 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless"+ "'", str20.equals("brandless"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    int i5 = carTest_instance0.getPrice();
    int i6 = carTest_instance0.getPrice();
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100", "brandless null 1970 0 null null 0 0 -1 100 null 97 10", (int)(byte)-1, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97", "brandless null 1970 0", 0, (int)'a');
    carTest_instance0.Cars();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getBrand();
    java.lang.String str19 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless"+ "'", str19.equals("brandless"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 10 10", "brandless null 1970 0", (int)(short)-1, (int)(short)10);
    int i18 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1  32 0", "hi! hi! 97 97", (-1), (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getPrice();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52 null null 0 0 hi! 52 100 52 100  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 0 0", "brandless null 0 10  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 35 -1", 35, 97);
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null null 0 0 null null 0 0 100 52 null null 0 0 hi! 52 100 52 100  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 0 0"+ "'", str15.equals("null null 0 0 null null 0 0 100 52 null null 0 0 hi! 52 100 52 100  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 35);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null null 0 0 0 35  hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 1 -1", " hi! 35 0", (int)'#', 100);
    carTest_instance0.Cars("null hi! 0 35", "null null 0 0", 52, 97);
    java.lang.String str27 = carTest_instance0.getBrand();
    java.lang.String str28 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52"+ "'", str16.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null hi! 0 35"+ "'", str27.equals("null hi! 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "null null 0 0"+ "'", str28.equals("null null 0 0"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0", "null null 0 0", (int)'a', (int)(byte)1);
    int i11 = carTest_instance0.getYear();
    int i12 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1", " brandless hi! 97 0 35 0", 0, 52);
    carTest_instance0.Cars("null null 0 0", "", (int)(byte)1, 10);
    carTest_instance0.Cars();
    java.lang.String str24 = carTest_instance0.getModel();
    java.lang.String str25 = carTest_instance0.getModel();
    int i26 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null"+ "'", str24.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null"+ "'", str25.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 1970, (int)(short)0);
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.getModel();
    int i17 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null null 0 0"+ "'", str15.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null null 0 0"+ "'", str16.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1970);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars("", " hi! hi! 52 0 null null 0 0 1 10 1 0", 0, 35);
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970", "  10 1970", 35, 10);
    int i23 = carTest_instance0.getYear();
    int i24 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 35);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null null 0 0", (-1), (int)(short)100);
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0", "brandless null 1970 0", (int)(byte)0, 35);
    int i18 = carTest_instance0.getPrice();
    int i19 = carTest_instance0.getPrice();
    int i20 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str22 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null 52 1", " hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 brandless null null 0 0 0 -1 32 97  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 brandless null 1970 0 0 97 35 0 97 52", (int)' ', 0);
    int i28 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str12.equals("brandless null 1970 0 null null 0 0 -1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "brandless"+ "'", str22.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 32);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 hi! hi! 52 52 0 1", 1970, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1", "brandless", (int)' ', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1  hi! 35 0 32 1970", 0, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0"+ "'", str14.equals("hi! null null 0 0 52 1 brandless 32 0"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.toString();
    carTest_instance0.Cars("", "hi!", 100, (-1));
    carTest_instance0.Cars(" hi! null null 0 0 52 1 97 0", " hi! 0 0 hi! 1 52  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 10 100", (int)'4', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0", " hi! null null 0 0 52 1 -1 0", 10, (int)(byte)-1);
    int i21 = carTest_instance0.getYear();
    java.lang.String str22 = carTest_instance0.toString();
    java.lang.String str23 = carTest_instance0.getModel();
    java.lang.String str24 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "hi! hi! 97 97", 0, 52);
    int i30 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 brandless null 1970 0 0 35", "", (int)'4', (-1));
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 null  hi! 0 0 0 -1 97 32", "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1", (int)'#', (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"+ "'", str22.equals("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str23.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"+ "'", str24.equals("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 52);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 97 97"+ "'", str12.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1", "hi! hi! 97 97 hi! null null 0 0 52 1 0 32", (int)'4', 0);
    java.lang.String str19 = carTest_instance0.getBrand();
    int i20 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"+ "'", str19.equals("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 52);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0", "brandless null 1970 0 null null 0 0 -1 100 null 97 10", 35, (int)(short)1);
    carTest_instance0.Cars(" brandless hi! 97 0 35 0", "brandless null 0 10", (int)'#', 35);
    int i20 = carTest_instance0.getPrice();
    java.lang.String str21 = carTest_instance0.getBrand();
    java.lang.String str22 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! hi! 97 97"+ "'", str8.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " brandless hi! 97 0 35 0"+ "'", str21.equals(" brandless hi! 97 0 35 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " brandless hi! 97 0 35 0 brandless null 0 10 35 35"+ "'", str22.equals(" brandless hi! 97 0 35 0 brandless null 0 10 35 35"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! hi! 97 97"+ "'", str8.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getPrice();
    int i6 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.toString();
    int i12 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 hi! 52 100", " hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0", (int)(short)10, 1);
    java.lang.String str18 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 97 97"+ "'", str11.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null null 0 0 hi! 52 100  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 10 1"+ "'", str18.equals("null null 0 0 hi! 52 100  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 10 1"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.getModel();
    int i19 = carTest_instance0.getYear();
    int i20 = carTest_instance0.getYear();
    int i21 = carTest_instance0.getPrice();
    int i22 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! 52 0"+ "'", str15.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null"+ "'", str18.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1970);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars("", "brandless", 1, (int)(short)10);
    int i18 = carTest_instance0.getYear();
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getBrand();
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100", " hi! 0 0  hi! 0 0 1 0", 100, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", " hi! 0 0", 97, (-1));
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100", "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10", (int)(byte)100, 1);
    java.lang.String str23 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! 0 0"+ "'", str14.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! 0 0"+ "'", str17.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100 hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10 100 1"+ "'", str23.equals("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100 hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10 100 1"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    carTest_instance0.Cars("", "null null 0 0 null null 0 0 100 52", (int)(short)100, (int)(byte)0);
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", "brandless null 1970 0 null null 0 0 -1 100", 10, 32);
    carTest_instance0.Cars();
    int i17 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 0 52", " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 hi! hi! 97 97 100 32", (int)(short)-1, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1970);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless  hi! 0 0 97 -1", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 10 -1", (int)(short)1, (int)(short)0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "brandless null 1970 0"+ "'", str3.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "brandless null 1970 0", 1970, (int)(byte)100);
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35", "", 0, 35);
    carTest_instance0.Cars(" brandless hi! 97 0 35 0", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 brandless null 1970 0 null null 0 0 -1 100 null 97 10 0 1", 1, 32);
    int i24 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10", " hi! null null 0 0 52 1 -1 0 null 97 -1", 52, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", 100, (int)(byte)-1);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.toString();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0", "brandless", (int)(byte)100, 0);
    int i24 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 97 97"+ "'", str16.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str17.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi! hi! 97 97"+ "'", str18.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 0 10 hi! hi! 52 0 100 -1 null 32 35", "null null 0 0 hi! 52 100  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 10 1", 0, 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0", "hi! hi! 52 52", (int)(byte)100, (int)(byte)100);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars("null null 0 0", "brandless null 1970 0 null null 0 0 -1 100", (int)(byte)1, 32);
    int i19 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 32);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars(" hi! 0 0", " hi! 0 0", (int)(byte)1, 0);
    java.lang.String str14 = carTest_instance0.getBrand();
    int i15 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", "hi!", (int)(byte)0, (int)(byte)10);
    int i21 = carTest_instance0.getYear();
    java.lang.String str22 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i24 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! 0 0"+ "'", str14.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1970);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.toString();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless null 1970 0"+ "'", str7.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0", " hi! 0 0 hi! null null 0 0 52 1 1 100", (int)(byte)-1, (int)'4');
    int i23 = carTest_instance0.getYear();
    int i24 = carTest_instance0.getPrice();
    java.lang.String str25 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! 52 0"+ "'", str15.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! hi! 52 0"+ "'", str17.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100"+ "'", str25.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 32", "brandless null null 0 0 0 -1", 97, (int)(short)-1);
    carTest_instance0.Cars("null null 0 0 hi! 52 100  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 52 -1", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0", 1970, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless  hi! null null 0 0 52 1 -1 0 35 0", "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1", (int)(short)10, (int)(byte)10);
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless null 0 10 hi! hi! 52 0 100 -1", " hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52", (int)(byte)10, 10);
    int i19 = carTest_instance0.getYear();
    java.lang.String str20 = carTest_instance0.toString();
    java.lang.String str21 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0"+ "'", str11.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null 0 10 hi! hi! 52 0 100 -1  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52 10 10"+ "'", str20.equals("brandless null 0 10 hi! hi! 52 0 100 -1  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52 10 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "brandless null 0 10 hi! hi! 52 0 100 -1  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52 10 10"+ "'", str21.equals("brandless null 0 10 hi! hi! 52 0 100 -1  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52 10 10"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "", (int)(short)10, (int)(byte)10);
    int i17 = carTest_instance0.getYear();
    java.lang.String str18 = carTest_instance0.getModel();
    java.lang.String str19 = carTest_instance0.toString();
    int i20 = carTest_instance0.getPrice();
    int i21 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! null null 0 0 52 1 -1 0  10 10"+ "'", str19.equals(" hi! null null 0 0 52 1 -1 0  10 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10", " hi! null null 0 0 52 1 -1 0 null 97 -1", (int)(byte)100, 0);
    java.lang.String str18 = carTest_instance0.toString();
    int i19 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0", "null null 0 0 hi! 52 100", 0, (int)(byte)-1);
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0  hi! 0 100 100 10 brandless null null 0 0 1970 0 0 1", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0  hi! null null 0 0 52 1 -1 0 brandless null 1970 0 null null 0 0 -1 100 null 97 10 52 0 0 52", (int)(byte)100, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0"+ "'", str18.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null", 1970, 52);
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 35 0", "hi! hi! 97 97 brandless null 1970 0 0 97", (-1), (int)(short)-1);
    java.lang.String str22 = carTest_instance0.getModel();
    java.lang.String str23 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str22.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " hi! 35 0 hi! hi! 97 97 brandless null 1970 0 0 97 -1 -1"+ "'", str23.equals(" hi! 35 0 hi! hi! 97 97 brandless null 1970 0 0 97 -1 -1"));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 0 1970", "brandless null 0 10", (int)(short)-1, 1);
    int i22 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null null 0 0 0 -1", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", (int)(byte)100, 1970);
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"+ "'", str11.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "", (int)'#', 0);
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", (int)(short)10, 0);
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", " hi! hi! 97 97 52 0", 35, (-1));
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.toString();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getYear();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.toString();
    java.lang.String str9 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.toString();
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100  1970 32", 1, 52);
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10  hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 100 0", " hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 brandless null 1970 0 0 97 35 0", (int)' ', (int)(short)100);
    int i25 = carTest_instance0.getPrice();
    int i26 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 32);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0", (int)(short)0, (int)(byte)-1);
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null null 0 0 0 -1"+ "'", str9.equals("brandless null null 0 0 0 -1"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless"+ "'", str14.equals("brandless"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null null 0 0", (-1), (int)(short)100);
    carTest_instance0.Cars("null null 0 0", "hi!", 52, 100);
    int i17 = carTest_instance0.getYear();
    java.lang.String str18 = carTest_instance0.getModel();
    java.lang.String str19 = carTest_instance0.toString();
    int i20 = carTest_instance0.getPrice();
    int i21 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null null 0 0 hi! 52 100"+ "'", str19.equals("null null 0 0 hi! 52 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 52);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getPrice();
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    int i12 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0", " hi! 35 0", (int)(byte)100, (int)(short)100);
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 52 0  hi! 35 0 100 100"+ "'", str10.equals("hi! hi! 52 0  hi! 35 0 100 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0"+ "'", str12.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 35 0"+ "'", str13.equals(" hi! 35 0"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", 100, (int)(byte)-1);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars("  hi! hi! 52 0 null null 0 0 1 10 1 0 0 35", " hi! hi! 52 0 null null 0 0 1 10 1 0  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 97 0", (-1), (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi! hi! 52 0 null null 0 0 1 10", (int)(byte)-1, (-1));
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless  hi! 0 0 1 -1 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 35 -1", "brandless null 1970 0 null null 0 0 -1 100  10 10  hi! hi! 52 0 null null 0 0 1 10 1 0 1 1", (int)(byte)10, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    carTest_instance0.Cars("null null 0 0", "brandless", (int)(byte)-1, 1);
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null null 0 0 brandless -1 1"+ "'", str15.equals("null null 0 0 brandless -1 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null null 0 0 brandless -1 1"+ "'", str16.equals("null null 0 0 brandless -1 1"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", 0, (int)(short)1);
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", " hi! 0 0 hi! null null 0 0 52 1 1 100", 1, (int)(byte)-1);
    java.lang.String str22 = carTest_instance0.getModel();
    java.lang.String str23 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100"+ "'", str22.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str23.equals(" hi! null null 0 0 52 1 -1 0"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0", "brandless null 1970 0 null null 0 0 -1 100 null 97 10", 35, (int)(short)1);
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 97 97 hi! hi! 97 97 100 35", "hi! null null 0 0 52 1 brandless 32 0", (int)(short)10, (int)' ');
    java.lang.String str21 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! hi! 97 97"+ "'", str8.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi! hi! 97 97 hi! hi! 97 97 100 35"+ "'", str21.equals("hi! hi! 97 97 hi! hi! 97 97 100 35"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getPrice();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 hi! hi! 52 0 null null 0 0 1 10 1 97", "null null 0 0 null null 0 0 100 52  hi! 35 0 52 0", 0, (int)(short)0);
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0", " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0", (int)(byte)0, 32);
    carTest_instance0.Cars("brandless hi! 97 0  hi! 0 0  hi! 0 0 1 0 10 10", "", (int)(byte)0, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 97 97"+ "'", str12.equals("hi! hi! 97 97"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0"+ "'", str11.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null null 0 0", (-1), (int)(short)100);
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0", "brandless null 1970 0", (int)(byte)0, 35);
    int i18 = carTest_instance0.getPrice();
    int i19 = carTest_instance0.getPrice();
    java.lang.String str20 = carTest_instance0.getBrand();
    int i21 = carTest_instance0.getYear();
    int i22 = carTest_instance0.getYear();
    java.lang.String str23 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1", "", (int)(short)1, 35);
    java.lang.String str29 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0", "null null 0 0 brandless null 1970 0 null null 0 0 -1 100 1 32 hi! hi! 52 52 0 -1", (int)(short)10, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str12.equals("brandless null 1970 0 null null 0 0 -1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null null 0 0"+ "'", str20.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "brandless null 1970 0"+ "'", str23.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! 0 0"+ "'", str14.equals(" hi! 0 0"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless null 1970 0 null 1970 52  hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97 100 32", "hi! hi! 97 97  hi! 0 0 0 0 hi! 10 32", (int)(byte)0, (int)(short)100);
    carTest_instance0.Cars("null hi! hi! 52 0 -1 1", "", 10, 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi! null null 0 0 52 1"+ "'", str9.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.toString();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 35 0 hi! hi! 97 97 brandless null 1970 0 0 97 -1 -1", " brandless 1 10", (int)(short)-1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! null null 0 0 52 1", "", 0, (int)'#');
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0  hi! 0 0 -1 10", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 brandless null 1970 0 null null 0 0 -1 100 null 97 10 0 1", (int)(short)0, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getPrice();
    int i6 = carTest_instance0.getPrice();
    int i7 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "brandless null 1970 0"+ "'", str3.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1", "hi! hi! 52 0", (int)(short)10, (-1));
    java.lang.String str18 = carTest_instance0.getModel();
    java.lang.String str19 = carTest_instance0.toString();
    java.lang.String str20 = carTest_instance0.toString();
    java.lang.String str21 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi! hi! 52 0"+ "'", str18.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1 hi! hi! 52 0 10 -1"+ "'", str19.equals(" brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1 hi! hi! 52 0 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1 hi! hi! 52 0 10 -1"+ "'", str20.equals(" brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1 hi! hi! 52 0 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi! hi! 52 0"+ "'", str21.equals("hi! hi! 52 0"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", 100, (int)'4');
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0"+ "'", str13.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.toString();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0", "null null 0 0", 1, 52);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0"+ "'", str13.equals("null null 0 0"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.getModel();
    int i17 = carTest_instance0.getYear();
    java.lang.String str18 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97", "null null 0 0 brandless null 1970 0 0 35", (int)'a', 35);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 97 97"+ "'", str16.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52"+ "'", str18.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "hi!", (int)'a', (int)(short)0);
    java.lang.String str15 = carTest_instance0.getBrand();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getBrand();
    java.lang.String str19 = carTest_instance0.getModel();
    java.lang.String str20 = carTest_instance0.getBrand();
    int i21 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null 97 -1", " hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0", 10, (int)(byte)10);
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 hi! hi! 52 52 0 1", "brandless hi! hi! 52 0 null null 0 0 1 10 1 52", (int)(byte)100, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless"+ "'", str20.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", (int)(byte)0, 35);
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getYear();
    int i17 = carTest_instance0.getPrice();
    int i18 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0", (int)(short)0, (int)(byte)-1);
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 100 hi! hi! 52 0 -1 10  hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97 hi! null null 0 0 52 1 brandless 32 0 100 32 35 -1", "brandless null 1970 0 null null 0 0 -1 100  hi! 0 100 1970 0", (int)(short)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "", (int)(short)10, (int)(byte)10);
    int i17 = carTest_instance0.getYear();
    java.lang.String str18 = carTest_instance0.getModel();
    java.lang.String str19 = carTest_instance0.toString();
    int i20 = carTest_instance0.getPrice();
    java.lang.String str21 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! null null 0 0 52 1 -1 0  10 10"+ "'", str19.equals(" hi! null null 0 0 52 1 -1 0  10 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str21.equals(" hi! null null 0 0 52 1 -1 0"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getModel();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0 brandless null 1970 0 0 35  hi! 0 0  hi! 0 0 1 0 0 35", "null null 0 0 hi! hi! 52 0 -1 1", (int)(byte)-1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 52 0", (int)(byte)-1, (int)'a');
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! hi! 52 0 null null 0 0 1 10 1 0", "hi! hi! 52 0 null null 0 0 1 52", 97, (int)(short)1);
    int i21 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str23 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str14.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str15.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "brandless"+ "'", str23.equals("brandless"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, (int)'#');
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str20 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null null 0 0 0 35"+ "'", str15.equals("brandless null null 0 0 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null"+ "'", str18.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless"+ "'", str20.equals("brandless"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    carTest_instance0.Cars("null", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", (int)(byte)10, (int)(byte)10);
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless null 0 10", " null null 0 0 null null 0 0 100 52 0 35", (int)(short)10, 97);
    java.lang.String str20 = carTest_instance0.getModel();
    java.lang.String str21 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35"+ "'", str20.equals(" null null 0 0 null null 0 0 100 52 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "brandless null 0 10"+ "'", str21.equals("brandless null 0 10"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null null 0 0 0 -1", "null", (int)(byte)-1, (int)(byte)-1);
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null null 0 0 0 -1"+ "'", str13.equals("brandless null null 0 0 0 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null null 0 0 0 -1"+ "'", str14.equals("brandless null null 0 0 0 -1"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getPrice();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null"+ "'", str17.equals("null"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getModel();
    carTest_instance0.Cars("brandless null null 0 0 0 -1", "hi!", (int)(short)100, (int)' ');
    java.lang.String str24 = carTest_instance0.getModel();
    int i25 = carTest_instance0.getYear();
    int i26 = carTest_instance0.getYear();
    int i27 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 97 97"+ "'", str16.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str17.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi! hi! 97 97"+ "'", str18.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 100);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10", " hi! null null 0 0 52 1 -1 0 null 97 -1", (int)(byte)100, 0);
    java.lang.String str18 = carTest_instance0.getModel();
    java.lang.String str19 = carTest_instance0.getBrand();
    int i20 = carTest_instance0.getPrice();
    int i21 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! null null 0 0 52 1 -1 0 null 97 -1"+ "'", str18.equals(" hi! null null 0 0 52 1 -1 0 null 97 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10"+ "'", str19.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0", (int)(short)0, (int)(byte)-1);
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0", "null null 0 0", 1, 52);
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0", " hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10", 35, (int)(byte)10);
    int i22 = carTest_instance0.getPrice();
    int i23 = carTest_instance0.getYear();
    java.lang.String str24 = carTest_instance0.getModel();
    java.lang.String str25 = carTest_instance0.toString();
    java.lang.String str26 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 52 0"+ "'", str13.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! 52 0 null null 0 0 1 52"+ "'", str15.equals("hi! hi! 52 0 null null 0 0 1 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null null 0 0"+ "'", str16.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10"+ "'", str24.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + " hi! 0 0  hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10 35 10"+ "'", str25.equals(" hi! 0 0  hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10 35 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10"+ "'", str26.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32", "hi! null null 0 0 52 1 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 0 10", (int)(byte)1, (int)'4');
    int i21 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null null 0 0"+ "'", str10.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0", " hi! 35 0", (int)(byte)100, (int)(short)100);
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 52 0  hi! 35 0 100 100"+ "'", str10.equals("hi! hi! 52 0  hi! 35 0 100 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0  hi! 35 0 100 100"+ "'", str12.equals("hi! hi! 52 0  hi! 35 0 100 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 52 0  hi! 35 0 100 100"+ "'", str13.equals("hi! hi! 52 0  hi! 35 0 100 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! hi! 52 0"+ "'", str14.equals("hi! hi! 52 0"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52 null null 0 0 hi! 52 100 52 100", "hi! hi! 97 97  hi! 0 0 0 0 hi! 10 32", (int)' ', 1970);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97 brandless null 1970 0 0 97", "null", (int)(short)-1, (int)(short)-1);
    java.lang.String str17 = carTest_instance0.getBrand();
    int i18 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str17.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0  10 10", "null hi! 1 32", (int)' ', (int)(byte)-1);
    carTest_instance0.Cars("hi! hi! 97 97 brandless null 1970 0 0 97", "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1  32 0", (int)'a', (int)(byte)10);
    java.lang.String str23 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1  32 0"+ "'", str23.equals("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1  32 0"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.toString();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless null 1970 0"+ "'", str7.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52 null null 0 0 hi! 52 100 52 100", " brandless null 1970 0 null null 0 0 -1 100 10 -1", 0, 97);
    carTest_instance0.Cars("brandless null 1970 0", " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10 null  hi! 0 0 0 -1 0 0", (int)(byte)0, (int)(byte)0);
    int i21 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    int i6 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 52 0", "null null 0 0", 1, 10);
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i14 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "hi! null null 0 0 52 1", (int)(byte)-1, 97);
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str7 = carTest_instance0.getModel();
    int i8 = carTest_instance0.getPrice();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! 0 0  hi! 0 0 1 0", " null null 0 0 null null 0 0 100 52 0 35 brandless null 1970 0 10 35", (int)(byte)0, 32);
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 null -1 1", "hi! hi! 52 0 null null 0 0 1 52", 35, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless"+ "'", str14.equals("brandless"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    java.lang.String str4 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 hi! hi! 52 0 null null 0 0 1 10  -1 -1 1 1970", "brandless  hi! 0 0 1 -1", 10, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("", "hi! null null 0 0 52 1", (int)(byte)-1, 0);
    java.lang.String str15 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "null null 0 0 null null 0 0 100 52", 1970, (int)(short)-1);
    java.lang.String str21 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100", " hi! 0 100", 1970, 0);
    int i27 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str29 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 0 10", "null null 0 0 null null 0 0 100 52 null  hi! 0 100 -1 100 100 35", (int)'4', (int)(byte)0);
    java.lang.String str35 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! null null 0 0 52 1"+ "'", str15.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"+ "'", str21.equals(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "null"+ "'", str29.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi! hi! 97 97 hi! null null 0 0 52 1 0 32  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 0 10 null null 0 0 null null 0 0 100 52 null  hi! 0 100 -1 100 100 35 52 0"+ "'", str35.equals("hi! hi! 97 97 hi! null null 0 0 52 1 0 32  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 0 10 null null 0 0 null null 0 0 100 52 null  hi! 0 100 -1 100 100 35 52 0"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0 brandless -1 1", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0", (-1), (int)(byte)-1);
    carTest_instance0.Cars("null null 0 0 hi! hi! 97 97 35 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 97 1 0", "", (-1), 97);
    int i24 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 97 97"+ "'", str12.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 97);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100", " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", 0, (int)' ');
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35", "null null 0 0 null null 0 0 100 52 null null 0 0 hi! 52 100 52 100", (int)(short)10, (-1));
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0"+ "'", str11.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", (int)(byte)0, 35);
    java.lang.String str13 = carTest_instance0.toString();
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 brandless  hi! null null 0 0 52 1 -1 0 35 0 0 -1", " hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 brandless null null 0 0 0 -1 32 97", 97, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null hi! 0 35"+ "'", str13.equals("null hi! 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 brandless null 1970 0 null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35 97 10 -1 1", " brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 1 100", 97, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars("", "brandless hi! 97 0", 1970, 1);
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10", "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  null null 0 0 null null 0 0 100 52 100 0 1 32", 1970, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 null  hi! 0 0 0 -1 -1 100", "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10", 32, (int)(short)-1);
    java.lang.String str19 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"+ "'", str19.equals("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless  hi! null null 0 0 52 1 -1 0 35 0 brandless null 1970 0 null null 0 0 -1 100 35 97", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100 hi! hi! 52 0 null null 0 0 1 52 0 -1", (int)(short)-1, (int)(byte)1);
    carTest_instance0.Cars("brandless null 1970 0", "hi! null null 0 0 52 1 brandless 32 0  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0 100 32", (int)(byte)0, (int)(byte)10);
    int i16 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", "hi! null null 0 0 52 1 brandless 32 0", (int)(byte)0, (int)(short)100);
    carTest_instance0.Cars();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52 null null 0 0 hi! 52 100 52 100  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 0 0", " hi! hi! 97 97 52 0", (int)'#', 1);
    java.lang.String str21 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " hi! hi! 97 97 52 0"+ "'", str21.equals(" hi! hi! 97 97 52 0"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.toString();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless null 1970 0"+ "'", str7.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52 0 35", "hi!", (int)'4', 10);
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35"+ "'", str11.equals(" null null 0 0 null null 0 0 100 52 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35 hi! 52 10"+ "'", str12.equals(" null null 0 0 null null 0 0 100 52 0 35 hi! 52 10"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless", (int)(byte)100, (int)(short)1);
    int i12 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100", "brandless null 1970 0 null null 0 0 -1 100", (int)'a', (int)(byte)10);
    java.lang.String str18 = carTest_instance0.getBrand();
    int i19 = carTest_instance0.getYear();
    int i20 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100"+ "'", str18.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 97);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getYear();
    int i12 = carTest_instance0.getYear();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.toString();
    java.lang.String str17 = carTest_instance0.toString();
    int i18 = carTest_instance0.getPrice();
    java.lang.String str19 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null"+ "'", str19.equals("null"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null null 0 0 hi! hi! 97 97 1 10", "brandless null 0 10", (int)'#', (int)(short)0);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null null 0 0"+ "'", str10.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! null null 0 0 52 1"+ "'", str11.equals("hi! null null 0 0 52 1"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97", "null  hi! 0 0 0 -1", (int)(byte)-1, (int)(byte)100);
    int i24 = carTest_instance0.getYear();
    java.lang.String str25 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str17.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str18.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null  hi! 0 0 0 -1"+ "'", str25.equals("null  hi! 0 0 0 -1"));

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100  -1 32", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 97", (int)(short)1, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, 0);
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 10 10  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 hi! null null 0 0 52 1 10 100 1 10", "hi! hi! 97 97 brandless null 1970 0 0 97 hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 0 -1", 100, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! null null 0 0 52 1 null null 0 0 null null 0 0 100 52 35 10", "brandless  hi! null null 0 0 52 1 -1 0 35 0", (int)(short)100, (int)'a');
    java.lang.String str17 = carTest_instance0.getModel();
    carTest_instance0.Cars("", "", 1970, 35);
    int i23 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 32", (int)(short)-1, 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 100"+ "'", str10.equals(" hi! 0 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless  hi! null null 0 0 52 1 -1 0 35 0"+ "'", str17.equals("brandless  hi! null null 0 0 52 1 -1 0 35 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 35);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    int i17 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str19 = carTest_instance0.getBrand();
    int i20 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 52 0"+ "'", str16.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless"+ "'", str19.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1970);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  35 0", "null null 0 0 hi! hi! 97 97 35 -1", (int)(short)-1, 10);
    int i17 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars("  hi! hi! 52 0 null null 0 0 1 10 1 0 0 35", " hi! null null 0 0 52 1 -1 0  10 10 null hi! 1 32 32 -1", 10, 1);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    int i12 = carTest_instance0.getYear();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi! hi! 52 0 null null 0 0 1 10", (int)(byte)-1, (-1));
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i16 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97", "hi! null null 0 0 52 1", 0, (int)' ');
    java.lang.String str15 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1  32 0", "hi! hi! 52 0 null null 0 0 1 10", (int)(short)-1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi! null null 0 0 52 1"+ "'", str9.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! null null 0 0 52 1"+ "'", str15.equals("hi! null null 0 0 52 1"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0", "brandless null 1970 0 null null 0 0 -1 100 null 97 10", 35, (int)(short)1);
    carTest_instance0.Cars(" brandless hi! 97 0 35 0", "brandless null 0 10", (int)'#', 35);
    int i20 = carTest_instance0.getPrice();
    java.lang.String str21 = carTest_instance0.getModel();
    java.lang.String str22 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! hi! 97 97"+ "'", str8.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "brandless null 0 10"+ "'", str21.equals("brandless null 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " brandless hi! 97 0 35 0 brandless null 0 10 35 35"+ "'", str22.equals(" brandless hi! 97 0 35 0 brandless null 0 10 35 35"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null"+ "'", str18.equals("null"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless null null 0 0 0 35", "null null 0 0 brandless -1 1", 10, (int)(byte)10);
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0 brandless -1 1"+ "'", str13.equals("null null 0 0 brandless -1 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null null 0 0 0 35 null null 0 0 brandless -1 1 10 10"+ "'", str15.equals("brandless null null 0 0 0 35 null null 0 0 brandless -1 1 10 10"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null", "brandless null 1970 0 null null 0 0 -1 100", (int)(byte)100, 1970);
    carTest_instance0.Cars("", " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10", 100, (int)(short)100);
    java.lang.String str23 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str25 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "brandless"+ "'", str25.equals("brandless"));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", 100, (int)(byte)-1);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100", "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10", 32, (int)'#');
    java.lang.String str21 = carTest_instance0.getModel();
    java.lang.String str22 = carTest_instance0.toString();
    java.lang.String str23 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"+ "'", str21.equals("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 35"+ "'", str22.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 35"+ "'", str23.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 35"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 1970, (int)(short)0);
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i19 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null null 0 0"+ "'", str15.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    int i7 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless hi! 97 0", "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1", 35, (int)'a');
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1"+ "'", str14.equals("hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 35);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("", " hi! 0 0 hi! null null 0 0 52 1 1 100", 100, (int)(byte)10);
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 52 0  hi! 35 0 100 100 null null 0 0 brandless null 1970 0 null null 0 0 -1 100 1 32 1 0", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", 10, 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100"+ "'", str13.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null 97 -1", " hi! 0 100 hi! hi! 52 0 -1 10", (int)(short)10, (int)(byte)1);
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100  1970 32", "null null 0 0 brandless -1 1 brandless null 1970 0 null 1970 52 1 32", (int)(byte)-1, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 97 97", "null  hi! 0 100 -1 100", (int)(short)100, (int)'a');
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null  hi! 0 100 -1 100"+ "'", str9.equals("null  hi! 0 100 -1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0", 0, (int)(short)-1);
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10  -1 -1  brandless hi! 97 0 35 0 1970 97", "  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1", 10, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null null 0 0 hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 0 -1"+ "'", str10.equals("null null 0 0 hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 0 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0"+ "'", str11.equals("hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0"+ "'", str13.equals("null null 0 0"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! null 52 1 null hi! 0 35 0 0", " hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0", 0, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi!", "brandless", (-1), 10);
    int i17 = carTest_instance0.getYear();
    carTest_instance0.Cars("null hi! 0 35", "hi! null null 0 0 52 1", (int)'4', (int)(short)-1);
    java.lang.String str23 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null hi! hi! 52 0 -1 1", "brandless  hi! 0 0 1 -1", 0, (int)'#');
    java.lang.String str29 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32", "null  10 0", (int)' ', (int)(short)-1);
    int i35 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null hi! 0 35"+ "'", str23.equals("null hi! 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "null hi! hi! 52 0 -1 1"+ "'", str29.equals("null hi! hi! 52 0 -1 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    int i6 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 52 0", "null null 0 0", 1, 10);
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", " hi! null null 0 0 52 1 -1 0", (int)'#', (int)(byte)0);
    carTest_instance0.Cars();
    java.lang.String str19 = carTest_instance0.toString();
    java.lang.String str20 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless null 1970 0"+ "'", str19.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null 1970 0"+ "'", str20.equals("brandless null 1970 0"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "null", (int)(short)0, 10);
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 0 10"+ "'", str12.equals("brandless null 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 0 10"+ "'", str14.equals("brandless null 0 10"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getYear();
    int i12 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars(" hi! 35 0", "hi! null null 0 0 52 1", (int)(byte)-1, (-1));
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    int i12 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi! null null 0 0 52 1"+ "'", str9.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1", "hi! hi! 52 0", 100, 0);
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"+ "'", str13.equals("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! hi! 52 0"+ "'", str14.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 hi! hi! 52 0 100 0"+ "'", str15.equals("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 hi! hi! 52 0 100 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"+ "'", str16.equals("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.toString();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", 100, (int)'4');
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getYear();
    java.lang.String str13 = carTest_instance0.toString();
    int i14 = carTest_instance0.getPrice();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, (int)'#');
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("", "brandless hi! 97 0 hi! null null 0 0 52 1 35 97 hi! hi! 52 0 null null 0 0 1 52 35 35", (int)(short)0, (int)'4');
    int i15 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! null null 0 0 52 1"+ "'", str8.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100", "hi! null null 0 0 52 1", 1970, 100);
    int i15 = carTest_instance0.getYear();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.getModel();
    java.lang.String str18 = carTest_instance0.getModel();
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! null null 0 0 52 1"+ "'", str17.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi! null null 0 0 52 1"+ "'", str18.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getBrand();
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0"+ "'", str11.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1", "brandless null 1970 0 null null 0 0 -1 100  10 10  hi! hi! 52 0 null null 0 0 1 10 1 0 1 1", 32, 1970);
    java.lang.String str16 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100  10 10  hi! hi! 52 0 null null 0 0 1 10 1 0 1 1"+ "'", str16.equals("brandless null 1970 0 null null 0 0 -1 100  10 10  hi! hi! 52 0 null null 0 0 1 10 1 0 1 1"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 97 97"+ "'", str11.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! hi! 97 97"+ "'", str14.equals("hi! hi! 97 97"));

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("null  hi! 0 0 0 -1", "hi!", 32, (int)(byte)1);
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100", "hi! hi! 52 0 null null 0 0 1 52", (int)(short)0, (int)(byte)-1);
    java.lang.String str26 = carTest_instance0.toString();
    java.lang.String str27 = carTest_instance0.getBrand();
    java.lang.String str28 = carTest_instance0.getBrand();
    java.lang.String str29 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100 hi! hi! 52 0 null null 0 0 1 52 0 -1"+ "'", str26.equals(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100 hi! hi! 52 0 null null 0 0 1 52 0 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100"+ "'", str27.equals(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100"+ "'", str28.equals(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi! hi! 52 0 null null 0 0 1 52"+ "'", str29.equals("hi! hi! 52 0 null null 0 0 1 52"));

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 52 0", (int)(byte)-1, (int)'a');
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str17 = carTest_instance0.toString();
    int i18 = carTest_instance0.getYear();
    java.lang.String str19 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32", "hi! hi! 97 97  hi! 0 0 0 0  hi! 0 100 100 10  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 52", (int)(byte)-1, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str14.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null"+ "'", str19.equals("null"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0  10 10", "null hi! 1 32", (int)' ', (int)(byte)-1);
    carTest_instance0.Cars(" brandless null 1970 0 97 0", " hi! null null 0 0 52 1 brandless 32 0 10 0 null brandless null 1970 0 null null 0 0 -1 100 100 1970 97 0", (int)(byte)-1, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test292"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1", "hi! hi! 52 0", 100, 0);
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars("", "brandless hi! hi! 52 0 null null 0 0 1 10 1 52  52 0", (int)'a', (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"+ "'", str13.equals("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! hi! 52 0"+ "'", str14.equals("hi! hi! 52 0"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi!", "brandless", (-1), 10);
    int i17 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null 1970 0 hi! hi! 52 0 null null 0 0 1 10  -1 -1 0 0 brandless null null 0 0 0 35 1 1", "hi! hi! 97 97 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 null -1 1 35 35", (int)' ', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    java.lang.String str2 = carTest_instance0.toString();
    int i3 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "brandless null 1970 0"+ "'", str2.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.toString();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! 0 0  hi! 0 0 1 0", "null hi! 0 35", (int)(byte)0, (int)(short)-1);
    carTest_instance0.Cars("brandless null 1970 0", " hi! null null 0 0 52 1 -1 0  10 10", (int)'a', (int)(short)10);
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10  -1 -1", "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1  32 0", (int)(short)100, 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless"+ "'", str14.equals("brandless"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.getBrand();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! 35 0  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 -1 100", "null null 0 0 brandless null 1970 0 null null 0 0 -1 100 1 32 hi! hi! 52 52 0 -1", (int)(short)100, (int)'4');
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100 brandless null 1970 0 null null 0 0 -1 100 1 52", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless  hi! null null 0 0 52 1 -1 0 35 0 10 100 hi! hi! 52 0 null null 0 0 1 52 0 -1", (int)(byte)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", (int)(byte)0, 35);
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getYear();
    int i17 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless"+ "'", str14.equals("brandless"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10", 32, 100);
    java.lang.String str19 = carTest_instance0.toString();
    java.lang.String str20 = carTest_instance0.getModel();
    int i21 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 100"+ "'", str19.equals(" null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"+ "'", str20.equals("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null"+ "'", str17.equals("null"));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test302"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless null 1970 0 null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35 97 10", "hi! hi! 52 0 null null 0 0 1 10", (int)(byte)0, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.toString();
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    java.lang.String str17 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0", " hi! null null 0 0 52 1 -1 0", 10, (int)(byte)-1);
    int i21 = carTest_instance0.getYear();
    java.lang.String str22 = carTest_instance0.toString();
    java.lang.String str23 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str25 = carTest_instance0.toString();
    java.lang.String str26 = carTest_instance0.getModel();
    java.lang.String str27 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 35 100", " hi! 0 0 hi! 1 52 hi! hi! 52 0 null null 0 0 1 52 52 -1", (int)(byte)0, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"+ "'", str22.equals("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str23.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "brandless null 1970 0"+ "'", str25.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null"+ "'", str26.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null"+ "'", str27.equals("null"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getModel();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", "", 1970, (int)' ');
    carTest_instance0.Cars();
    java.lang.String str14 = carTest_instance0.toString();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 1970 0"+ "'", str14.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars("", "brandless hi! 97 0", 1970, 1);
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i24 = carTest_instance0.getPrice();
    java.lang.String str25 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null"+ "'", str25.equals("null"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0", "hi! null null 0 0 52 1", 1, (int)(short)100);
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0", "hi! hi! 97 97 brandless null 1970 0 0 97", (int)(short)0, 10);
    java.lang.String str22 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0", "null null 0 0 hi! hi! 97 97 1 10", (int)'#', 1);
    int i28 = carTest_instance0.getYear();
    int i29 = carTest_instance0.getYear();
    int i30 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100 null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32 0 97", " brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1", (int)(short)100, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str22.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 35);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100  hi! 0 100 1970 0", "", 32, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" null  hi! 0 0 0 -1 97 10 hi! hi! 97 97 100 35", "hi! hi! 97 97 hi! null null 0 0 52 1 0 32 brandless 52 100 hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10 100 1", (int)(byte)10, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0 hi! hi! 97 97 1 10", "null null 0 0 hi! hi! 97 97 1 10", (int)(short)100, 0);
    int i17 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str19 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " hi! 0 0"+ "'", str11.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless null 1970 0"+ "'", str19.equals("brandless null 1970 0"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " hi! 0 0"+ "'", str11.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! 0 0"+ "'", str15.equals(" hi! 0 0"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless hi! 97 0", "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1", 35, (int)'a');
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless hi! 97 0"+ "'", str14.equals("brandless hi! 97 0"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0", " hi! 35 0", (int)(byte)100, (int)(short)100);
    carTest_instance0.Cars("", "brandless null null 0 0 1970 0", (int)(byte)1, 0);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0", "null null 0 0", 1, 52);
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 52 0"+ "'", str13.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32", "null", (int)(byte)-1, 1);
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless hi! 32 1970", "hi! hi! 52 0  hi! 35 0 100 100", (int)(short)0, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! 52 0"+ "'", str15.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", " brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1 hi! hi! 52 0 10 -1", (int)(byte)100, 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    carTest_instance0.Cars();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "brandless", (int)(byte)10, (int)' ');
    java.lang.String str15 = carTest_instance0.getModel();
    int i16 = carTest_instance0.getYear();
    int i17 = carTest_instance0.getPrice();
    java.lang.String str18 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str18.equals("null null 0 0 null null 0 0 100 52"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100", "hi! hi! 97 97 brandless null 1970 0 0 97", 35, 0);
    java.lang.String str19 = carTest_instance0.toString();
    java.lang.String str20 = carTest_instance0.toString();
    java.lang.String str21 = carTest_instance0.getModel();
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52 hi! null null 0 0 52 1 brandless 32 0 -1 97", "hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35", (int)' ', (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 brandless null 1970 0 0 97 35 0"+ "'", str19.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 brandless null 1970 0 0 97 35 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 brandless null 1970 0 0 97 35 0"+ "'", str20.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 brandless null 1970 0 0 97 35 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str21.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getYear();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars("", "hi! hi! 52 0 null null 0 0 1 10", 1, 0);
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless null 0 10 hi! hi! 52 0 100 -1 hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 1 35", (int)(short)10, 10);
    java.lang.String str17 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1", " hi! 0 100 hi! hi! 52 0 -1 10", 0, (int)(byte)100);
    carTest_instance0.Cars("", " hi! null null 0 0 52 1 -1 0 null 97 -1", (int)(short)-1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 52 0", (int)(byte)-1, (int)'a');
    java.lang.String str14 = carTest_instance0.toString();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100", " hi! null null 0 0 52 1 -1 0 null 97 -1", (int)(short)100, 32);
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", "brandless null 0 10", 35, 97);
    java.lang.String str27 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str30 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"+ "'", str14.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 52 0"+ "'", str16.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"+ "'", str27.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "brandless"+ "'", str30.equals("brandless"));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "brandless null 1970 0 null null 0 0 -1 100 null 97 10", 52, 0);
    int i14 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars("", "null null 0 0 brandless -1 1 null hi! hi! 52 0 -1 1 0 35", 10, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", 100, (int)'4');
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 97 97", " hi! 0 0", (int)(byte)0, 0);
    java.lang.String str17 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str19 = carTest_instance0.toString();
    java.lang.String str20 = carTest_instance0.getModel();
    carTest_instance0.Cars("", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100", (int)(short)100, (int)'#');
    carTest_instance0.Cars("null null 0 0 brandless null 1970 0 null null 0 0 -1 100 1 32", "hi! hi! 52 52", (int)(short)1, 35);
    int i31 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! 0 0"+ "'", str17.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless null 1970 0"+ "'", str19.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null"+ "'", str20.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 35);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    int i2 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i4 = carTest_instance0.getYear();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", "hi! null null 0 0 52 1", 52, 97);
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getPrice();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i14 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "brandless"+ "'", str3.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"+ "'", str9.equals("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! null null 0 0 52 1"+ "'", str11.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! null null 0 0 52 1"+ "'", str12.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97", "brandless null 1970 0", 0, (int)'a');
    java.lang.String str16 = carTest_instance0.toString();
    java.lang.String str17 = carTest_instance0.getBrand();
    int i18 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" brandless null 1970 0 hi! hi! 52 0 null null 0 0 1 10  -1 -1 0 0 52 10", "null  10 0", 1970, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str16.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! hi! 97 97"+ "'", str17.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 97);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.toString();
    int i12 = carTest_instance0.getPrice();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32 null -1 1 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 brandless null null 0 0 0 35 97 100 10 100", "null null 0 0 null null 0 0 100 52  35 0  hi! 35 0  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 -1 100 1 35", 1970, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 97 97"+ "'", str11.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.toString();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0", " hi! null null 0 0 52 1 -1 0", 10, (int)(byte)-1);
    int i21 = carTest_instance0.getYear();
    java.lang.String str22 = carTest_instance0.toString();
    java.lang.String str23 = carTest_instance0.getModel();
    int i24 = carTest_instance0.getYear();
    int i25 = carTest_instance0.getYear();
    java.lang.String str26 = carTest_instance0.getModel();
    java.lang.String str27 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"+ "'", str22.equals("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str23.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str26.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0"+ "'", str27.equals("hi! hi! 97 97  hi! 0 0 0 0"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", (int)(byte)0, 35);
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97 hi! null null 0 0 52 1 0 32", (int)(short)-1, 1);
    int i18 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  0 1 null hi! hi! 52 0 -1 1 0 0", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", (int)(short)-1, 0);
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0 null null 0 0 100 52  0 1 null hi! hi! 52 0 -1 1 0 0"+ "'", str12.equals("null null 0 0 null null 0 0 100 52  0 1 null hi! hi! 52 0 -1 1 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"+ "'", str13.equals(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null", 1970, 52);
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 35 0", "hi! hi! 97 97 brandless null 1970 0 0 97", (-1), (int)(short)-1);
    carTest_instance0.Cars();
    java.lang.String str23 = carTest_instance0.getModel();
    int i24 = carTest_instance0.getYear();
    java.lang.String str25 = carTest_instance0.toString();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100 null null 0 0 -1 10", "hi! hi! 52 0 brandless 1 0", (int)'4', 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null"+ "'", str23.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "brandless null 1970 0"+ "'", str25.equals("brandless null 1970 0"));

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "null", (int)(short)0, 10);
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.toString();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 0 10"+ "'", str14.equals("brandless null 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "null", (int)(short)0, 10);
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100", " hi! null null 0 0 52 1 -1 0", 0, (int)(short)10);
    int i16 = carTest_instance0.getPrice();
    int i17 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str19 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless"+ "'", str19.equals("brandless"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.toString();
    java.lang.String str8 = carTest_instance0.toString();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0", "null null 0 0 hi! 52 100", 0, 0);
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless null 1970 0"+ "'", str7.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0 null null 0 0 hi! 52 100 0 0"+ "'", str17.equals("hi! null null 0 0 52 1 brandless 32 0 null null 0 0 hi! 52 100 0 0"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null null 0 0", (-1), (int)(short)100);
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0", "brandless null 1970 0", (int)(byte)0, 35);
    int i18 = carTest_instance0.getPrice();
    int i19 = carTest_instance0.getPrice();
    java.lang.String str20 = carTest_instance0.getBrand();
    int i21 = carTest_instance0.getYear();
    int i22 = carTest_instance0.getYear();
    java.lang.String str23 = carTest_instance0.getModel();
    int i24 = carTest_instance0.getPrice();
    java.lang.String str25 = carTest_instance0.getModel();
    java.lang.String str26 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str12.equals("brandless null 1970 0 null null 0 0 -1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null null 0 0"+ "'", str20.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "brandless null 1970 0"+ "'", str23.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "brandless null 1970 0"+ "'", str25.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "brandless null 1970 0"+ "'", str26.equals("brandless null 1970 0"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! 0 0", " null null 0 0 null null 0 0 100 52 0 35", (-1), 35);
    carTest_instance0.Cars();
    java.lang.String str19 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi! null null 0 0 52 1"+ "'", str9.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0"+ "'", str11.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless null 1970 0"+ "'", str19.equals("brandless null 1970 0"));

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    java.lang.String str7 = carTest_instance0.getModel();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless null 0 10  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 35 -1", "", 10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless", " hi! 0 0", (int)(byte)1, (int)(short)-1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", " hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0  null null 0 0 null null 0 0 100 52 100 0 -1 32", 1, (int)(short)1);
    java.lang.String str17 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "", 100, (-1));
    carTest_instance0.Cars("", "null", 1, (int)(byte)100);
    java.lang.String str24 = carTest_instance0.getModel();
    int i25 = carTest_instance0.getPrice();
    java.lang.String str26 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null"+ "'", str24.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null"+ "'", str26.equals("null"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 null null 0 0 hi! hi! 52 0 1970 52 0 1", "brandless hi! 97 0 null 52 -1", (int)'#', (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getModel();
    int i19 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52", " null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 100", 0, 1);
    java.lang.String str25 = carTest_instance0.getBrand();
    java.lang.String str26 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null"+ "'", str18.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52"+ "'", str25.equals(" null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52"+ "'", str26.equals(" null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    int i2 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1970);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null"+ "'", str9.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    int i2 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getPrice();
    int i6 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", 0, (int)(short)1);
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", " hi! 0 0 hi! null null 0 0 52 1 1 100", 1, (int)(byte)-1);
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", "hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35", 52, 10);
    java.lang.String str27 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35"+ "'", str27.equals("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getBrand();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", 100, (int)'4');
    int i10 = carTest_instance0.getPrice();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.getBrand();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.getBrand();
    int i17 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1 hi! hi! 52 0 10 -1", "hi! hi! 52 0 null null 0 0 1 10 hi! hi! 52 0 null null 0 0 1 10 -1 32", (int)'a', (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str11.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str13.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null null 0 0"+ "'", str16.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 52);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.getBrand();
    java.lang.String str10 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null", 1970, 52);
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.toString();
    int i18 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str20 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0 null 1970 52"+ "'", str17.equals("brandless null 1970 0 null 1970 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null 1970 0"+ "'", str20.equals("brandless null 1970 0"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getYear();
    int i12 = carTest_instance0.getYear();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.toString();
    java.lang.String str17 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97  hi! 0 0 hi! 1 52 10 10", " hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0", (int)'#', (int)'#');
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.toString();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 52", " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0", (int)' ', (int)(short)-1);
    java.lang.String str12 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 52  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0 32 -1"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 52  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0 32 -1"));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "null", (int)(short)0, 10);
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 0 10"+ "'", str12.equals("brandless null 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! null null 0 0 52 1", " hi! 0 100 hi! hi! 52 0 -1 10", 0, (int)(byte)100);
    int i24 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getModel();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", " hi! 0 0", 0, 1);
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str17 = carTest_instance0.getModel();
    int i18 = carTest_instance0.getYear();
    int i19 = carTest_instance0.getYear();
    int i20 = carTest_instance0.getYear();
    int i21 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1"+ "'", str15.equals("hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null"+ "'", str17.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1970);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless hi! 97 0", " hi! 0 0 hi! 1 52  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 10 100", 10, (int)(short)10);
    java.lang.String str18 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 0 10 null null 0 0 null null 0 0 100 52 null  hi! 0 100 -1 100 100 35 52 0", " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97 hi! null null 0 0 52 1 brandless 32 0 100 32", 35, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless hi! 97 0  hi! 0 0 hi! 1 52  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 10 100 10 10"+ "'", str18.equals("brandless hi! 97 0  hi! 0 0 hi! 1 52  hi! null null 0 0 52 1 -1 0 hi! hi! 97 97 100 52 10 100 10 10"));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.toString();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    int i17 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 1970 0"+ "'", str14.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1970);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", " null null 0 0 null null 0 0 100 52 0 35", 97, 10);
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35"+ "'", str10.equals(" null null 0 0 null null 0 0 100 52 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless"+ "'", str15.equals("brandless"));

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0", "hi! hi! 52 0", 1970, (int)'4');
    java.lang.String str16 = carTest_instance0.toString();
    java.lang.String str17 = carTest_instance0.getModel();
    java.lang.String str18 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null null 0 0 hi! hi! 52 0 1970 52"+ "'", str16.equals("null null 0 0 hi! hi! 52 0 1970 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi! hi! 52 0"+ "'", str17.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null null 0 0"+ "'", str18.equals("null null 0 0"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0", "brandless", (int)(byte)100, 0);
    java.lang.String str24 = carTest_instance0.getModel();
    java.lang.String str25 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 97 97"+ "'", str16.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str17.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi! hi! 97 97"+ "'", str18.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "brandless"+ "'", str24.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null null 0 0"+ "'", str25.equals("null null 0 0"));

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970", 0, (int)(short)10);
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10 null  hi! 0 0 0 -1 0 0", "hi! hi! 52 0 null null 0 0 1 10  null null 0 0 null null 0 0 100 52 0 35 97 10", 1, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    java.lang.String str3 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! 0 0", "hi! hi! 97 97  hi! 0 0 0 0", (int)' ', (int)'#');
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.toString();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless null 1970 0"+ "'", str11.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }

    carTest carTest_instance0 = new carTest();
    int i1 = carTest_instance0.getYear();
    carTest_instance0.Cars("null null 0 0", "hi! hi! 97 97", (int)'#', (int)(short)-1);
    carTest_instance0.Cars(" hi! 0 100", "hi! hi! 52 0", (-1), 10);
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars("null  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 10 10  hi! 35 0 hi! hi! 52 0 10 0  brandless hi! 97 0 35 0 10 35 35 10", "brandless null 0 10 hi! hi! 52 0 100 -1  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52 10 10", (int)(byte)10, 35);
    carTest_instance0.Cars("hi! null null 0 0 52 1 hi! hi! 97 97 0 97", "brandless hi! 97 0  hi! 0 0  hi! 0 0 1 0 10 10 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 null  hi! 0 0 0 -1 -1 100 0 52", (int)(short)100, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " hi! 0 100 hi! hi! 52 0 -1 10"+ "'", str12.equals(" hi! 0 100 hi! hi! 52 0 -1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.toString();
    java.lang.String str5 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97", "brandless", 1, (int)' ');
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i14 = carTest_instance0.getPrice();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 97 97"+ "'", str11.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0", " hi! null null 0 0 52 1 -1 0", 10, (int)(byte)-1);
    int i21 = carTest_instance0.getYear();
    java.lang.String str22 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! hi! 52 0 null null 0 0 1 10  -1 -1 52 97 brandless null null 0 0 1970 0 0 -1", "null null 0 0 hi! hi! 97 97 1 10 brandless null null 0 0 0 35 10 1970", (int)'4', (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"+ "'", str22.equals("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"));

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  0 1", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 0 97", 52, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32", "null", (int)(byte)-1, 1);
    java.lang.String str22 = carTest_instance0.getModel();
    int i23 = carTest_instance0.getPrice();
    java.lang.String str24 = carTest_instance0.getModel();
    int i25 = carTest_instance0.getYear();
    java.lang.String str26 = carTest_instance0.getBrand();
    java.lang.String str27 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! 52 0"+ "'", str15.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null"+ "'", str22.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null"+ "'", str24.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi! hi! 97 97 hi! null null 0 0 52 1 0 32"+ "'", str26.equals("hi! hi! 97 97 hi! null null 0 0 52 1 0 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi! hi! 97 97 hi! null null 0 0 52 1 0 32"+ "'", str27.equals("hi! hi! 97 97 hi! null null 0 0 52 1 0 32"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.getModel();
    carTest_instance0.Cars("null  hi! 0 0 0 -1", "brandless null 1970 0 null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35 97 10", (-1), (int)(short)10);
    int i21 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 0 1970 brandless null 0 10 -1 1", "hi! hi! hi! 97 97 52 52", (int)(byte)0, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getYear();
    int i8 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless null 1970 0", " hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100", (int)'a', (int)(byte)100);
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97", "hi! hi! 52 0 null null 0 0 1 52", (int)'a', (int)(byte)100);
    int i22 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100"+ "'", str16.equals(" hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    java.lang.String str4 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 hi! hi! 52 0 null null 0 0 1 10 10 100", "hi! null null 0 0 52 1 brandless 32 0", (int)' ', (int)(byte)0);
    carTest_instance0.Cars("null null 0 0 hi! 52 100  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 52 -1", " hi! 0 0 hi! 1 52 hi! hi! 52 0 null null 0 0 1 52 52 -1", 100, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getModel();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100", "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1", (int)(short)-1, 1);
    java.lang.String str18 = carTest_instance0.toString();
    java.lang.String str19 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100 hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1 -1 1"+ "'", str18.equals("brandless null 1970 0 null null 0 0 -1 100 hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1 -1 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str19.equals("brandless null 1970 0 null null 0 0 -1 100"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0"+ "'", str11.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! null null 0 0 52 1"+ "'", str12.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null null 0 0"+ "'", str15.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getModel();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    int i12 = carTest_instance0.getPrice();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", "hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100", (int)(short)10, (int)(byte)10);
    int i12 = carTest_instance0.getPrice();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10 hi! null null 0 0 52 1 1970 -1", "null null 0 0 brandless null 1970 0 null null 0 0 -1 100 1 32 hi! hi! 52 52 1 35", (int)(byte)0, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10", " hi! 0 0 hi! 1 52", (int)(short)0, 1970);
    carTest_instance0.Cars("", "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10", 0, (int)(byte)100);
    java.lang.String str21 = carTest_instance0.toString();
    int i22 = carTest_instance0.getPrice();
    int i23 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 0 100"+ "'", str21.equals(" null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 0 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 100);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    int i14 = carTest_instance0.getYear();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getBrand();
    int i18 = carTest_instance0.getPrice();
    int i19 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 52 0", (int)(byte)-1, (int)'a');
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 97 97 brandless null 1970 0 0 97", "brandless", (int)(byte)10, (int)(byte)1);
    carTest_instance0.Cars("hi! hi! 97 97", "", (int)(short)100, (int)(byte)-1);
    java.lang.String str26 = carTest_instance0.getBrand();
    java.lang.String str27 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str14.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi! hi! 97 97"+ "'", str26.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi! hi! 97 97"+ "'", str27.equals("hi! hi! 97 97"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10", "brandless null null 0 0 0 35  hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 1 -1", (int)(short)1, 32);
    java.lang.String str19 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52 100 0", " hi! null null 0 0 52 1 -1 0 null 97 -1  hi! 0 100 hi! hi! 52 0 -1 10 10 1", 0, (int)(short)1);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10"+ "'", str19.equals("hi! hi! hi! 97 97 brandless null 1970 0 0 97 10 -1 brandless null 1970 0 null 1970 52 35 10"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", " brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 -1 -1 hi! hi! 52 0 10 -1", 52, (int)(byte)10);
    int i17 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10  hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 100 0 1 97 hi! hi! 52 0 null null 0 0 1 10  0 52 97 52", "brandless null 0 10", (int)(short)0, (int)'a');
    java.lang.String str11 = carTest_instance0.getBrand();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + " hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10  hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 100 0 1 97 hi! hi! 52 0 null null 0 0 1 10  0 52 97 52"+ "'", str11.equals(" hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10  hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 100 0 1 97 hi! hi! 52 0 null null 0 0 1 10  0 52 97 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", 100, (int)(byte)-1);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getBrand();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i19 = carTest_instance0.getYear();
    int i20 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null"+ "'", str17.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1970);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 hi! hi! 97 97 35 -1", " brandless 1 10", (int)(byte)10, (int)'a');
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    carTest_instance0.Cars("null", "hi!", 1, 32);
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str14 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless"+ "'", str14.equals("brandless"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", (int)' ', (int)(byte)0);
    java.lang.String str18 = carTest_instance0.getBrand();
    java.lang.String str19 = carTest_instance0.getBrand();
    java.lang.String str20 = carTest_instance0.getModel();
    int i21 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"+ "'", str18.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"+ "'", str19.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"+ "'", str20.equals(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "brandless null 1970 0", 1970, (int)(byte)100);
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97", (int)'a', 0);
    java.lang.String str17 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "null null 0 0 null null 0 0 100 52 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 0"+ "'", str17.equals("null null 0 0 null null 0 0 100 52 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 0"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97", "", (int)'a', 10);
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.toString();
    java.lang.String str17 = carTest_instance0.toString();
    java.lang.String str18 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getModel();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", "hi! null null 0 0 52 1 brandless 32 0", (int)(short)-1, 97);
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0 null 1970 52 brandless -1 1970", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 52", (int)(byte)-1, (int)(byte)1);
    int i20 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0"+ "'", str14.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "brandless  hi! 0 0 1 -1", (int)'#', 1);
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 52 0"+ "'", str13.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    int i12 = carTest_instance0.getYear();
    java.lang.String str13 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! null null 0 0 52 1"+ "'", str13.equals("hi! null null 0 0 52 1"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! 35 0", "hi! hi! 52 0", (int)(short)10, (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getPrice();
    int i17 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 52 0"+ "'", str13.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "hi!", (int)' ', 1970);
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 97 97 brandless null 1970 0 0 97", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 0 97", (int)(byte)10, (int)(byte)10);
    java.lang.String str20 = carTest_instance0.getBrand();
    java.lang.String str21 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str20.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 0 97 10 10"+ "'", str21.equals("hi! hi! 97 97 brandless null 1970 0 0 97  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 0 97 10 10"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    int i12 = carTest_instance0.getPrice();
    int i13 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless null 1970 0"+ "'", str5.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    java.lang.String str7 = carTest_instance0.getModel();
    int i8 = carTest_instance0.getYear();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", " hi! 0 0", (-1), 10);
    java.lang.String str14 = carTest_instance0.getModel();
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getYear();
    int i17 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! 0 0"+ "'", str14.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str15.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.toString();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless null 1970 0"+ "'", str7.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("", "hi! null null 0 0 52 1", (int)(byte)-1, 0);
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100", (int)'#', 0);
    int i21 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str15.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, (int)'#');
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.toString();
    java.lang.String str15 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null null 0 0 0 35"+ "'", str13.equals("brandless null null 0 0 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null null 0 0 0 35"+ "'", str14.equals("brandless null null 0 0 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null null 0 0 0 35"+ "'", str15.equals("brandless null null 0 0 0 35"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.getBrand();
    int i8 = carTest_instance0.getPrice();
    java.lang.String str9 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97 brandless null 1970 0 0 97", "brandless null 1970 0 null null 0 0 -1 100", (int)(byte)0, 35);
    java.lang.String str18 = carTest_instance0.getBrand();
    java.lang.String str19 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  35 0 hi! null null 0 0 52 1 brandless 32 0 null null 0 0 97 1 -1 52", "brandless null 0 10", 1970, 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str18.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi! hi! 97 97 brandless null 1970 0 0 97"+ "'", str19.equals("hi! hi! 97 97 brandless null 1970 0 0 97"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100", (int)(short)1, (int)(short)100);
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 32", "hi! null null 0 0 52 1 brandless 32 0  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0 100 32", (int)'#', (int)(short)0);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, (int)'#');
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.toString();
    carTest_instance0.Cars("null brandless null 1970 0 null null 0 0 -1 100 100 1970", " hi! 0 100", 10, (int)'4');
    java.lang.String str20 = carTest_instance0.toString();
    int i21 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null null 0 0 0 35"+ "'", str14.equals("brandless null null 0 0 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null brandless null 1970 0 null null 0 0 -1 100 100 1970  hi! 0 100 10 52"+ "'", str20.equals("null brandless null 1970 0 null null 0 0 -1 100 100 1970  hi! 0 100 10 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10", "hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10", 100, (int)(byte)1);
    java.lang.String str20 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10"+ "'", str20.equals("hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i11 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", "null null 0 0 hi! 52 100", (-1), (int)(short)100);
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i16 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0 hi! 52 100"+ "'", str14.equals("null null 0 0 hi! 52 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 100", "brandless null 1970 0 null null 0 0 -1 100  hi! null null 0 0 52 1 -1 0 1 100", (int)'4', 1970);
    carTest_instance0.Cars();
    java.lang.String str19 = carTest_instance0.getModel();
    java.lang.String str20 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null"+ "'", str19.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null"+ "'", str20.equals("null"));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null 0 10", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 brandless 32 0 0 100", 35, (int)(byte)1);
    carTest_instance0.Cars();
    java.lang.String str21 = carTest_instance0.getBrand();
    java.lang.String str22 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless null 0 10 hi! hi! 52 0 100 -1  hi! 0 0 hi! null null 0 0 52 1 1 100 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 10 52 10 10", "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1  null null 0 0 null null 0 0 100 52 0 35 brandless null 1970 0 10 35 1 100", (int)(byte)100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "brandless"+ "'", str21.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "brandless"+ "'", str22.equals("brandless"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    int i4 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100", " hi! null null 0 0 52 1 -1 0", (int)(byte)1, (int)(short)100);
    java.lang.String str10 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  0 1", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10 32 52", (int)(short)0, 100);
    carTest_instance0.Cars(" hi! 0 0 hi! 1 52", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0  hi! null null 0 0 52 1 -1 0 brandless null 1970 0 null null 0 0 -1 100 null 97 10 52 0 0 52", (int)(byte)0, 1);
    int i21 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str10.equals("brandless null 1970 0 null null 0 0 -1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.toString();
    int i17 = carTest_instance0.getPrice();
    java.lang.String str18 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 52 0"+ "'", str16.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100  1970 32", " hi! 0 0 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97 97 100 brandless null null 0 0 0 -1 32 97", 0, (int)(short)-1);
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "", (int)(short)0, 52);
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    java.lang.String str7 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless null null 0 0 0 35", "hi! hi! hi! 97 97 52 52 brandless null 0 10 100 -1", (int)(byte)1, 52);
    java.lang.String str16 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! hi! 97 97 52 52 brandless null 0 10 100 -1"+ "'", str16.equals("hi! hi! hi! 97 97 52 52 brandless null 0 10 100 -1"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.getBrand();
    java.lang.String str7 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", " hi! 0 0", (int)(short)100, 10);
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    int i15 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"+ "'", str12.equals("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 0 0", "hi! hi! 52 0 null null 0 0 1 10", 10, 100);
    int i20 = carTest_instance0.getPrice();
    int i21 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", " hi! 0 0", (int)(short)0, 10);
    int i27 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0", (int)(short)0, (int)(byte)-1);
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0", "brandless null 1970 0 null null 0 0 -1 100", 0, 1970);
    java.lang.String str14 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1", "hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 0 1970", (int)(short)0, (int)(byte)10);
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32", "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1", (int)(short)1, (int)'#');
    java.lang.String str25 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0  10 10 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 brandless null 1970 0 null null 0 0 -1 100 null 97 10 0 1 10 0 1 35", "null null 0 0 null null 0 0 100 52  35 0", (int)(byte)1, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str14.equals("brandless null 1970 0 null null 0 0 -1 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32"+ "'", str25.equals("null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getYear();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    int i2 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars("", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970", (int)(short)100, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1970);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "brandless null 1970 0", 1970, (int)(byte)100);
    java.lang.String str12 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! null null 0 0 52 1 hi! hi! 97 97 hi! null null 0 0 52 1 0 32 -1 0", "null null 0 0 null null 0 0 100 52  0 1 null hi! hi! 52 0 -1 1 0 0", 0, (int)(byte)100);
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getPrice();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "null"+ "'", str7.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless", "null", (int)(short)0, 10);
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getYear();
    carTest_instance0.Cars(" null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52", "null hi! 1 32", (int)'#', 1970);
    int i19 = carTest_instance0.getYear();
    carTest_instance0.Cars(" brandless 1 10", "hi! null null 0 0 52 1 brandless 32 0 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 1 35 hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10 0 1970 brandless null 0 10 -1 1", 35, (int)'a');
    int i25 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 35);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97", "hi! null null 0 0 52 1", 0, (int)' ');
    carTest_instance0.Cars("hi! null null 0 0 52 1", "brandless", (int)(byte)1, (-1));
    carTest_instance0.Cars();
    int i21 = carTest_instance0.getYear();
    int i22 = carTest_instance0.getPrice();
    java.lang.String str23 = carTest_instance0.getModel();
    int i24 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi! null null 0 0 52 1"+ "'", str9.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null"+ "'", str23.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1970);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", 100, (int)'4');
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 97 97", " hi! 0 0", (int)(byte)0, 0);
    int i17 = carTest_instance0.getPrice();
    java.lang.String str18 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 0 10", "hi! hi! 52 0", 100, (int)(short)-1);
    int i24 = carTest_instance0.getYear();
    java.lang.String str25 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0"+ "'", str18.equals("hi! hi! 97 97  hi! 0 0 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi! hi! 52 0"+ "'", str25.equals("hi! hi! 52 0"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    int i12 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null null 0 0"+ "'", str4.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null null 0 0"+ "'", str6.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    int i5 = carTest_instance0.getYear();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getPrice();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getBrand();
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52 brandless null 1970 0 null null 0 0 -1 100 10 32", " brandless null 1970 0 null null 0 0 -1 100 10 -1", (int)'#', (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "", (int)'#', 0);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.toString();
    java.lang.String str15 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str10.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 1970 0"+ "'", str14.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "brandless", (int)(byte)100, (int)(short)1);
    int i12 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null", " hi! 0 0", (int)' ', (int)(byte)1);
    java.lang.String str18 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars("", " hi! 35 0", (-1), (int)'4');
    int i25 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i27 = carTest_instance0.getYear();
    carTest_instance0.Cars("  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1", "hi! hi! 97 97", (int)(byte)100, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null  hi! 0 0 32 1"+ "'", str18.equals("null  hi! 0 0 32 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1970);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars("brandless", " hi! 0 0", (int)(byte)1, (int)(short)-1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970", "hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100", 1970, (int)' ');
    int i15 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str17 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.toString();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "null"+ "'", str18.equals("null"));

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }

    carTest carTest_instance0 = new carTest();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str3 = carTest_instance0.getModel();
    carTest_instance0.Cars("null", "hi!", 1, 32);
    carTest_instance0.Cars("brandless null 1970 0 null 1970 52 hi! null null 0 0 52 1 brandless 32 0 10 1970 hi! null null 0 0 52 1 brandless 32 0 1 1", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970", 100, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null"+ "'", str3.equals("null"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars(" hi! 0 0", " hi! 0 0", (int)(byte)1, 0);
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! 0 0"+ "'", str14.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.toString();
    int i17 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 1970 0"+ "'", str16.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 52 0", (int)(byte)-1, (int)'a');
    java.lang.String str14 = carTest_instance0.toString();
    int i15 = carTest_instance0.getYear();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52  hi! 0 0 100 10", "hi! hi! 97 97  hi! 0 0 0 0", (int)(short)100, 0);
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0 null 97 -1", "hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 brandless null 1970 0 null null 0 0 -1 100 null 97 10 0 1", 1970, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + " hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"+ "'", str14.equals(" hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.toString();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "null null 0 0"+ "'", str3.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null"+ "'", str11.equals("null"));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0", (int)(short)0, (int)(byte)-1);
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)'4');
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null"+ "'", str6.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str11 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.toString();
    java.lang.String str14 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i17 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "brandless"+ "'", str11.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless"+ "'", str14.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("null", "hi!", 100, (int)(byte)-1);
    java.lang.String str10 = carTest_instance0.getBrand();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0 null null 0 0 -1 100 null 97 10", "hi! hi! 97 97 hi! hi! 97 97 100 35", 52, (int)(short)10);
    int i20 = carTest_instance0.getYear();
    int i21 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null"+ "'", str10.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 1970 0"+ "'", str14.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    java.lang.String str5 = carTest_instance0.getModel();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", "hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100", (int)(short)10, (int)(byte)10);
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "null"+ "'", str4.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null"+ "'", str5.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless hi! hi! 52 0 null null 0 0 1 10 1 52 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 10 10"+ "'", str12.equals("brandless hi! hi! 52 0 null null 0 0 1 10 1 52 hi! hi! 52 0 null null 0 0 1 10 brandless null 1970 0 1970 100 10 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getPrice();
    int i9 = carTest_instance0.getPrice();
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars("null null 0 0 brandless null 1970 0 null null 0 0 -1 100 1 32 brandless null 1970 0 null null 0 0 -1 100  10 10 -1 1", "", (int)(short)1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", (-1), (int)' ');
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i16 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi! hi! 97 97"+ "'", str8.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    int i6 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars(" hi! 35 0", "hi! hi! 52 0", (int)(short)10, (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getPrice();
    java.lang.String str17 = carTest_instance0.toString();
    int i18 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 52 0"+ "'", str13.equals("hi! hi! 52 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars("", "hi! hi! 52 0 null null 0 0 1 10", 1, 0);
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.getModel();
    carTest_instance0.Cars("null null 0 0 brandless -1 1", "brandless null 1970 0 null 1970 52", (int)(short)1, 32);
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str11.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str12.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10"+ "'", str13.equals("hi! hi! 52 0 null null 0 0 1 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i8 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 52 0", (int)(byte)-1, (int)'a');
    carTest_instance0.Cars();
    carTest_instance0.Cars("null null 0 0 null null 0 0 100 52", "brandless hi! hi! 52 0 null null 0 0 1 10 1 52", 97, 32);
    java.lang.String str20 = carTest_instance0.toString();
    carTest_instance0.Cars("null null 0 0 brandless null 1970 0 null null 0 0 -1 100 1 32", "null null 0 0 null null 0 0 100 52  hi! 0 0 100 10", (int)(byte)1, (int)(short)10);
    carTest_instance0.Cars("brandless null null 0 0 0 -1 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 100 1970", "hi! hi! 97 97 hi! null null 0 0 52 1 0 32 null -1 1", 32, 10);
    java.lang.String str31 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32"+ "'", str20.equals("null null 0 0 null null 0 0 100 52 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 97 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "brandless null null 0 0 0 -1 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 100 1970"+ "'", str31.equals("brandless null null 0 0 0 -1 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 100 1970"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0", " hi! null null 0 0 52 1 -1 0", 10, (int)(byte)-1);
    int i21 = carTest_instance0.getYear();
    java.lang.String str22 = carTest_instance0.getModel();
    java.lang.String str23 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10  0 52", " null null 0 0 null null 0 0 100 52 0 35 hi! hi! 52 0 null null 0 0 1 52 1 52 hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 32 97 100", (int)(short)-1, (int)'#');
    int i29 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str22.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0"+ "'", str23.equals("hi! hi! 97 97  hi! 0 0 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.getModel();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0", "brandless hi! 97 0 hi! null null 0 0 52 1 35 97", (int)(byte)100, (int)(short)10);
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless hi! 97 0", " hi! hi! 52 0 null null 0 0 1 10 1 0", (int)(short)-1, 35);
    java.lang.String str24 = carTest_instance0.getBrand();
    int i25 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + " hi! 0 0"+ "'", str9.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless null 1970 0"+ "'", str18.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "brandless hi! 97 0"+ "'", str24.equals("brandless hi! 97 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 35);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10", " hi! null null 0 0 52 1 -1 0 null 97 -1", (int)(byte)100, 0);
    java.lang.String str18 = carTest_instance0.toString();
    int i19 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0", "null null 0 0 hi! 52 100", 0, (int)(byte)-1);
    carTest_instance0.Cars();
    int i26 = carTest_instance0.getYear();
    int i27 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null null 0 0"+ "'", str12.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0"+ "'", str18.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1970);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars("null hi! 0 35", "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 32", (int)'#', (int)(byte)-1);
    java.lang.String str22 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 null null 0 0 null null 0 0 100 52  35 0 100 97", " hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 10 -1", 35, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "null null 0 0"+ "'", str9.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 32"+ "'", str22.equals("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 10 32"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.toString();
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.toString();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless null 1970 0"+ "'", str6.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "brandless"+ "'", str7.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless"+ "'", str8.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", " null null 0 0 null null 0 0 100 52 0 35", 97, 10);
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 hi! 1 52", "hi! hi! 97 97  hi! 0 0 0 0 hi! hi! 97 97 brandless null 1970 0 0 97 1970 10", (-1), (int)(short)0);
    java.lang.String str16 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 brandless hi! hi! 52 0 null null 0 0 1 10 1 52 0 97", "null hi! hi! 52 0 -1 1", (int)(byte)-1, (int)(short)-1);
    carTest_instance0.Cars(" brandless null 1970 0 null null 0 0 -1 100 10 -1", "brandless null null 0 0 0 -1", (int)(short)-1, 0);
    java.lang.String str27 = carTest_instance0.getModel();
    int i28 = carTest_instance0.getYear();
    int i29 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " null null 0 0 null null 0 0 100 52 0 35"+ "'", str10.equals(" null null 0 0 null null 0 0 100 52 0 35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " hi! 0 0 hi! 1 52"+ "'", str16.equals(" hi! 0 0 hi! 1 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "brandless null null 0 0 0 -1"+ "'", str27.equals("brandless null null 0 0 0 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    int i13 = carTest_instance0.getYear();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi! hi! 97 97"+ "'", str15.equals("hi! hi! 97 97"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "", 100, (-1));
    carTest_instance0.Cars("", "null", 1, (int)(byte)100);
    carTest_instance0.Cars("", " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32", 1, (int)(short)-1);
    java.lang.String str29 = carTest_instance0.toString();
    java.lang.String str30 = carTest_instance0.toString();
    java.lang.String str31 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless null 1970 0"+ "'", str13.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1"+ "'", str29.equals("  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1"+ "'", str30.equals("  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32 1 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + " hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32"+ "'", str31.equals(" hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null 97 -1 100 32"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getYear();
    java.lang.String str12 = carTest_instance0.getBrand();
    int i13 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "null null 0 0"+ "'", str10.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! null null 0 0 52 1", "hi! hi! 97 97", (int)(short)0, (int)'a');
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    int i9 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "hi!", (int)'a', (int)(short)0);
    java.lang.String str15 = carTest_instance0.getModel();
    int i16 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "", (int)(short)10, (int)(byte)10);
    int i17 = carTest_instance0.getYear();
    java.lang.String str18 = carTest_instance0.getModel();
    java.lang.String str19 = carTest_instance0.toString();
    int i20 = carTest_instance0.getPrice();
    java.lang.String str21 = carTest_instance0.getModel();
    java.lang.String str22 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! null null 0 0 52 1 -1 0  10 10"+ "'", str19.equals(" hi! null null 0 0 52 1 -1 0  10 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str22.equals(" hi! null null 0 0 52 1 -1 0"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getBrand();
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! hi! 97 97", (int)(short)100, 52);
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getBrand();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str15.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str17.equals(" hi! null null 0 0 52 1 -1 0"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi! hi! 97 97"+ "'", str10.equals("hi! hi! 97 97"));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getYear();
    carTest_instance0.Cars("brandless", "null null 0 0", 0, (int)'#');
    int i13 = carTest_instance0.getPrice();
    java.lang.String str14 = carTest_instance0.toString();
    carTest_instance0.Cars("null brandless null 1970 0 null null 0 0 -1 100 100 1970", " hi! 0 100", 10, (int)'4');
    carTest_instance0.Cars("null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35", "brandless hi! hi! 52 0 null null 0 0 1 10 1 52 brandless null 1970 0 null null 0 0 -1 100 10 32", 32, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null null 0 0 0 35"+ "'", str14.equals("brandless null null 0 0 0 35"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless", "null null 0 0", (int)(short)0, (int)(byte)-1);
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0", "brandless null 1970 0 null null 0 0 -1 100", 0, 1970);
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0 hi! null null 0 0 52 1 1 100 hi! null null 0 0 52 1 1970 100", "brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 hi! null null 0 0 52 1 52 97  null null 0 0 null null 0 0 100 52 100 0 35 0", (int)(byte)100, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "null null 0 0"+ "'", str1.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null null 0 0"+ "'", str8.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970"+ "'", str15.equals(" hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + " hi! 0 0"+ "'", str16.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0 null null 0 0 -1 100"+ "'", str17.equals("brandless null 1970 0 null null 0 0 -1 100"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i3 = carTest_instance0.getYear();
    java.lang.String str4 = carTest_instance0.toString();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless null 1970 0"+ "'", str4.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, 0);
    java.lang.String str9 = carTest_instance0.getModel();
    java.lang.String str10 = carTest_instance0.toString();
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97  hi! 0 0 0 0", " hi! null null 0 0 52 1 -1 0", 10, (int)(byte)-1);
    int i21 = carTest_instance0.getYear();
    java.lang.String str22 = carTest_instance0.toString();
    java.lang.String str23 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str25 = carTest_instance0.toString();
    java.lang.String str26 = carTest_instance0.getModel();
    java.lang.String str27 = carTest_instance0.getModel();
    java.lang.String str28 = carTest_instance0.getBrand();
    int i29 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + " hi! 0 0"+ "'", str10.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + " hi! 0 0"+ "'", str13.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"+ "'", str22.equals("hi! hi! 97 97  hi! 0 0 0 0  hi! null null 0 0 52 1 -1 0 10 -1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + " hi! null null 0 0 52 1 -1 0"+ "'", str23.equals(" hi! null null 0 0 52 1 -1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "brandless null 1970 0"+ "'", str25.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "null"+ "'", str26.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "null"+ "'", str27.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "brandless"+ "'", str28.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1970);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getPrice();
    java.lang.String str5 = carTest_instance0.getModel();
    int i6 = carTest_instance0.getYear();
    int i7 = carTest_instance0.getPrice();
    java.lang.String str8 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getBrand();
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 hi! hi! 52 0 -1 1", "brandless  hi! 0 0 1 -1 brandless null null 0 0 0 -1  null null 0 0 null null 0 0 100 52 0 35 97 100 35 -1", (int)(byte)10, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless"+ "'", str12.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    carTest_instance0.Cars("", "null null 0 0 null null 0 0 100 52", (int)(short)100, (int)(byte)0);
    java.lang.String str11 = carTest_instance0.getModel();
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getModel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str11.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + " null null 0 0 null null 0 0 100 52 100 0"+ "'", str12.equals(" null null 0 0 null null 0 0 100 52 100 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str13.equals("null null 0 0 null null 0 0 100 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null null 0 0 null null 0 0 100 52"+ "'", str14.equals("null null 0 0 null null 0 0 100 52"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "brandless"+ "'", str6.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10", "hi! null null 0 0 52 1", 1970, (-1));
    carTest_instance0.Cars(" hi! null null 0 0 52 1 -1 0", "hi! null null 0 0 52 1", 97, (-1));
    carTest_instance0.Cars();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.getBrand();
    int i19 = carTest_instance0.getYear();
    java.lang.String str20 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! hi! 97 97 52 52", "null  hi! 0 0 0 -1 hi! hi! 52 0 null null 0 0 1 10  -1 -1 10 35", 1970, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "null"+ "'", str16.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless null 1970 0"+ "'", str20.equals("brandless null 1970 0"));

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    java.lang.String str4 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0", "null null 0 0", 100, (int)'4');
    int i10 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    carTest_instance0.Cars("hi! hi! 97 97", " hi! 0 0", (int)(byte)0, 0);
    int i17 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    carTest_instance0.Cars("", "", 35, (int)(short)-1);
    int i12 = carTest_instance0.getPrice();
    int i13 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars();
    int i12 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));

  }

}
