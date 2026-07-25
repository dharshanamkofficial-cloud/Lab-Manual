interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return Math.PI * r * r;
    }
}

class Rectangle implements Shape {
    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    public double calculateArea() {
        return l * w;
    }
}

class Triangle implements Shape {
    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double calculateArea() {
        return 0.5 * b * h;
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(5);
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(3, 8);

        System.out.println("----- Shape Area Calculator -----\n");

        System.out.println("Circle:");
        System.out.println("Radius = 5.0");
        System.out.println("Area of Circle = " + c.calculateArea());

        System.out.println("\nRectangle:");
        System.out.println("Length = 4.0, Width = 6.0");
        System.out.println("Area of Rectangle = " + r.calculateArea());

        System.out.println("\nTriangle:");
        System.out.println("Base = 3.0, Height = 8.0");
        System.out.println("Area of Triangle = " + t.calculateArea());
    }
}
