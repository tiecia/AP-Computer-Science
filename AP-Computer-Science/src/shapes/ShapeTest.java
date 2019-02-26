package shapes;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle(10);
		Rectangle r = new Rectangle(5,5);
		System.out.println(c.area());
		System.out.println(c.perimiter());
		System.out.println(r.area());
		System.out.println(r.perimiter());
	}

}
