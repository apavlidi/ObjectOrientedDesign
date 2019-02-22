package Patterns.Structrural.Decorator;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new InfromativeCalculatorDecorator(new BasicCalculator());
        System.out.println(calculator.add(1, 3));
        System.out.println(calculator.subtract(1, 3));
    }

}
