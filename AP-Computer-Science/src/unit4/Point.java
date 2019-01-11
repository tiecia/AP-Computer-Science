package unit4;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		
	}

	public void setX(int inX) {
		x = inX;
	}
	
	public void setY(int inY) {
		y = inY;
	}
	
	public void setX(double inX) {
		x = (int)inX;
	}
	
	public void setY(double inY) {
		y = (int)inY;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double distanceTo(Point p) {
		double d = Math.sqrt((this.x - p.getX())^2 + (this.y - p.getY())^2);
		return d;
	}
	
	public String slopeTo(Point p) {
		return (p.getY() - y) + "/" + (p.getX() - x);
	}
	
	public Point midpointTo(Point p) {
		p.setX((x + p.getX())/2);
		p.setY((y + p.getY())/2);
		return p;
	}
	
	public double distanceFromCenter() {
		return distanceTo(new Point(0,0));	
	}
	
	public int quadrant() {
		if(x > 0 && y > 0) {
			return 1;
		} else if (x > 0 && y < 0) {
			return 2;
		} else if(x < 0 && y < 0) {
			return 3;
		} else if(x < 0 && y > 0) {
			return 4;
		} else {
			return 0;
		}
	}
	
	public boolean equals(Point p) {
		if(x == p.getX() && y == p.getY()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
