package modulo5ejercicio3;

public class MainGato {
	
public static void main( String[] args ) {
    	
		Gato gato = new Gato();
		
		gato.setNombre("Ruby");
		gato.setPatas(4);
		
		System.out.println(gato.getNombre() + " tiene " + gato.getPatas() + " patas");
		
    }

}
