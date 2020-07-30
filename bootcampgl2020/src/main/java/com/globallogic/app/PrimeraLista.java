package com.globallogic.app;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main( String[] args ) {
		List<String> letters = new ArrayList<String>();
		
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        
        System.out.println("La lista tiene " + letters.size() + "elementos");
        
        letters.set(0, "X");
        
        for(String element: letters) {
        	System.out.println(element);
        }
        
        
    }
}
