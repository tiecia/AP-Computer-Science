package Tutorial;

public class Client {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.age = 4;
		h1.height = 4;
		h1.name = "Gabe";
		
		
		h2.age = 7;
		h2.height = 5;
		h2.name = "Mike";
		
		h1.printName();
		h1.printAge();
		
		System.out.println();
		
		h2.printName();
		h2.printAge();
		
		System.out.println();
		
		h1.name = "Matthew";
		
		h1.printName();
		h1.printAge();
	}
		
}
