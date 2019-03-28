
public class Unit8 {

	public static void main(String[] args) {
		exercise2();
	}
	
	public static void exercise1(){
		System.out.println(gcd(100,200));
	}
	
	public static int gcd(int a, int b) {
		if(a==b) {
			return a;
		} else if(a<b){
			return gcd(a, b-a);
		} else if(a>b) {
			return gcd(a-b, b);
		} else {
			return 1;
		}
	}
	
	public static void exercise2() {
		System.out.println(fib(20));
	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		} else if(n==1) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
}
