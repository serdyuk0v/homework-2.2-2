public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] truck = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycle = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        ServiceStation stationForTransport = new ServiceStationForTransport();

        checkService(stationForTransport, car, truck, bicycle);
    }

    private static void checkService(ServiceStation serviceStation, Car[] car, Truck[] truck, Bicycle[] bicycle) {
        serviceStation.check(car);
        serviceStation.check(truck);
        serviceStation.check(bicycle);
    }
}