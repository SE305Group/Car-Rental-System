public class cardetails {
    private String brand;
    private String model;
    private int year;
    private double pricePerDay;
    private int rentalDuration;

    public cardetails(String brand,String model, int year,double pricePerDay, int rentalDuration) {
        this.brand = brand;
        this.model= model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.rentalDuration = rentalDuration;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price per day: $" + pricePerDay);
        System.out.println("Rental duration: " + rentalDuration + " days");
    }
}