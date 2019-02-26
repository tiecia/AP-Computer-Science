package vehicle;

public class Truck extends Vehicle {
	
	private static int plateCount = 2;
	
	private int maxSpeed = 60;
	private int gasMileage = 10;
	private int weight = 1500;
	
	public Truck() {
		super("T" + plateCount);
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
	
	public void openTailgate() {
		System.out.println("Tailgate Opened");
	}
	
	public void closeTailgate() {
		System.out.println("Tailgate Closed");
	}
	
	public void setSpeed(int speed) {
		if(speed <= 75) {
			super.setSpeed(speed);
		} else {
			System.out.println("Speed is limited to 75");
		}
	}
}
