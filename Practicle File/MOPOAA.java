class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class AreaCalculator {
    double calculateArea(Circle circle) {
        return Math.PI * circle.radius * circle.radius;
    }
    double calculateArea(Rectangle rectangle) {
        return rectangle.length * rectangle.width;
    }
}
public class MOPOAA {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Area of Circle: " + calculator.calculateArea(circle));
        System.out.println("Area of Rectangle: " + calculator.calculateArea(rectangle));
    }
}
