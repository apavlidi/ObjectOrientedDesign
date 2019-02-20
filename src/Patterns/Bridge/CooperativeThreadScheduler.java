package Patterns.Bridge;

public class CooperativeThreadScheduler extends ThreadScheduler{

    public CooperativeThreadScheduler(PlatformScheduler platformScheduler) {
        super(platformScheduler);
    }

    @Override
    void handleSchedule() {
        System.out.println("Handling cooperative thread scheduler");
        platformScheduler.execute();
        platformScheduler.monitor();
    }

}
