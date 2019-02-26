package shapes;

public class Circle implements Shape{
	
	private double radius = 10;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double perimiter() {
		return 2*Math.PI*radius;
	}
	
}
