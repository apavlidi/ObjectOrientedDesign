package Patterns.Creational.Singleton.LazySingleton;

public class LazySingletonClass {

    private static LazySingletonClass INSTANCE = null;
    private static int counter;
    private String randomText;

    private LazySingletonClass() {
        counter++;
    }

    public synchronized static LazySingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingletonClass();
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
