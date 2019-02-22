package Patterns.Creational.Factory;

public class ShapeFactory {

    public Shape getShape(ShapeType shapeType){
        return shapeType.getShape();
    }

}
