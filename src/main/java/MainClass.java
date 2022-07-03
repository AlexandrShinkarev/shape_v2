package main.java;

public class MainClass {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Площадь круга равна: " + circle.getSquare());
        System.out.println("Периметр круга равен: " + circle.getPerimetr());

        Shape rectangle = new Rectangle(5,4);
        System.out.println("Площадь прямоугольника равна: " + rectangle.getSquare());
        System.out.println("Периметр прямоугольника равен: " + rectangle.getPerimetr());

        Shape triangle = new Triangle(7,3,4,6);
        System.out.println("Площадь тругольника равна: " + triangle.getSquare());
        System.out.println("Периметр тругольника равен: " + triangle.getPerimetr());
    }
}
