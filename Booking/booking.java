import java.util.*;

public class booking{
public static void main (String[] args){

        ArrayList<cars> allCars = new ArrayList<cars>();

        cars HondaCivic1 = new cars("Honda", "Civic", 2016, 30);
        allCars.add(HondaCivic1);
        cars toyotaCamry1 = new cars("Toyota", "Camry", 2022, 60);
        allCars.add(toyotaCamry1);
        cars mitsubishiLancer1 = new cars("Mitsubishi", "Lancer", 2013, 20);
        allCars.add(mitsubishiLancer1);
        cars hyundaiElantra1 = new cars("Hyundai", "Elantra", 2023, 50);
        allCars.add(hyundaiElantra1);
        cars fordExpedition1 = new cars("Ford", "Expedition", 2016, 30);
        allCars.add(fordExpedition1);


        Scanner kb = new Scanner(System.in);

        System.out.println("Type yes if you would like to display the cars available!");


        String userInput = kb.nextLine();

        if (!userInput.equals("yes")){
            System.out.println("terminated"); System.exit(0);
        }

        for(int i=0; i<allCars.size(); i++){
            System.out.println((i+1)+": "+allCars.get(i).getBrand()+" "+allCars.get(i).getModel());
        }

        System.out.println("Type the car number to show the full details of the car!");
        int carNumber = kb.nextInt();
        kb.nextLine();

        if (carNumber>allCars.size()||carNumber<1){
            System.out.println("terminated"); System.exit(0);
        } else{
            System.out.println(allCars.get(carNumber-1));
         }
        

        System.out.println("Would you like to book this car? type 'yes' followed by the starting date of rental and the end date"); 
        
        String userBooking = kb.nextLine();

        if (!userBooking.split(" ")[0].equals("yes")){
            System.out.println("terminated"); System.exit(0);
        }

        String startingDate = userBooking.split(" ")[1];
        String finishDate = userBooking.split(" ")[2];

        System.out.println(startingDate+" "+finishDate+ " is available\nType yes to confirm the booking, you will be sent to the payment page");

        userInput = kb.nextLine();

        if (!userInput.equals("yes")){
            System.out.println("terminated"); System.exit(0);
        }

        System.out.println("Sent to payment page!");




        kb.close();


}

}