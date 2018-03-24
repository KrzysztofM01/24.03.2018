public class Truck extends Car {
    private int maxWeight, axlesNumber;
    private double height;
    private Boolean truckTrailer;

    public Truck(String brand, String color, String model, int power, int engineCapacity, double avgFuelConsumption, String registration, int maxWeight, int axlesNumber, double height, Boolean truckTrailer) {
        super(brand, color, model, power, engineCapacity, avgFuelConsumption, registration);
        this.maxWeight = maxWeight;
        this.axlesNumber = axlesNumber;
        this.height = height;
        this.truckTrailer = truckTrailer;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public int getAxlesNumber() {
        return axlesNumber;
    }

    public double getHeight() {
        return height;
    }

    public Boolean getTruckTrailer() {
        return truckTrailer;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                "maxWeight=" + maxWeight +
                ", axlesNumber=" + axlesNumber +
                ", height=" + height +
                ", truckTrailer=" + truckTrailer +
                '}';
    }
}
