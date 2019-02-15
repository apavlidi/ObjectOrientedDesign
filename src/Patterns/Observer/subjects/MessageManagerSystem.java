package Patterns.Observer.subjects;

import Patterns.Observer.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

public class MessageManagerSystem implements ISubject {

    private String message;
    private List<IObserver> observers;

    public MessageManagerSystem() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver addObserver) {
        observers.add(addObserver);
    }

    @Override
    public void removeObserver(IObserver removeObserver) {
        observers.remove(removeObserver);
    }

    public void publishAnnouncement(String message) {
        this.message = message;
        notifyObservers();
    }

    public void notifyObservers() {
        for (IObserver department : observers) {
            department.callMe(message);
        }
    }

}