package Patterns.Structrural.Facade;

public class App {

    private static final int TEMP = 100;
    private static final int COOLING_TEMP = 50;

    public static void main(String[] args) {
        FuelInjector fuelInjector = new FuelInjector();
        AirFlowController airFlowController = new AirFlowController();
        CoolingController coolingController = new CoolingController();

        //starting the engine
        airFlowController.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        coolingController.setTemperatureUpperLimit(COOLING_TEMP);
        coolingController.run();

        //stoping the engine
        fuelInjector.off();
        coolingController.cool(TEMP);
        coolingController.stop();
        airFlowController.off();

        //Using the facade the interface is simplified so the user
        // does not have to know the details of the starting the engine
        CarEgineFacade carEgineFacade = new CarEgineFacade();
        carEgineFacade.startEngine();
        carEgineFacade.stopEngine();
    }
}
