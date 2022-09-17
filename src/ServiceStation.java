public interface ServiceStation {
    default void check(Car[] cars) {
        System.out.println("Нет автомобилей!");
    };

    default void check(Truck[] trucks) {
        System.out.println("Нет грузовиков!");
    };

    default void check(Bicycle[] bicycles) {
        System.out.println("Нет велосипедов!");
    };
}
