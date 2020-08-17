package main;

public class LedAppliance {

	ElectricalAppliance electricalAppliance = new ElectricalAppliance();
	
	public void turnOn() {
		electricalAppliance.setPower(electricalAppliance.getPower()-100);
	}
}
