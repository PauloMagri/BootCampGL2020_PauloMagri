package test.ejercicio1_1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ElectricalOven;

class ElectricalOvenTest {
	
	@Test
	void test() {
		ElectricalOven electricalOven = new ElectricalOven();
		
		electricalOven.turnOn();
		assertEquals(425, electricalOven.getPower());
		
		electricalOven.turnLed();
		assertEquals(325, electricalOven.getPower());
	}

}
