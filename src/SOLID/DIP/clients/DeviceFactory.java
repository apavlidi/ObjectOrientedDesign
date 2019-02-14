package SOLID.DIP.clients;

import SOLID.DIP.processes.GeneralManufacturingProcess;
import SOLID.DIP.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturingProcess = new SmartphoneManufacturingProcess("Nokia 96 S");
        manufacturingProcess.launchProcess();
    }

}
