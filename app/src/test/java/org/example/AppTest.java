package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCircle() {
        Circle c = new Circle(5.0);
        assertEquals(Math.PI * 25, c.getArea(), 0.0001);
        assertEquals(Math.PI * 10, c.getPerimeter(), 0.0001);
    }

    @Test
    public void testRectangle() {
        Rectangle r = new Rectangle(4.0, 6.0);
        assertEquals(24.0, r.getArea(), 0.0001);
        assertEquals(20.0, r.getPerimeter(), 0.0001);
        assertEquals(4, r.numberOfSides());
    }

    @Test
    public void testSquare() {
        Square s = new Square(5.0);
        assertEquals(25.0, s.getArea(), 0.0001);
        assertEquals(20.0, s.getPerimeter(), 0.0001);
        assertEquals(4, s.numberOfSides());
    }

    @Test
    public void testRightTriangle() {
        RightTriangle rt = new RightTriangle(3.0, 4.0);
        // area = 0.5 * 3 * 4 = 6.0
        assertEquals(6.0, rt.getArea(), 0.0001);
        assertEquals(12.0, rt.getPerimeter(), 0.0001);
        assertEquals(3, rt.numberOfSides());
    }

    @Test
    public void testIsoscelesRightTriangle() {
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(5.0);
        // area = 0.5 * 5 * 5 = 12.5
        assertEquals(12.5, irt.getArea(), 0.0001);
        double expected = 10 + Math.sqrt(50);
        assertEquals(expected, irt.getPerimeter(), 0.0001);
        assertEquals(3, irt.numberOfSides());
    }
}
