package ejemplos;

public interface Sonido {

	void voz();
	
	default void dormir() {
		System.out.println("Zzzz");
	}
}
