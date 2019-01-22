package unit4;

public class Unit4Client {

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.setX(2);
		p1.setY(2);
		
		p2.setX(4);
		p2.setY(4);
		
		Triangle t = new Triangle();
		
		t.p1 = p1;
		t.p2 = p2;
		t.p3.setX(6);
		t.p3.setY(6);
		
		//Client Method Calls
		System.out.println("Slope: " + findSlope(p1,p2));
		System.out.println("Distance Between Lines: " + findDistance(p1,p2));
		System.out.println("Midpoint of Line: " + findMidpoint(p1,p2));
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("Perm of Triangle: " + findPerm(t));
		System.out.println();
		//Point Method Calls
		System.out.println("---------------------------");
		System.out.println();
		System.out.println("Distance to p2: " + p1.distanceTo(t.p2));
		System.out.println("Slope of Line: " + p1.slopeTo(p2));
		System.out.println("Midpoint of Line: " + p1.midpointTo(p2));
		System.out.println("Distance from center: " + p1.distanceFromCenter());
		System.out.println("Quadrant: " + p1.quadrant());
		
		System.out.println(p1.toString());
	}
	
	public static String findSlope(Point p1, Point p2) {
		return (p2.getY() - p1.getY()) + "/" + (p2.getX() - p1.getX());
	}
	
	public static double findDistance(Point p1, Point p2) {
		return (Math.sqrt((p2.getX() - p1.getX())^2 + (p2.getY() - p1.getY())^2));
	}
	
	public static String findMidpoint(Point p1, Point p2) {
		return (p1.getX() + p2.getX())/2 + "," + (p1.getY() + p2.getY())/2;
	}
	
	public static double findPerm(Triangle t) {
		return findDistance(t.p1, t.p2) + findDistance(t.p2, t.p3) + findDistance(t.p3, t.p1);
	}
}