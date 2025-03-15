class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
    }
}

class Car extends Vehicle {
    String model;
    boolean hasAirConditioning;

    Car(String brand, int wheels, String model, boolean hasAirConditioning) {
        super(brand, wheels);
        this.model = model;
        this.hasAirConditioning = hasAirConditioning;
    }

    void displayCarFeatures() {
        displayDetails();
        System.out.println("Model: " + model);
        System.out.println("Air Conditioning: " + (hasAirConditioning ? "Yes" : "No"));
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4, "Corolla", true);
        car.displayCarFeatures();
    }
}
