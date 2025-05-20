abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void SquareArea(double side) {
        System.out.println("Area of Square: " + (side * side));
    }

    void CircleArea(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

public class Quest7 {
    public static void main(String[] args) {
        Area area = new Area();
        area.RectangleArea(5, 4);
        area.SquareArea(5);
        area.CircleArea(5);
    }
}
