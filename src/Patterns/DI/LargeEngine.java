package Patterns.DI;

public class LargeEngine implements Engine {

    private int horsePower;

    public LargeEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting large engine with " + horsePower + " horse power");
    }

}
