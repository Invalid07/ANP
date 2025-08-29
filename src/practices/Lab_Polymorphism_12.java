package practices;

class Shape {
    void calculateArea() {
        System.out.println("No area calculated.");
    }
}

class Circle extends Shape {
    void calculateArea(int radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Circle area: " + result);
    }
}

class Rectangle extends Shape {
    void calculateArea(int length, int breadth) {
        int result = length * breadth;
        System.out.println("Rectangle area: " + result);
    }
}

public class Lab_Polymorphism_12 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.calculateArea(5);     // radius = 5
        r.calculateArea(4, 6);  // length=4, breadth=6
    }
}
