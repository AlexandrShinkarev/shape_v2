public class Triangle extends Shape implements ShapeCalculation {
    private float a; // ����� ���������
    private float h; //������ � ���������
    private float b; // ������� ������������
    private float c; // ������� ������������

    public Triangle(float a, float h, float b, float c) {
        this.a = a;
        this.h = h;
        this.b = b;
        this.c = c;
    }

    @Override
    public float getSquare() {
        return 0.5f * a * h;
    }

    @Override
    public float getPerimetr() {
        return a + b + c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }
}
