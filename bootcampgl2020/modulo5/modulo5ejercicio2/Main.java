package modulo5ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main( String[] args ) {
		
		Heladera heladera = new Heladera();
		Televisor televisor = new Televisor();
		Cafetera cafetera = new Cafetera();
		
		List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		
		electrodomesticos.add(heladera);
		electrodomesticos.add(televisor);
		electrodomesticos.add(cafetera);
		
		for(Electrodomestico electrodomestico : electrodomesticos) {
			electrodomestico.encender();
		}
		
    }

}
