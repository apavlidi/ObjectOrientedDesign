package Patterns.Structrural.Facade;

public class CoolingController {

    public void setTemperatureUpperLimit(int temperature) {
        System.out.printf("Cooling controller temperature is at %d temperature",temperature);
    }

    public void run() {
        System.out.println("Cooling controller is enabled");
    }

    public void cool(int temperature) {
        System.out.printf("Cooling controller cooling to %d temperature",temperature);
    }

    public void stop() {
        System.out.println("Cooling controller is stopped");
    }
}
