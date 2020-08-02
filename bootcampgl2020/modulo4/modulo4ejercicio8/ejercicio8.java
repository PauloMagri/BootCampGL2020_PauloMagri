package modulo4ejercicio8;

public class ejercicio8 {
	
public static void main( String[] args ) {
    	
    	int valor = 1;
    	
    	while(valor <= 50) {
    		if(valor % 2 == 0) {
    			System.out.println( "Valor iterado " + valor + " par" );
    		} else {
    			System.out.println( "Valor iterado " + valor + " impar" );
    		}
    		valor ++;
    	}
    }

}
