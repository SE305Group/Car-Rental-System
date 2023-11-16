public class cars {

    private String brand;
    private String model;
    private int year;
    private int price;

    public cars(){
        this.brand = "brandless";
        this.model = "null";
        this.year =1970;
        this.price=0;
    }

    public cars(String brand, String model, int year, int price){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price= price;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getModel(){
        return this.model;
    }

    public String toString() {
        return brand+" "+model+" "+year+" "+price;
      }
    }

    
