import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FamilyCar car1 = new FamilyCar("bmw", "brown", "23", 20, 34, 23.0, "as", 3);
        FamilyCar car2 = new FamilyCar("mercedes", "brown", "23", 23, 34, 23.0, "as", 3);
        FamilyCar car3 = new FamilyCar("audi", "brown", "23", 7, 34, 23.0, "as", 3);

        Collections.sort(CarRepository.carsList, new Car.CarComparator2());
        CarRepository.showCars();
       // Flow.start();
    }
}
