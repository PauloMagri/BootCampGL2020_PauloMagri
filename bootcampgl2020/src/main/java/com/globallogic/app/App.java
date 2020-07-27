package com.globallogic.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	int contador = 0;
    	for(int i=1; i<=10000; i++) {
    		if (i % 20 == 0) {
    			contador ++;
    		}
    	}
        System.out.println( "Valor final del contador: " + contador );
    }
}
