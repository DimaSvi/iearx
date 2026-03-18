public class Main {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Camry", 2019, 5);
        Truck truck = new Truck("Volvo", "FH16", 2021, 20);
        Bike bike = new Bike("Yamaha", "R6", 2020, 600);

        System.out.println(car.getInfo());
        System.out.println("Пасажирів: " + car.getPassengerCapacity());

        System.out.println();

        System.out.println(truck.getInfo());
        System.out.println("Вантажопідйомність: " + truck.getCargoCapacity());

        System.out.println();

        System.out.println(bike.getInfo());
        System.out.println("Об'єм двигуна: " + bike.getEngineVolume());

        System.out.println("\nПоліморфізм:");

        Transport[] transports = {car, truck, bike};

        for (Transport t : transports) {
            System.out.println(t.getInfo());
        }
    }
}