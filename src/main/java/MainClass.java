package main.java;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("������� ����� �����: " + circle.getSquare());
        System.out.println("�������� ����� �����: " + circle.getPerimetr());

        Shape rectangle = new Rectangle(5,4);
        System.out.println("������� �������������� �����: " + rectangle.getSquare());
        System.out.println("�������� �������������� �����: " + rectangle.getPerimetr());

        Shape triangle = new Triangle(7,3,4,6);
        System.out.println("������� ����������� �����: " + triangle.getSquare());
        System.out.println("�������� ����������� �����: " + triangle.getPerimetr());
    }
}
