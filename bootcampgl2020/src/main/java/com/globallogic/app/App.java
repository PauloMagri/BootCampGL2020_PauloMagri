package com.globallogic.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    	Scanner entrada = new Scanner(System.in);
    	
    	System.out.println( "Ingrese una letra: " );
    	
    	char valor = entrada.nextLine().charAt(0);
    	
        
        
        if(Character.isUpperCase(valor)) {
        	System.out.println( "Es una letra mayuscula" );
        }else {
        	System.out.println( "No es una letra mayuscula" );
        }
        
        
    }
}
