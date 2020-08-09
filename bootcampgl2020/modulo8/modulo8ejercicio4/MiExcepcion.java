package modulo8ejercicio4;

public class MiExcepcion extends Exception {

	String mensaje;
	
	public MiExcepcion (String s) {
		this.mensaje = s;
	}
	
	public String getMensaje() {
		return "Se produjo una excepcion: " + mensaje;
	}
	
}
