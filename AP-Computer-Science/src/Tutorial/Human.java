package Tutorial;

public class Human {
		
	public int height;
	public int age;
	public String name;
	
	public void printName() {
		System.out.println("Name: " + name);
	}
	
	public void printAge() {
		System.out.println("Age: " + age);
	}
	
	public int addHeightAge() {
		return height + age;
	}
}
