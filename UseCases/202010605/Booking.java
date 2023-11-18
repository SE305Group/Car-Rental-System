import java.util.*;

public class Booking {
private ArrayList<Cars> allCars;
public Scanner kb;
//an arraylist will give us flexibility in order to easily access the Cars class objects.


public Booking() {
    allCars = new ArrayList<>();
    kb = new Scanner(System.in);
    //Initiating the Booking class with an empty array to hold Cars objects and a scanner.
}

public void run() {
    displayCars();
    int carNumber = getCarNumber();
    Cars selectedCar = getCarDetails(carNumber);
    bookCar(selectedCar);
    confirmBooking();
    goToPayment();
    kb.close();
    //This method is simply calling other methods that will do each part of the work in enclosed area so that errors are easily fixable and maintained.
}

private void displayCars() {
    System.out.println("Type 'yes' if you would like to display the cars available!");
    String userInput = kb.nextLine();

    if (!userInput.equals("yes")) {
        System.out.println("Terminated");
        System.exit(0);
    }

    for (int i = 0; i < allCars.size(); i++) {
        System.out.println((i+1) + ": " + allCars.get(i).getBrand() + " " + allCars.get(i).getModel());
    }//displays the allCars arraylist after user interest in viewing the car list.
}

private int getCarNumber() {
    System.out.println("Type the car number to show the full details of the car!");
    int carNumber = kb.nextInt();
    kb.nextLine();

    if (carNumber > allCars.size() || carNumber < 1) {
        System.out.println("Terminated");
        System.exit(0);
    }

    return carNumber;//obtain the car index that the user is interested in to learn more about.
}

private Cars getCarDetails(int carNumber) {
    Cars selectedCar = allCars.get(carNumber-1);
    System.out.println(selectedCar);
    return selectedCar;//using the get function in arraylists to return the Cars object that the user was interested in.
}

private void bookCar(Cars selectedCar) {
    System.out.println("Would you like to book this car? Type 'yes' followed by the starting date of rental and the end date");
    String userBooking = kb.nextLine();

    if (!userBooking.split(" ")[0].equals("yes")) {
        System.out.println("Terminated");
        System.exit(0);
    }

    String startingDate = userBooking.split(" ")[1];
    String finishDate = userBooking.split(" ")[2];

    System.out.println(startingDate + " " + finishDate + " is available");//obtains the date and confirmation for a car booking interesting, once it is checked it will continue further, but for now I didnt implement this and simply assumed it is available
}

private void confirmBooking() {
    System.out.println("Type 'yes' to confirm the booking, you will be sent to the payment page");
    String userInput = kb.nextLine();

    if (!userInput.equals("yes")) {
        System.out.println("Terminated");
        System.exit(0);
    }
    //goToPayment()
    System.out.println("Sent to payment page!");//once user confirms the last time, he will be reirected to the payment page.
}

private void goToPayment() {
    //This is where the page would switch to the payment page
}

public static void main(String[] args) {
    Booking booking = new Booking();

    booking.allCars.add(new Cars("Honda", "Civic", 2016, 30));
    booking.allCars.add(new Cars("Toyota", "Camry", 2022, 60));
    booking.allCars.add(new Cars("Mitsubishi", "Lancer", 2013, 20));
    booking.allCars.add(new Cars("Hyundai", "Elantra", 2023, 50));
    booking.allCars.add(new Cars("Ford", "Expedition", 2016, 30));

    booking.run();
    //the main of the Booking class where data of the Cars object list can be modified.
}
}