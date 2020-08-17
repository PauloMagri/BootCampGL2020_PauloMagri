package main;

public class Main {

	public static void main(String[] args) {
		
		ElectricalOven electricalOven = new ElectricalOven();
		
		System.out.println(electricalOven.getPower());
		
		electricalOven.turnOn();
		System.out.println(electricalOven.getPower());
		electricalOven.turnLed();
		System.out.println(electricalOven.getPower());
		
	}
	
}
