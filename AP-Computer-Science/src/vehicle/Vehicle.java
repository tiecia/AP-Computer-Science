package vehicle;

public class Vehicle extends Driver{
	
	private int speed;
	
	public void start() {
		System.out.println("Started");
	}
	
	public void stop() {
		System.out.println("Stopped");
	}
	
	public void turn() {
		System.out.println("Turning");
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void increaseSpeed(int amount) {
		this.speed += amount;
	}
	
	public void decreaseSpeed(int amount) {
		this.speed -= amount;
	}
}