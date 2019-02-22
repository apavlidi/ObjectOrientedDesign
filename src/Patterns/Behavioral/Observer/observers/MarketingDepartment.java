package Patterns.Behavioral.Observer.observers;


public class MarketingDepartment implements IObserver{

    @Override
    public void callMe(String message) {
        System.out.println("Marketing department notified...");
        System.out.println("message: " + message);
    }

}
