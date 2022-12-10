package Chapter13;

public abstract class Rectangle
		extends GeometricShape implements Comparable<Rectangle> {
	private double width;
	private double height;

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this. width = width;
	}
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return 2 * (width * height);
	}
	public int compareTo(ComparableCircle Rectangle2) {
		if (getArea() == Rectangle2.getArea())
			return 1; 
        else return 0;
}
}