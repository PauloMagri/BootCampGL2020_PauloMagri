package modulo7ejercicio1;

public class Hombre implements Animal, Persona{
	
	public void dormir() {
		System.out.println("El hombre duerme muchas horas");
	}
	
	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonidos de animal");
	}
	
	public void hablar() {
		System.out.println("Las personas hablan mucho");
	}

	@Override
	public void come(String s) {
		Animal.super.come(s);
	}
	
	public static void main( String[] args ) {
		
		Hombre hombre = new Hombre();
		
		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		hombre.come("hombre");
		
    }
	

}
