package main.java;

public class Circle extends Shape implements ShapeCalculation {
    private final float pi = 3.14f;
    private float r; // радиус

    public Circle(float r) {
        this.r = r;
    }


    @Override
    public float getSquare() {
        return pi * (r * r);
    }

    public float getPerimetr() {
        return 2f * pi * r;
    }

    public float getPi() {
        return pi;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
}
