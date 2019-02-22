package Patterns.Behavioral.Observer.subjects;

import Patterns.Behavioral.Observer.observers.IObserver;

public interface ISubject {

    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();

}
