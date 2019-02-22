package Patterns.Creational.Factory;

import static Patterns.Creational.Factory.ShapeType.*;

public class App {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circleShape = factory.getShape(CIRCLE);
        circleShape.draw();

        Shape triangleShape = factory.getShape(TRIANGLE);
        triangleShape.draw();

        Shape squareShape = factory.getShape(SQUARE);
        squareShape.draw();
    }

}
