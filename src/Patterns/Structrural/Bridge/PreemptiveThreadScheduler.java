package Patterns.Structrural.Bridge;

public class PreemptiveThreadScheduler extends ThreadScheduler {

    public PreemptiveThreadScheduler(PlatformScheduler platformScheduler) {
        super(platformScheduler);
    }

    @Override
    void handleSchedule() {
        System.out.println("Handling preemptive thread scheduler");
        platformScheduler.execute();
        platformScheduler.monitor();
    }

}
