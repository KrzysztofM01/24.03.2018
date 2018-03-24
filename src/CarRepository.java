import java.util.ArrayList;

public class CarRepository {
    static ArrayList<Car> carsList = new ArrayList<>();

    public static void showCars(){
        for (Car cars: CarRepository.carsList) {
            System.out.println(cars.toString());
        }
    }

}
