package SOLID.DIP.processes;

public abstract class GeneralManufacturingProcess {

    private String processName;

    public GeneralManufacturingProcess(String processName) {
        processName = processName;
    }

    abstract void assembleDevice();

    abstract void testDevice();

    abstract void packageDevice();

    abstract void storeDevice();

    public void launchProcess() {
        if (isProcessDefined()) {
            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("No process was defined, process is aborted!");
        }
    }

    private boolean isProcessDefined() {
        return processName != null && processName.isEmpty();
    }

}
