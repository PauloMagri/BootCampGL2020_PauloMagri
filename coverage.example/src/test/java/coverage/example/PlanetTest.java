package coverage.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coverage.example.model.Planet;

class PlanetTest {
	
	Planet planet;
	
	@BeforeEach
	void init() {
		planet = new Planet(); 
		planet.setName("Tierra");
	}

	@Test
	void toStringTest() {
		assertEquals("Planet [name=Tierra]", planet.toString());
	}
	
	@Test
	void getNameTest() {
		assertEquals("Tierra", planet.getName());
	}
	
	@Test
	void setNameTest() {
		planet.setName("Marte");
		
		assertEquals("Marte", planet.getName());
	}

}
