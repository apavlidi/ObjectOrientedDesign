package Patterns.Behavioral.Observer.clients;

import Patterns.Behavioral.Observer.observers.IObserver;
import Patterns.Behavioral.Observer.observers.ITDepartment;
import Patterns.Behavioral.Observer.observers.MarketingDepartment;
import Patterns.Behavioral.Observer.subjects.MessageManagerSystem;

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
