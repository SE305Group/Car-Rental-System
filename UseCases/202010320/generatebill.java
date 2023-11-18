import java.util.*;


public class generatebill {
    
    public static String getPaymentMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select a payment method:");
        System.out.println("1. Credit card");
        System.out.println("2. Debit card");
        System.out.println("3. Benefitpay");
        int paymentmethod = scanner.nextInt();
        switch (paymentmethod) {
            case 1:
                return "Credit card";
            case 2:
                return "Debit card";
            case 3:
                return "Benefitpay";
            default:
                return "Invalid selection";
        }
    }
    
    public static double calculate(double pricePerDay, double duration) {
        return pricePerDay * duration;
    }
    public static void main(String[] args) {
        cardetails details = new cardetails("Toyota", "Camry", 2015, 20.0, 7);
        details.displayDetails();
      String paymethod =  getPaymentMethod();
      System.out.println(paymethod);
      double price =  calculate(20.0, 7.0);
      System.out.println(price);
      
    }
}
