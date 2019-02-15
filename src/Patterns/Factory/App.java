package Patterns.Factory;

public class App {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circleShape = factory.getShape(ShapeType.CIRCLE);
        circleShape.draw();

        Shape triangleShape = factory.getShape(ShapeType.TRIANGLE);
        triangleShape.draw();

        Shape squareShape = factory.getShape(ShapeType.SQUARE);
        squareShape.draw();
    }

}
