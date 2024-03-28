package combinedassignment4;

abstract class Shape {
	abstract double area();

	abstract double perimeter();
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	double area() {
		return Math.PI * radius * radius;
	}

	double perimeter() {
		return 2 * Math.PI * radius;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double area() {
		return length * width;
	}

	double perimeter() {
		return 2 * (length + width);
	}
}

class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	double area() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	double perimeter() {
		return side1 + side2 + side3;
	}
}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape shapes = new Circle(10);
		System.out.println("Circle Area: " + shapes.area());
		System.out.println("Circle Perimeter: " + shapes.perimeter()+"\n");

		shapes = new Rectangle(5, 10);
		System.out.println("Circle Area: " + shapes.area());
		System.out.println("Circle Perimeter: " + shapes.perimeter()+"\n");

		shapes = new Triangle(3, 3, 3);
		System.out.println("Circle Area: " + shapes.area());
		System.out.println("Circle Perimeter: " + shapes.perimeter()+"\n");

	}
}
