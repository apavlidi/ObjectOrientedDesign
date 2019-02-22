package Patterns.Structrural.Decorator;

public class BasicCalculator implements Calculator {
    @Override
    public int add(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int subtract(int number1, int number2) {
        return number1 - number2;
    }
}
