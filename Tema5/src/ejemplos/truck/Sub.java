package ejemplos.truck;

import java.util.List;

public class Sub extends Base implements Interfaz2{
	public int a = 20;
	
	public Sub() {
		System.out.println("Constructor de Sub");
	}
	
	public void methodA() {
		System.out.println("Sub - methodA");
	}
	
	public void methodB() {
		System.out.println("Sub - methodB");
	}
	
	@Override
	public int getA() {
		return a;
	}
	
	public static void main(String[] args) {
		
		Base b = new Sub();
		
		if(b instanceof Base) {
			System.out.println("Es de tipo Base");
		}
		
		if(b instanceof Sub) {
			System.out.println("Es de tipo Sub");
		}
		
		if(b instanceof Interfaz) {
			System.out.println("Es de tipo Interfaz");
		}
		
		if(b instanceof Interfaz2) {
			System.out.println("Es de tipo Interfaz 2");
		}
		
		if(b instanceof List) {
			System.out.println("Es de tipo SubSub");
		}
	}
}
