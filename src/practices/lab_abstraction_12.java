package practices;

// Abstract class Vehicle
abstract class Vehicle {
    // Abstract methods
    abstract void start();
    abstract void stop();
}

// Subclass Car
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key ignition.");
    }

    @Override
    void stop() {
        System.out.println("Car is stopping using hydraulic brakes.");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a kick or button.");
    }

    @Override
    void stop() {
        System.out.println("Bike is stopping using disc brakes.");
    }
}

// Main class to demonstrate
public class lab_abstraction_12 {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();

        System.out.println("=== Car Actions ===");
        myCar.start();
        myCar.stop();

        System.out.println("\n=== Bike Actions ===");
        myBike.start();
        myBike.stop();
    }
}