package modulo8ejercicio3;

public class ExcepcionIndiceFueraDeLimite {
	
	

	public static void main( String[] args ) {
    	
		try {
			int[] enteros = {1, 2};
			System.out.println(enteros[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Excepción: índice de array fuera de límites");
		}
		
    }
}
