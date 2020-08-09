package modulo7ejercicio1;

public interface Animal {
	
	public void dormir();
	
	public void sonidoAnimal();
	
	public default void come(String s) {
		System.out.println("El " + s + " se alimenta");
	}
	
	public static void camina(String s) {
		System.out.println("El " + s + " camina");
	}

}
