import java.io.*;

class Geometry {
    long area(int length, int breadth) {
        return length*breadth;
    }

    double area(double radius) {
        return (Math.PI*radius*radius);
    }

    double area(double base, double height) {
        return 0.5*base*height;
    }

    long area (int side) {
        return side*side;
    }
}

class GeometryTest {
    public static void main(String args[]) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        Geometry g = new Geometry();
        System.out.println("Enter two numbers: ");
        int a = Integer.parseInt(bReader.readLine());
        int b = Integer.parseInt(bReader.readLine());
        System.out.println("Area of Rectangle: " + g.area(a,b));
        System.out.println("Area of Square: " + g.area(a));
        System.out.println("Area of Triangle: " + g.area((float)a, (float)b));
        System.out.println("Area of Circle: " + g.area((float)a));
    }
}