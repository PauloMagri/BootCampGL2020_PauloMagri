package modulo8ejercicio4;

public class PropiaClaseExcepcion {
	
	public static void main( String[] args ) {
		
		try {
			throw new MiExcepcion("Esto es una excepcion personalizada");
		} catch (MiExcepcion e) {
			System.out.println(e.getMensaje());
		}
    }

}
