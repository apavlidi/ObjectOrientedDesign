package Patterns.Factory;

public enum ShapeType   {

    CIRCLE{
        public Shape getShape(){
            return new Circle();
        }
    },
    SQUARE{
        public Shape getShape(){
            return new Square();
        }
    },
    TRIANGLE{
        public Shape getShape(){
            return new Triangle();
        }
    };

    abstract Shape getShape();
}