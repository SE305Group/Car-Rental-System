import static org.junit.Assert.assertEquals;

import java.util.*;
import org.junit.*;

public class Testbill {

    @Test
    public void testGetPaymentMethod_CreditCard() {
        assertEquals("Credit card", generatebill.getPaymentMethod(1));
    }

    @Test
    public void testGetPaymentMethod_DebitCard() {
        assertEquals("Debit card", generatebill.getPaymentMethod(2));
    }

    @Test
    public void testGetPaymentMethod_Benefitpay() {

        assertEquals("Benefitpay", generatebill.getPaymentMethod(3));
    }

    @Test
    public void testGetPaymentMethod_InvalidSelection() {
        assertEquals("Invalid selection", generatebill.getPaymentMethod(4));
    }

    @Test
    public void testCalculate() {
        double pricePerDay = 20.0;
        double duration = 7.0;
        double expectedPrice = pricePerDay * duration;
        double actualPrice = generatebill.calculate(pricePerDay, duration);
        assertEquals(expectedPrice, actualPrice, 0.01);
    }
}
