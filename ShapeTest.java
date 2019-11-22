import java.io.*;

interface Shape2d {
    abstract double getArea();
}

class Shape implements Shape2d{
    public int x, y;

    public double getArea() {
        return 0;
    }

    @Override
    public String toString() {
        return ("x: " + x + " y: " + y + " getArea: " + getArea());
    }
}

class Rectangle extends Shape {
    Rectangle() {
        x = 0;
        y = 0;
    }

    Rectangle(int length, int breadth) {
        x = length;
        y = breadth;
    }

    public double getArea() {
        return x * y;
    }
}

class Square extends Rectangle {
    Square() {
        x = 0;
        y = 0;
    }

    Square(int side) {
        x = y = side;
    }
}

class Circle extends Square {
    Circle() {
        x = y = 0;
    }

    Circle(int radius) {
        x = y = radius;
    }

    public double getArea() {
        return Math.PI*x*y;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 3);
        Square sq = new Square(6);
        Circle c = new Circle(6);
        System.out.println(rect + "\n" + sq + "\n" + c);

    }
}