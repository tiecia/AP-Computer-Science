package vehicle;

public class Car extends Vehicle{
	
	@SuppressWarnings("unused")
	private static int plateCount = 1;
	
	public Car() {
		super("C" + plateCount);
		plateCount+=2;
	}

	public void openTrunk() {
		System.out.println("Trunk Opened");
	}
	
	public void closeTrunk() {
		System.out.println("Trunk Closed");
	}
}
