package org.example;

public class App {
    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Circle perimeter: " + c.getPerimeter());

        Rectangle r = new Rectangle(4.0, 6.0);
        System.out.println("\nRectangle area: " + r.getArea());
        System.out.println("Rectangle perimeter: " + r.getPerimeter());
        System.out.println("Rectangle sides: " + r.numberOfSides());

        Square s = new Square(5.0);
        System.out.println("\nSquare area: " + s.getArea());
        System.out.println("Square perimeter: " + s.getPerimeter());
        System.out.println("Square sides: " + s.numberOfSides());

        RightTriangle rt = new RightTriangle(3.0, 4.0);
        System.out.println("\nRightTriangle area: " + rt.getArea());
        System.out.println("RightTriangle perimeter: " + rt.getPerimeter());
        System.out.println("RightTriangle sides: " + rt.numberOfSides());

        IsoscelesRightTriangle iso = new IsoscelesRightTriangle(5.0);
        System.out.println("\nIsoscelesRightTriangle area: " + iso.getArea());
        System.out.println("IsoscelesRightTriangle perimeter: " + iso.getPerimeter());
        System.out.println("IsoscelesRightTriangle sides: " + iso.numberOfSides());
    }
}

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius; // circumference
    }
}

interface Polygon {
    int numberOfSides();
}

class Rectangle extends Shape implements Polygon {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}

class RightTriangle extends Shape implements Polygon {
    protected double legA;
    protected double legB;

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double getArea() {
        return 0.5 * legA * legB;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(legA * legA + legB * legB);
        return legA + legB + hypotenuse;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}


class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    // We do not need to override area/perimeter because
    // they're already correct for a rectangle with equal sides.
}

class IsoscelesRightTriangle extends RightTriangle {
    public IsoscelesRightTriangle(double leg) {
        super(leg, leg);
    }
}
