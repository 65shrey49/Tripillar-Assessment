package Assessment2.module4;

// Interface
interface vehicle {
    void start();   // abstract method
}

// Class implementing the interface
class Car implements vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }
}

// Another class implementing the interface
class Bike implements vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        vehicle v1 = new Car();
        vehicle v2 = new Bike();

        v1.start();
        v2.start();
    }
}
