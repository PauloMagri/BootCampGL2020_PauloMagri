package modulo5ejercicio1;

public class Main {

	public static void main( String[] args ) {
		Electrodomestico electrodomestico = new Electrodomestico("Whirlpool", 12.5, 'A', "Blanco");
		Heladera heladera = new Heladera("Gafa", 10.5, 'A', "Blanco", 12, true, 6);
		
		electrodomestico.encender();
		electrodomestico.apagar();
		System.out.println(electrodomestico.getMarca());
		System.out.println(electrodomestico.getPeso());
		System.out.println(electrodomestico.getConsumo());
		System.out.println(electrodomestico.getColor());
		
		heladera.encender();
		heladera.apagar();
		System.out.println(heladera.getMarca());
		System.out.println(heladera.getPeso());
		System.out.println(heladera.getConsumo());
		System.out.println(heladera.getColor());
		System.out.println(heladera.getCapacidad());
		System.out.println(heladera.isTieneFreezer());
		System.out.println(heladera.getCapacidadFreezer());
			
		
    }
}
