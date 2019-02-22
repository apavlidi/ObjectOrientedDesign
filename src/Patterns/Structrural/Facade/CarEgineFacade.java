package Patterns.Structrural.Facade;

public class CarEgineFacade {

    private static int DEFAULT_COOLING_TEMP = 90;
    private static int MAX_ALLOWED_TEMP = 50;
    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlowController airFlowController = new AirFlowController();
    private CoolingController coolingController = new CoolingController();

    public void startEngine(){
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
        coolingController.run();
    }

    public void stopEngine() {
        fuelInjector.off();
        coolingController.cool(MAX_ALLOWED_TEMP);
        coolingController.stop();
        airFlowController.off();
    }
}
