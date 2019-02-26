package vehicle;

public class Driver {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Driver d = new Driver();
//		Driver d2 = new Driver();
//		Vehicle v = new Vehicle();
		Truck t = new Truck();
		Truck t2 = new Truck();
		Car c = new Car();
		Car c2 = new Car();
//		
////		d.setSpeed(35);		These do not work because Driver is the superclass to everything and it does not inherit any methods from child classes.
////		d.getSpeed();
////		d.openTrunk();
////		d.closeTrunk();
////		d.turn();
////		d.stop();
//		
//		v.setSpeed(35);
//		v.getSpeed();
////		v.openTrunk(); 		These do not work because Vehicle is the superclass of Truck and Car that means it can access any of its own methods but none of its chile methods.
////		v.closeTrunk();
//		v.turn();
//		v.stop();
//		
//		t.setSpeed(35);
//		t.getSpeed();
////		t.openTrunk();		These do not work because they are part of the Car class and the Truck class does not inherit anything from the Car class.
////		t.closeTrunk();
//		t.turn();
//		t.stop();
//		
//		c.setSpeed(35);
//		c.getSpeed();
//		c.openTrunk();
//		c.closeTrunk();
//		c.turn();
//		c.stop();
		
		System.out.println(t.getPlate());
		System.out.println(t2.getPlate());
		
		System.out.println();
		
		System.out.println(c.getPlate());
		System.out.println(c2.getPlate());
		
		t.setSpeed(60);
		System.out.println(t.getSpeed());
		
	}
}
