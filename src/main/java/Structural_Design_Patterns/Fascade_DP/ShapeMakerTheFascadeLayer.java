package Structural_Design_Patterns.Fascade_DP;

public class ShapeMakerTheFascadeLayer {
    private ShapeInterface circle;
    private ShapeInterface rectangle;

    ShapeMakerTheFascadeLayer(){
        circle = new Circle();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }
}
