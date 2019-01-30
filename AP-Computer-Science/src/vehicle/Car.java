package vehicle;

public class Car extends Vehicle{
	
	private static int plateCount = 1;
	
	private int maxSpeed = 75;
	private int gasMileage = 22;
	private int weight = 500;
	
	public Car() {
		super("C" + plateCount);
		plateCount+=2;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public int getGasMileage() {
		return gasMileage;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	

	public void openTrunk() {
		System.out.println("Trunk Opened");
	}
	
	public void closeTrunk() {
		System.out.println("Trunk Closed");
	}
}
