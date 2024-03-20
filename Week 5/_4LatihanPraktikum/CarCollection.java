package _4LatihanPraktikum;

public class CarCollection {
    Car[] cars;

    CarCollection(Car[] cars) {
        this.cars = cars;
    }
    
    public int maxAcceleration (int left, int right ) {
        if (left == right) {
            return cars[left].top_acceleration;
        }
        
        int mid = left + (right - left) / 2;
        int LeftMaxAcceleration = maxAcceleration(left, mid);
        int RightMaxAcceleration = maxAcceleration(mid + 1, right);

        return Math.max(LeftMaxAcceleration, RightMaxAcceleration);
    }
    
    public int minAcceleration (int left, int right ) {
        if (left == right) {
            return cars[left].top_acceleration;
        }
        
        int mid = left + (right - left) / 2;
        int LeftMinAcceleration = minAcceleration(left, mid);
        int RightMinAcceleration = minAcceleration(mid + 1, right);

        return Math.min(LeftMinAcceleration, RightMinAcceleration);
    }

    public double averageTopPower () {
        int totalPower = 0;
        for (Car car : cars) {
            totalPower += car.top_power;
        }
        double averagePower = (double) totalPower / cars.length;
        
        return averagePower;
    }
}
