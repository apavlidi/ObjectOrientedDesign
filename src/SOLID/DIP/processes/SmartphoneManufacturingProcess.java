package SOLID.DIP.processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {

    public SmartphoneManufacturingProcess(String processName){
        super(processName);
    }

    @Override
    void assembleDevice() {
        System.out.println("Assemble Smartphone");
    }

    @Override
    void testDevice() {
        System.out.println("Test Smartphone");
    }

    @Override
    void packageDevice() {
        System.out.println("Package Smartphone");
    }

    @Override
    void storeDevice() {
        System.out.println("Store Smartphone");
    }

}
