interface Shape2d {
    abstract double getArea();
}

class SquareTest {
    static class Square implements Shape2d {
        int side;
    
        Square() { this.side = 0; }
        Square(int side) { this.side = side; }
    
        public double getArea() { return side*side; }
    }
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println("Area is: " + s.getArea());        
    }
}