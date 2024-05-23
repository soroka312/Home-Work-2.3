public class Main {
    public static void main(String[] args) {
        Car[] car = {new Car("BMW", 4),
                new Car("Audi", 4)};


        Truck[] truck = {new Truck("ГАЗ", 4),
                new Truck("КАМАЗ", 6)};


        Bicycle[] bicycle = {new Bicycle("Honda", 2),
                new Bicycle("Yamaha", 2)};


        ServiceStation station = new ServiceStation();
        station.check(car[0]);
        System.out.println();
        station.check(car[1]);
        System.out.println();
        station.check(bicycle[0]);
        System.out.println();
        station.check(bicycle[1]);
        System.out.println();
        station.check(truck[0]);
        System.out.println();
        station.check(truck[1]);

    }
}