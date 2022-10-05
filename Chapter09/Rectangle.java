package Chapter09;

public class Rectangle {
	double width;	// Width of rectangle
	double height;	// Height of rectangle

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	Rectangle() {
		width = 1;
		height = 1;
	} 
	double getArea() {
		return width * height; 
	}
	double getPerimeter() {
		return 2 * (width + height);
	}
}

