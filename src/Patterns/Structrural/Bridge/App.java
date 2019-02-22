package Patterns.Structrural.Bridge;

public class App {

    public static void main(String[] args) {
        ThreadScheduler cooperativeThreadUnixScheduler = new CooperativeThreadScheduler(new UnixScheduler());
        cooperativeThreadUnixScheduler.handleSchedule();

        ThreadScheduler preemptiveThreadWindowsScheduler = new PreemptiveThreadScheduler(new WindowsScheduler());
        preemptiveThreadWindowsScheduler.handleSchedule();
    }

}
