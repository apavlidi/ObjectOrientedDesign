package Patterns.DependencyInjection;

public class Vehicle {

    Engine engine;

    public Vehicle(Engine engine) {
        this.engine = engine;
    }

    public void crackIgnition() {
        engine.startEngine();
        System.out.println("Vehicle is ready to start");
    }

}
