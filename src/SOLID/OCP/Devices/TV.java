package SOLID.OCP.Devices;

public class TV extends Device {

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the TV");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to TV");
    }

    @Override
    public String toString() {
        return "Television";
    }
}
