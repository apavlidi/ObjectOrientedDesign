package Patterns.Singleton;

public class SingletonClass {

    private static SingletonClass INSTANCE = null;
    private static int counter;
    private String randomText;

    private SingletonClass() {
        counter++;
    }

    public static SingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }
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
