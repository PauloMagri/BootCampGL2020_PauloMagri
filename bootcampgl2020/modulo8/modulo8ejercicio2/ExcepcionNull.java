package modulo8ejercicio2;

public class ExcepcionNull {

	private String cadena = "No tiene que null";
	
	public String getCadena() {
		return this.cadena;
	}
	
	public static void main( String[] args ) {
    	
		ExcepcionNull en = null;
		
		try {
			en.getCadena();
		} catch(NullPointerException e) {
			System.out.println("Se produjo una excepcion: null");
		}
		
    }
	
}
