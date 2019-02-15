package Patterns.Observer.clients;

import Patterns.Observer.observers.IObserver;
import Patterns.Observer.observers.ITDepartment;
import Patterns.Observer.observers.MarketingDepartment;
import Patterns.Observer.subjects.MessageManagerSystem;

public class App {

    public static void main(String[] args) {

        IObserver itDepartment = new ITDepartment();
        IObserver marketingDepartment = new MarketingDepartment();

        MessageManagerSystem messageManagerSystem = new MessageManagerSystem();

        messageManagerSystem.registerObserver(itDepartment);
        messageManagerSystem.registerObserver(marketingDepartment);

        messageManagerSystem.publishAnnouncement("A new announcement has been published");
    }

}
