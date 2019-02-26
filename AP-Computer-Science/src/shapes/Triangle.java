package shapes;

public class Triangle implements Shape {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double area() {
		double s = 0.5 * (a+b+c);
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public double perimiter() {
		return a+b+c;
	}

}
