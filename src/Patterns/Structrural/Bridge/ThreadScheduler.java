package Patterns.Structrural.Bridge;

public abstract class ThreadScheduler {

    PlatformScheduler platformScheduler;

    public ThreadScheduler(PlatformScheduler platformScheduler) {
        this.platformScheduler = platformScheduler;
    }

    abstract void handleSchedule();

}
