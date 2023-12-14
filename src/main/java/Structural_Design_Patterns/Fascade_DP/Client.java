package Structural_Design_Patterns.Fascade_DP;

public class Client extends ShapeMakerTheFascadeLayer{

    public static void main(String args[]) {
        ShapeMakerTheFascadeLayer fas = new ShapeMakerTheFascadeLayer();

        fas.drawCircle();

        fas.drawRectangle();

    }

}
