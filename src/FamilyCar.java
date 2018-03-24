public class FamilyCar extends Car {

    private int seatNumber;

    public FamilyCar(String brand, String color, String model, int power, int engineCapacity, double avgFuelConsumption, String registration, int seatNumber) {
        super(brand, color, model, power, engineCapacity, avgFuelConsumption, registration);
        this.seatNumber = seatNumber;
    }

    public FamilyCar(CarDataWrapper carDataWrapper, int seatNumber){
        super(carDataWrapper);
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {

        return  "FamilyCar{" +
                super.toString() +
                "seatNumber=" + seatNumber +
                '}';
    }


}
