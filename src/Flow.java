import java.util.InputMismatchException;
import java.util.Scanner;

public class Flow {

    public static void start() {
        boolean exitFlow = Boolean.FALSE;
        do {
            System.out.println();
            System.out.println("---------------------");
            System.out.println();
            int input = Menu.mainScreen();
            switch (input) {
                case 1:
                    Flow.typeCarFlow();
                    break;
                case 2:
                    CarRepository.showCars();
                    break;
                case 3:
                    exitFlow = Boolean.TRUE;
                    break;
            }
        } while (!exitFlow);
        System.exit(0);
    }

    private static void typeCarFlow() {
        int input = Menu.carTypeScreen();
        CarDataWrapper carDataWrapper = readMainParameters();
        Scanner scanner = new Scanner(System.in);
        switch (input) {
            case 1:
                System.out.print("Seat numbers: ");
                int seatNumber = scanner.nextInt();
                FamilyCar fc = new FamilyCar(carDataWrapper, seatNumber);
                break;
            case 2:
                System.out.print("Seat numbers: ");
                int seatsNumber = scanner.nextInt();
                System.out.print("Standing places: ");
                int standingPlaces = scanner.nextInt();
                System.out.print("Length: ");
                double length = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                Bus bus = new Bus(carDataWrapper, seatsNumber, standingPlaces, length, height);
                break;
            case 3:
                System.out.println("wololo");
                break;

        }
    }

    private static CarDataWrapper readMainParameters() {
        CarDataWrapper carDataWrapper = new CarDataWrapper();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Brand: ");
        carDataWrapper.brand = scanner.nextLine();
        System.out.print("Model: ");
        carDataWrapper.color = scanner.nextLine();
        System.out.print("Color: ");
        carDataWrapper.model = scanner.nextLine();
        carDataWrapper.power = ourScanner("Power");
        System.out.print("Engine capacity: ");
        carDataWrapper.engineCapacity = scanner.nextInt();
        System.out.print("Average fuel consumption: ");
        carDataWrapper.avgFuelConsumption = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Registration: ");
        carDataWrapper.registrationName = scanner.nextLine();
        return carDataWrapper;
    }

    public static int ourScanner(String parameterName) {
        int result;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print(parameterName + ": ");
                result = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wrong input!");
                continue;
            }
            break;
        }
        return result;
    }
}