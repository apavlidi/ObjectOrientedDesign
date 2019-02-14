package SOLID.OCP.Devices;

public class Projector extends Device {

    @Override
   public void turnOff() {
        System.out.println("Turning off the projector");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the projector");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to projector");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
