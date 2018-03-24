public class OffRoadCar extends Car{
    private Boolean reductor, x4drive, spareWheel;

    public OffRoadCar(String brand, String color, String model, int power, int engineCapacity, double avgFuelConsumption, String registration, Boolean reductor, Boolean x4drive, Boolean spareWheel) {
        super(brand, color, model, power, engineCapacity, avgFuelConsumption, registration);
        this.reductor = reductor;
        this.x4drive = x4drive;
        this.spareWheel = spareWheel;
    }

    public Boolean getReductor() {
        return reductor;
    }

    public Boolean getX4drive() {
        return x4drive;
    }

    public Boolean getSpareWheel() {
        return spareWheel;
    }

    @Override
    public String toString() {
        return "OffRoadCar{" + super.toString() +
                "reductor=" + reductor +
                ", x4drive=" + x4drive +
                ", spareWheel=" + spareWheel +
                '}';
    }
}
