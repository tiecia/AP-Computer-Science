
public class Unit0 {
	public static void main(String[] args) {
		//System.out.println("Exercise 8");
		//System.out.println();
		//Exercise8();
		top();
		bottom();
		System.out.println();
		bottom();
		line();
		System.out.println();
		top();
		stop();
		bottom();
		System.out.println();
		top();
		line();
		exercise10();
	}
	
	/*public static void Exercise7(){
		System.out.println();
		address();
		System.out.println();
		name();
		System.out.println();
		id();
	}*/
	
	public static void Exercise8() {
		letter();
		System.out.println();
		library();
		System.out.println();
		transcript();
	}
	
	public static void address() {
		System.out.println("905 250th Ave NE\nSammamish, WA");
	}

	public static void name() {
		System.out.println("Tyler Ciapala Hazlerig");
	}
	
	public static void id() {
		System.out.println("107838");
	}
	public static void letter() {
		name();
		address();
	}
	public static void library() {
		name();
		id();
	}
	public static void transcript() {
		name();
		address();
		id();
	}
	public static void top(){
		System.out.println("  ______");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	public static void bottom() {
		System.out.println("\\        /");
		System.out.println(" \\______/");
	}
	public static void stop() {
		System.out.println("|  Stop  |");
	}
	public static void line() {
		System.out.println("+--------+");
	}
	public static void exercise10(){
		/*for(int i = 0; 1<999; i++) {
			System.out.println("All work and no play makes Jack a dull boy.");
		}*/

		layer1();
		
	}
	public static void layer1(){
		layer2();
		layer2();
		layer2();
		layer2();
		layer2();
		layer2();
		layer2();
		layer2();
		layer2();
		layer2();
	}
	
	public static void layer2() {
		layer3();
		layer3();
		layer3();
		layer3();
		layer3();
		layer3();
		layer3();
		layer3();
		layer3();
		layer3();
	}
	public static void layer3() {
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
		System.out.println("All work and no play makes Jack a dull boy.");
	}
}
