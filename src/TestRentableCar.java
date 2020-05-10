public class TestRentableCar {
    public static void main(String[] args) {

        Rentable vehicleToRent = new RentableCar("Honda Goldwing", 2018, 2);

        vehicleToRent.rent("Antoni", "Mazerewicz", "A123456789");
        System.out.println(vehicleToRent);

        if (vehicleToRent.isRent()) {
            System.out.println(" Wybierz inny pojazd lub poczekaj na zwrot zamawianego pojazdu");
        } else {
            vehicleToRent.rent("Zbigniew", "Zamagowsky", "B987654321");
            System.out.println(vehicleToRent);
        }
    }
}
