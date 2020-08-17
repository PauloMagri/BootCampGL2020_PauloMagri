package main;

public class ElectricalAppliance {
	
	private int power = 500;
	
	public ElectricalAppliance() {}
	
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}


	public void turnOn() {
		this.power -= 50;
	}

}
