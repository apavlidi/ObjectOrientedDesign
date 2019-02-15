package Patterns.DependencyInjection;

public class SmallEngine implements Engine {

    private int horsePower;

    public SmallEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        System.out.println("Starting small engine with " + horsePower + " horse power");
    }

}
