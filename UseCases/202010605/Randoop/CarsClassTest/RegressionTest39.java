
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test01"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    java.lang.String str13 = carTest_instance0.getModel();
    int i14 = carTest_instance0.getYear();
    java.lang.String str15 = carTest_instance0.getModel();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "null"+ "'", str13.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "null"+ "'", str15.equals("null"));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test02"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
    java.lang.String str11 = carTest_instance0.getBrand();
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.toString();
    int i14 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i16 = carTest_instance0.getYear();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi! hi! 97 97"+ "'", str13.equals("hi! hi! 97 97"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1970);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test03"); }

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
    java.lang.String str15 = carTest_instance0.getModel();
    java.lang.String str16 = carTest_instance0.getModel();
    carTest_instance0.Cars("hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1  1 35", "null null 0 0 brandless -1 1 brandless null 1970 0 null 1970 52 1 32", (int)' ', 1);
    java.lang.String str22 = carTest_instance0.toString();
    java.lang.String str23 = carTest_instance0.getBrand();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1  1 35 null null 0 0 brandless -1 1 brandless null 1970 0 null 1970 52 1 32 32 1"+ "'", str22.equals("hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1  1 35 null null 0 0 brandless -1 1 brandless null 1970 0 null 1970 52 1 32 32 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1  1 35"+ "'", str23.equals("hi! hi! 52 0 null null 0 0 1 10  hi! 0 0 0 1  1 35"));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test04"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getModel();
    int i11 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getYear();
    
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
    org.junit.Assert.assertTrue(i11 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1970);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test05"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getModel();
    int i5 = carTest_instance0.getPrice();
    java.lang.String str6 = carTest_instance0.getBrand();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test06"); }

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
    java.lang.String str14 = carTest_instance0.getModel();
    int i15 = carTest_instance0.getPrice();
    java.lang.String str16 = carTest_instance0.toString();
    java.lang.String str17 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "null"+ "'", str14.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless null 0 10"+ "'", str16.equals("brandless null 0 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test07"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    java.lang.String str8 = carTest_instance0.getModel();
    java.lang.String str9 = carTest_instance0.getModel();
    int i10 = carTest_instance0.getYear();
    java.lang.String str11 = carTest_instance0.getModel();
    carTest_instance0.Cars();
    int i13 = carTest_instance0.getPrice();
    int i14 = carTest_instance0.getPrice();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getModel();
    java.lang.String str17 = carTest_instance0.toString();
    
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
    org.junit.Assert.assertTrue(i13 == 0);
    
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test08"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    java.lang.String str7 = carTest_instance0.getBrand();
    java.lang.String str8 = carTest_instance0.getBrand();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.getModel();
    java.lang.String str13 = carTest_instance0.getBrand();
    java.lang.String str14 = carTest_instance0.toString();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "null"+ "'", str12.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "brandless null 1970 0"+ "'", str14.equals("brandless null 1970 0"));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test09"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getYear();
    int i10 = carTest_instance0.getYear();
    int i11 = carTest_instance0.getPrice();
    java.lang.String str12 = carTest_instance0.toString();
    int i13 = carTest_instance0.getPrice();
    carTest_instance0.Cars(" hi! 35 0  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 -1 100", "hi! null null 0 0 52 1 brandless 32 0  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 0 10  hi! null null 0 0 52 1 -1 0 null 97 -1 100 0 100 32 hi! hi! 52 0 null null 0 0 1 10 hi! null null 0 0 52 1 1970 -1 32 35", (-1), 52);
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi! null null 0 0 52 1"+ "'", str12.equals("hi! null null 0 0 52 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test10"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    java.lang.String str10 = carTest_instance0.toString();
    carTest_instance0.Cars("brandless null 1970 0", "null", 1970, 52);
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str18 = carTest_instance0.toString();
    java.lang.String str19 = carTest_instance0.toString();
    java.lang.String str20 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless null 1970 0"+ "'", str10.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless null 1970 0"+ "'", str18.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "brandless null 1970 0"+ "'", str19.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless"+ "'", str20.equals("brandless"));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test11"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.getBrand();
    int i10 = carTest_instance0.getPrice();
    int i11 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless", "", (int)'a', 97);
    java.lang.String str17 = carTest_instance0.getBrand();
    java.lang.String str18 = carTest_instance0.getModel();
    int i19 = carTest_instance0.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless"+ "'", str9.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless"+ "'", str17.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test12"); }

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
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str22 = carTest_instance0.getModel();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "null"+ "'", str22.equals("null"));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test13"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    carTest_instance0.Cars("", "null null 0 0 null null 0 0 100 52", (int)(short)100, (int)(byte)0);
    carTest_instance0.Cars("brandless hi! hi! 52 0 null null 0 0 1 10 1 52", "brandless null 1970 0 null null 0 0 -1 100", 10, 32);
    java.lang.String str16 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 brandless -1 1  hi! 35 0 -1 0", "null null 0 0 hi! 52 100 hi! 0 52", 0, (int)(byte)-1);
    int i22 = carTest_instance0.getPrice();
    java.lang.String str23 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless hi! hi! 52 0 null null 0 0 1 10 1 52"+ "'", str16.equals("brandless hi! hi! 52 0 null null 0 0 1 10 1 52"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null null 0 0 brandless -1 1  hi! 35 0 -1 0"+ "'", str23.equals("null null 0 0 brandless -1 1  hi! 35 0 -1 0"));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test14"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    int i5 = carTest_instance0.getYear();
    java.lang.String str6 = carTest_instance0.getModel();
    int i7 = carTest_instance0.getYear();
    java.lang.String str8 = carTest_instance0.getModel();
    int i9 = carTest_instance0.getYear();
    java.lang.String str10 = carTest_instance0.getBrand();
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
    org.junit.Assert.assertTrue(i7 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null"+ "'", str8.equals("null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "brandless"+ "'", str10.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1970);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test15"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("hi!", "hi!", (int)'a', (int)'a');
    int i7 = carTest_instance0.getPrice();
    int i8 = carTest_instance0.getYear();
    int i9 = carTest_instance0.getPrice();
    java.lang.String str10 = carTest_instance0.getModel();
    carTest_instance0.Cars(" hi! 0 0", "hi! null null 0 0 52 1", 1, (int)(short)100);
    carTest_instance0.Cars();
    int i17 = carTest_instance0.getPrice();
    java.lang.String str18 = carTest_instance0.getBrand();
    int i19 = carTest_instance0.getYear();
    java.lang.String str20 = carTest_instance0.getBrand();
    int i21 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    int i23 = carTest_instance0.getPrice();
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "brandless"+ "'", str20.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test16"); }

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
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getBrand();
    java.lang.String str17 = carTest_instance0.toString();
    java.lang.String str18 = carTest_instance0.getBrand();
    int i19 = carTest_instance0.getPrice();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "brandless"+ "'", str16.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "brandless null 1970 0"+ "'", str17.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "brandless"+ "'", str18.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test17"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str4 = carTest_instance0.getBrand();
    java.lang.String str5 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    carTest_instance0.Cars();
    java.lang.String str8 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! null null 0 0 52 1 brandless 32 0 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 100 10", "brandless  hi! null null 0 0 52 1 -1 0 35 0 hi! hi! 52 52 10 97", 1, 35);
    java.lang.String str14 = carTest_instance0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "brandless"+ "'", str4.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "brandless"+ "'", str5.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "brandless null 1970 0"+ "'", str8.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi! null null 0 0 52 1 brandless 32 0 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 100 10 brandless  hi! null null 0 0 52 1 -1 0 35 0 hi! hi! 52 52 10 97 1 35"+ "'", str14.equals("hi! null null 0 0 52 1 brandless 32 0 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 100 10 brandless  hi! null null 0 0 52 1 -1 0 35 0 hi! hi! 52 52 10 97 1 35"));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test18"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    carTest_instance0.Cars("", "", 35, (int)(short)-1);
    int i12 = carTest_instance0.getPrice();
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars("  10 1970", " hi! null null 0 0 52 1 -1 0 null 97 -1", (int)(byte)-1, 1);
    java.lang.String str19 = carTest_instance0.getBrand();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "  10 1970"+ "'", str19.equals("  10 1970"));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test19"); }

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
    java.lang.String str19 = carTest_instance0.getModel();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "null"+ "'", str19.equals("null"));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test20"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    int i2 = carTest_instance0.getPrice();
    carTest_instance0.Cars("hi!", "null null 0 0", (int)'4', 1);
    carTest_instance0.Cars("hi!", "hi!", (int)'4', (int)(byte)0);
    java.lang.String str13 = carTest_instance0.getModel();
    java.lang.String str14 = carTest_instance0.getBrand();
    java.lang.String str15 = carTest_instance0.toString();
    java.lang.String str16 = carTest_instance0.getBrand();
    carTest_instance0.Cars("null null 0 0 brandless null 1970 0 0 35", " null  hi! 0 0 0 -1 97 10", (int)(short)10, 1);
    java.lang.String str22 = carTest_instance0.getModel();
    java.lang.String str23 = carTest_instance0.toString();
    java.lang.String str24 = carTest_instance0.toString();
    int i25 = carTest_instance0.getYear();
    int i26 = carTest_instance0.getPrice();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + " null  hi! 0 0 0 -1 97 10"+ "'", str22.equals(" null  hi! 0 0 0 -1 97 10"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "null null 0 0 brandless null 1970 0 0 35  null  hi! 0 0 0 -1 97 10 10 1"+ "'", str23.equals("null null 0 0 brandless null 1970 0 0 35  null  hi! 0 0 0 -1 97 10 10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "null null 0 0 brandless null 1970 0 0 35  null  hi! 0 0 0 -1 97 10 10 1"+ "'", str24.equals("null null 0 0 brandless null 1970 0 0 35  null  hi! 0 0 0 -1 97 10 10 1"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test21"); }

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
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    int i15 = carTest_instance0.getYear();
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
    org.junit.Assert.assertTrue(i12 == 1970);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1970);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test22"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    carTest_instance0.Cars("", "brandless null 1970 0", 97, (int)(short)0);
    int i7 = carTest_instance0.getPrice();
    carTest_instance0.Cars();
    java.lang.String str9 = carTest_instance0.toString();
    carTest_instance0.Cars("hi! hi! 97 97 hi! null null 0 0 52 1 0 32", " hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970", 0, (int)(short)10);
    int i15 = carTest_instance0.getYear();
    java.lang.String str16 = carTest_instance0.getBrand();
    int i17 = carTest_instance0.getPrice();
    carTest_instance0.Cars("brandless null 1970 0 null 1970 52  hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97 100 32  hi! 0 100 brandless hi! 97 0 hi! null null 0 0 52 1 35 97 -1 0 32 1", "  hi! 0 0 brandless null 1970 0 null null 0 0 -1 100 0 1970 null null 0 0 null null 0 0 100 52  0 1 10 35 null null 0 0 hi! hi! 52 0 1970 52 100 52 100 52", (int)(byte)-1, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "brandless null 1970 0"+ "'", str9.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi! hi! 97 97 hi! null null 0 0 52 1 0 32"+ "'", str16.equals("hi! hi! 97 97 hi! null null 0 0 52 1 0 32"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test23"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    carTest_instance0.Cars("", "hi!", 0, (int)(byte)100);
    carTest_instance0.Cars(" hi! 0 0", " hi! 0 0", (int)(byte)1, 0);
    java.lang.String str14 = carTest_instance0.getBrand();
    int i15 = carTest_instance0.getPrice();
    int i16 = carTest_instance0.getYear();
    java.lang.String str17 = carTest_instance0.getModel();
    java.lang.String str18 = carTest_instance0.getBrand();
    java.lang.String str19 = carTest_instance0.toString();
    java.lang.String str20 = carTest_instance0.getModel();
    java.lang.String str21 = carTest_instance0.toString();
    carTest_instance0.Cars(" null  hi! 0 0 0 -1 97 10 null null 0 0 null null 0 0 100 52  hi! 0 0 100 10  hi! null null 0 0 52 1 -1 0 null 97 -1 -1 -1 10 0", " hi! 0 0 hi! 1 52  97 10 hi! hi! 97 97  hi! 0 0 0 0 null null 0 0 hi! hi! 97 97 1 10 32 0 null null 0 0 null null 0 0 100 52  35 0 100 97  hi! 0 0 hi! null null 0 0 52 1 1 100  hi! null null 0 0 52 1 -1 0 null null 0 0 null null 0 0 100 52 1970 -1 52 10 52 0  hi! null null 0 0 52 1 -1 0 hi! hi! 52 0 -1 97  hi! 0 0 hi! 1 52 10 10 52 100 32 52", 100, 0);
    
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
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + " hi! 0 0"+ "'", str17.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + " hi! 0 0"+ "'", str18.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + " hi! 0 0  hi! 0 0 1 0"+ "'", str19.equals(" hi! 0 0  hi! 0 0 1 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + " hi! 0 0"+ "'", str20.equals(" hi! 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + " hi! 0 0  hi! 0 0 1 0"+ "'", str21.equals(" hi! 0 0  hi! 0 0 1 0"));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test24"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getBrand();
    int i3 = carTest_instance0.getPrice();
    int i4 = carTest_instance0.getYear();
    carTest_instance0.Cars();
    carTest_instance0.Cars("", "hi! hi! 52 0 null null 0 0 1 10", 1, 0);
    carTest_instance0.Cars();
    java.lang.String str12 = carTest_instance0.toString();
    java.lang.String str13 = carTest_instance0.getBrand();
    carTest_instance0.Cars();
    java.lang.String str15 = carTest_instance0.toString();
    int i16 = carTest_instance0.getPrice();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "brandless null 1970 0"+ "'", str12.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "brandless"+ "'", str13.equals("brandless"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "brandless null 1970 0"+ "'", str15.equals("brandless null 1970 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest39.test25"); }

    carTest carTest_instance0 = new carTest();
    java.lang.String str1 = carTest_instance0.getBrand();
    java.lang.String str2 = carTest_instance0.getModel();
    java.lang.String str3 = carTest_instance0.toString();
    java.lang.String str4 = carTest_instance0.toString();
    java.lang.String str5 = carTest_instance0.toString();
    int i6 = carTest_instance0.getYear();
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null null 0 0"+ "'", str5.equals("null null 0 0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

}
