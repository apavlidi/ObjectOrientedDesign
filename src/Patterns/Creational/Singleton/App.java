package Patterns.Creational.Singleton;

import Patterns.Creational.Singleton.MonoState.MonoState;
import Patterns.Creational.Singleton.Singleton.SingletonClass;

public class App {

    public static void main(String[] args) {


        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();

        System.out.println(singleton1.getCounter());
        System.out.println(singleton2.getCounter());

        singleton1.setRandomText("Text inserted from singleton 1");
        System.out.println("Printing text from singleton1 variable: " + singleton1.getRandomText());

        singleton2.setRandomText("Text inserted from singleton 2");
        System.out.println("Printing text from singleton2 variable: " + singleton2.getRandomText());

        System.out.println("\nAfter chaning singleton2 var, singleton1 var should have the same value");
        System.out.println("Printing text from singleton1 variable: " + singleton1.getRandomText());


        //MonoState not recommended but for the shake of completion
        System.out.println();
        MonoState monoState = new MonoState();
        monoState.setText("random");

        MonoState monoState2 = new MonoState();
        monoState.setText("Not random");

        System.out.println("MonoState variable 1 : " + monoState.getText());
        System.out.println("MonoState variable 2 : " + monoState2.getText());
    }
}
