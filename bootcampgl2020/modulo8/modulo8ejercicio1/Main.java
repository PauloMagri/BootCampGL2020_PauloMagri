package modulo8ejercicio1;

public class Main {
	
	public static void main( String[] args ) {
		
		
		
		try {
			throw new Exception("Esto es una excepcion");
			
		} catch (Exception e) {
			
			System.out.println("Se produjo una excepcion: " + e.getMessage());
		} finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}
		
    }

}
