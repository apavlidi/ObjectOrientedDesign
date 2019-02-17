package Patterns.Singleton.Singleton;

public class SingletonClass {

    private static final SingletonClass INSTANCE = new SingletonClass();
    private static int counter;
    private String randomText;

    private SingletonClass() {
        counter++;
    }

    public synchronized static SingletonClass getInstance() {
        return INSTANCE;
    }

    public int getCounter() {
        return counter;
    }

    public String getRandomText() {
        return randomText;
    }

    public void setRandomText(String randomText) {
        this.randomText = randomText;
    }
}
