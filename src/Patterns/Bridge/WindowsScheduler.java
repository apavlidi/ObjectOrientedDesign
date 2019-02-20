package Patterns.Bridge;

public class WindowsScheduler implements PlatformScheduler {

    @Override
    public void execute() {
        System.out.println("Executing tasks with Windows Scheduler");
    }

    @Override
    public void monitor() {
        System.out.println("Monitoring tasks with Windows Scheduler");
    }

}
