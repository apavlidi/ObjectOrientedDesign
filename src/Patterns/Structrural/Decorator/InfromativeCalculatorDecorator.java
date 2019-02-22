package Patterns.Structrural.Decorator;

public class InfromativeCalculatorDecorator extends CalculatorDecorator {

    public InfromativeCalculatorDecorator(BasicCalculator basicCalculator) {
        super(basicCalculator);
    }

    @Override
    public int add(int number1, int number2) {
        System.out.printf("Add calculation to numbers: number1=%d , number2=%d",number1,number2);
       return basicCalculator.add(number1, number2);
    }

    @Override
    public int subtract(int number1, int number2) {
        System.out.printf("Subtract calculation to numbers: number1=%d , number2=%d",number1,number2);
        return super.subtract(number1, number2);
    }
}
