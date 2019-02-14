package SOLID.DI.clients;

import SOLID.DI.processes.GeneralManufacturingProcess;
import SOLID.DI.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {

    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturingProcess = new SmartphoneManufacturingProcess("Nokia 96 S");
        manufacturingProcess.launchProcess();
    }

}
