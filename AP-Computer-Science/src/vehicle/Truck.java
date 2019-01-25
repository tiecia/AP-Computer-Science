package vehicle;

public class Truck extends Vehicle {
	
	private static int plateCount = 2;
	
	public Truck() {
		super("T" + plateCount);
		plateCount+=2;
	}
	
	public void openTailgate() {
		System.out.println("Tailgate Opened");
	}
	
	public void closeTailgate() {
		System.out.println("Tailgate Closed");
	}
}
