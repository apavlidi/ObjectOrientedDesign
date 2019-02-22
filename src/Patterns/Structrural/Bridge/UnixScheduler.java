package Patterns.Structrural.Bridge;

public class UnixScheduler implements PlatformScheduler {

    @Override
    public void execute() {
        System.out.println("Executing jobs with Unix Scheduler");
    }

    @Override
    public void monitor() {
        System.out.println("Monitoring jobs with Unix Scheduler");
    }

}
