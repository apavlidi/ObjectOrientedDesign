package Patterns.DI;

public class App {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(new LargeEngine(400));
        vehicle.crackIgnition();
    }

}
