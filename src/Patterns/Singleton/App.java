package Patterns.Singleton;

public class App {

    public static void main(String[] args) {


        SingletonClass singleton1 = SingletonClass.getInstance();
        SingletonClass singleton2 = SingletonClass.getInstance();
        SingletonClass singleton3 = SingletonClass.getInstance();
        SingletonClass singleton4 = SingletonClass.getInstance();
        SingletonClass singleton5 = SingletonClass.getInstance();

        System.out.println(singleton1.getCounter());
        System.out.println(singleton3.getCounter());
        System.out.println(singleton5.getCounter());

        singleton2.setRandomText("Text inserted from singleton 2");
        System.out.println("Printing text from singleton2 variable: " + singleton2.getRandomText());

        singleton3.setRandomText("Text inserted from singleton 3");
        System.out.println("Printing text from singleton3 variable: " + singleton3.getRandomText());

        System.out.println("Printing text from singleton2 variable: " + singleton2.getRandomText());

    }
}
