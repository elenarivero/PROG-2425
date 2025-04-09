package ejemplos.truck;

public class Base implements Interfaz {
	public int a = 10;
	
	
	public Base() {
		System.out.println("Constructor de Base");
	}
	
	public Base(int a) {
		this();
		this.a = a;
	}
	
	public void methodA() {
		System.out.println("Base - method A");
	}
	
	
	public int getA() {
		return a;
	}
	
}
