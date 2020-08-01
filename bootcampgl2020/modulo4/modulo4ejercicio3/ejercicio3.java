package modulo4ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
	
public static void main( String[] args ) {
    	
    	Scanner entrada = new Scanner(System.in);
    	
        System.out.println( "Ingreser el total de la compra: " );
        
        double totalCompra = entrada.nextDouble();
        double descuento;
        
        if(totalCompra >= 300 && totalCompra < 350) {
        	descuento = totalCompra * 0.2;
        	System.out.println("El descuento es de: " + descuento);
        } else if(totalCompra >= 350) {
        	descuento = totalCompra * 0.25;
        	System.out.println("El descuento es de: " + descuento);
        } else {
        	System.out.println("Sin descuentos, el total es:" + totalCompra);
        }
    }

}
