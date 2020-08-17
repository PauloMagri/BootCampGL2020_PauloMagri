package com.globallogic.bootcamp.patterns;

public class Currency {
	
	private String name;
	private static Currency instance;
	
	private Currency() {
		name = "ARS";
	}

	public static Currency getInstance() {
		if(instance == null)
			instance = new Currency();
		return instance;
	}
}
