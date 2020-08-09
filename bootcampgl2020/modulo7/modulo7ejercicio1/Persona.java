package modulo7ejercicio1;

public interface Persona {
	
	public void hablar();
	
	public void dormir();
	
	public default void come(String s) {
		System.out.println("El " + s + " se alimeta");
	}
}
