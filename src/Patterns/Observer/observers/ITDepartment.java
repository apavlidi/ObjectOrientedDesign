package Patterns.Observer.observers;


public class ITDepartment implements IObserver {

        @Override
        public void callMe(String message) {
            System.out.println("IT department notified...");
            System.out.println("message: " + message);
        }

}
