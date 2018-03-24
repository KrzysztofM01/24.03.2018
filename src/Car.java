public class Car {
    private String brand, color, model, registrationName;
    private int power, engineCapacity;
    private double avgFuelConsumption;

    public Car(String brand, String color, String model, int power, int engineCapacity, double avgFuelConsumption, String registration) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.power = power;
        this.engineCapacity = engineCapacity;
        this.avgFuelConsumption = avgFuelConsumption;
        this.registrationName = registration;
        CarRepository.carsList.add(this);
    }

    public Car(CarDataWrapper carDataWrapper){
        this.brand = carDataWrapper.brand;
        this.color = carDataWrapper.color;
        this.model = carDataWrapper.model;
        this.power = carDataWrapper.power;
        this.engineCapacity = carDataWrapper.engineCapacity;
        this.avgFuelConsumption = carDataWrapper.avgFuelConsumption;
        this.registrationName = carDataWrapper.registrationName;
        CarRepository.carsList.add(this);
    }

    public static void remove(Car car){
        CarRepository.carsList.remove(car);
        car = null;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setAvgFuelConsumption(double avgFuelConsumption) {
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", engineCapacity=" + engineCapacity +
                ", avgFuelConsumption=" + avgFuelConsumption +
                ", registrationName='" + registrationName+ '\'' + " ";
    }
}



