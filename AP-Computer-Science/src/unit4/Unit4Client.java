package unit4;

public class Unit4Client {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 2;
		p1.y = 2;
		
		p2.x = 4;
		p2.y = 4;
		
		System.out.println(findSlope(p1,p2));
		System.out.println(findDistance(p1,p2));
		System.out.println(findMidpoint(p1,p2));
		
		Triangle t = new Triangle();
		t.p1 = p1;
		t.p2 = p2;
		t.p3.x = 6;
		t.p3.y  = 6;
		
		System.out.println();
		System.out.println(findPerm(t));
		
	}
	
	public static String findSlope(Point p1, Point p2) {
		return (p2.y - p1.y) + "/" + (p2.x - p1.x);
	}
	
	public static double findDistance(Point p1, Point p2) {
		return (Math.sqrt((p2.x - p1.x)^2 + (p2.y - p1.y)^2));
	}
	
	public static String findMidpoint(Point p1, Point p2) {
		return (p1.x + p2.x)/2 + "," + (p1.y + p2.y)/2;
	}
	
	public static double findPerm(Triangle t) {
		return findDistance(t.p1, t.p2) + findDistance(t.p2, t.p3) + findDistance(t.p3, t.p1);
	}
}