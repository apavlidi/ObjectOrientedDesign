package SOLID.OCP.Devices;

public class SurroundSoundSystem extends Device {
    @Override
    public void turnOff() {
        System.out.println("Turning off the SurroundSoundSystem");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on the SurroundSoundSystem");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to SurroundSoundSystem");
    }

    @Override
    public String toString() {
        return "SurroundSoundSystem";
    }

}
