package shapes;

public class Rectangle implements Shape{
	
	private int height;
	private int width;
	
	public Rectangle(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public double area() {
		return height*width;
	}
	
	public double perimiter() {
		return (height*2) + (width*2);
	}

}
