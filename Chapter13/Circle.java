package Chapter13;

public abstract class Circle
		extends GeometricShape {
	private double radius;
    private double radius2;
    private java.util.Date dateCreated;

	public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }
	public double getArea() {
		return (radius * radius) * Math.PI;
	}
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    @Override 
        (radius.equals(radius2.circle2)) {
            radius = radius2;
        }

}
