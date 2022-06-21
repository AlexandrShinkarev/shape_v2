public class Rectangle extends Shape implements ShapeCalculation {
    private float a; //длина
    private float b; //ширина

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public float getSquare() {
        return a * b;
    }

    @Override
    public float getPerimetr() {
        return 2 * (a + b);
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
