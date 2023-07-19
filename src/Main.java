import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String nameAndSurname = "Michal Stanislav";
        LocalDate sellersDateOfBirth = LocalDate.of(1990,12,22);
        int numberOfContracts = 50;
        int tonsSold = 2000;
        String sellersHeadquarter = "Prague";
        String licensePlate = "5AZ 9366";
        double vehicleConsumption = 5.5;
        String ipAddress = "94.142.238.75";


        double carrotsSoldPerContract = tonsSold/numberOfContracts;

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: " + carrotsSoldPerContract+ " tun.");
    }
}