package Patterns.Structrural.Decorator;

public abstract class CalculatorDecorator implements Calculator {
    protected BasicCalculator basicCalculator;

    public CalculatorDecorator(BasicCalculator basicCalculator) {
        this.basicCalculator = basicCalculator;
    }

    @Override
    public int add(int number1, int number2) {
        return basicCalculator.add(number1, number2);
    }

    @Override
    public int subtract(int number1, int number2) {
        return basicCalculator.subtract(number1, number2);
    }
}
