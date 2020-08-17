package main;

public class ElectricalOven extends ElectricalAppliance {
	
	LedAppliance ledAppliance = new LedAppliance();
	
	public ElectricalOven() {}
	
	@Override
	public void turnOn() {
		this.setPower(this.getPower()-75);
	}
	
	public void turnLed() {
		this.setPower(this.getPower()-100);
	}

}
