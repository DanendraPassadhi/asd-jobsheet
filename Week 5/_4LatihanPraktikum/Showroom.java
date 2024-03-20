package _4LatihanPraktikum;

public class Showroom {
    public static void main(String[] args) {
        Car[] cars = new Car[8];
        cars[0] = new Car("BMW", "M2 Coupe", 2016, 6816, 728);
        cars[1] = new Car("Ford", "Fiesta ST", 2014, 0, 575);
        cars[2] = new Car("Nissan", "370Z", 2009, 4360, 657);
        cars[3] = new Car("Subaru", "BRZ", 2014, 4058, 609);
        cars[4] = new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        cars[5] = new Car("Toyota", "AE86 Trueno", 1986, 3700, 553);
        cars[6] = new Car("Toyota", "86/GT86", 2014, 4180, 609);
        cars[7] = new Car("Volkswagen", "Golf GTI", 2014, 4180, 631);
    
        CarCollection carCollection = new CarCollection(cars);

        int maxAcceleration = carCollection.maxAcceleration(0, cars.length - 1);
        System.out.println("Top acceleration tertinggi: " + maxAcceleration);

        int minAcceleration = carCollection.minAcceleration(0, cars.length - 1);
        System.out.println("Top acceleration terendah: " + minAcceleration);

        double averagePower = carCollection.averageTopPower();
        System.out.println("Rata-rata top power: " + averagePower);
    }
}
