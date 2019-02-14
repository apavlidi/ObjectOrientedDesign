package SOLID.OCP.Control;


import SOLID.OCP.Devices.Device;

public class RemoteControl {

    private Device connectedDevice;
    private static RemoteControl INSTANCE = new RemoteControl();

    private RemoteControl() {
    }

    public static RemoteControl getInstance(){
        return INSTANCE;
    }

    public void connectToDevice(Device deviceToBeConnected) {
        connectedDevice = deviceToBeConnected;
        System.out.println("connecting to " + deviceToBeConnected);
    }

    public void clickOnButton(Device device) {
        System.out.println("Turning on the " + device);
        device.turnOn();
    }

    public void clickOffButton(Device device) {
        System.out.println("Turning off the " + device);
        device.turnOff();
    }
}
