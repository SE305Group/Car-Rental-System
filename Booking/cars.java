public class Cars {

    private String brand;
    private String model;
    private int year;
    private int price;

    public Cars(){
        this.brand = "brandless";
        this.model = "null";
        this.year =1970;
        this.price=0;
        // default constructor, this should not be used except for testing.
    }

    public Cars(String brand, String model, int year, int price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price= price;
        //This constructor will generate an object from the Cars class, this will give us an easy access to add or examine a car.
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String toString() {
        return brand+" "+model+" "+year+" "+price;
        //overwritting the default toString method as we want the details and the Cars object and not it's hashcode 
      }
    }

    
