package test.java;

import main.java.Circle;
import main.java.Rectangle;
import main.java.Shape;
import main.java.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ShapeTest {
    // testing circle
    @Test
    public void testGetSquareCircle() {
        Shape circle = new Circle(5);
        Assert.assertEquals(78.5f, circle.getSquare(), 0);
    }

    @Test
    public void testGetPerimetrCircle() {
        Shape circle = new Circle(5);
        Assert.assertEquals(32.400002f == circle.getPerimetr(), 0);
    }

    @Test
    public void testGetPerimetrCircleFalse() {
        Shape circle = new Circle(5);
        Assert.assertFalse(32.400002f == circle.getPerimetr());
    }

    //testing rectangle
    @Test
    public void testGetSquareRectangle() {
        Shape rectangle = new Rectangle(5,4);
        Assert.assertEquals(20f, rectangle.getSquare(), 0);
    }

    @Test
    public void testGetPerimetrRectangle() {
        Shape rectangle = new Rectangle(5,4);
        Assert.assertEquals(18f, rectangle.getPerimetr(), 0);
    }

    //testing triangle
    @Test
    public void testGetSquareTriangle() {
        Shape triangle = new Triangle(7, 3, 4, 6);
        Assert.assertEquals(10.5f, triangle.getSquare(), 0);
    }

    @Test
    public void testGetPerimetrTriangle() {
        Shape triangle = new Triangle(7, 3, 4, 6);
        Assert.assertEquals(17f, triangle.getPerimetr(), 0);
    }



}
