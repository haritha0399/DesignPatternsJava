package Structural_Design_Patterns.Fascade_DP;

public class Rectangle implements ShapeInterface{
    @Override
    public void draw() {
        System.out.println("This is the Rectangle shape");
    }
}
